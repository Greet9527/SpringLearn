package org.grit.aspects.joinPoints;


import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.reflect.MethodSignature;
import org.grit.aspects.annotations.AnnotationMethodPoint;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;

@Aspect
@Component
public class AnnotationMethodJoinCut {

    @Before("@annotation(org.grit.aspects.annotations.AnnotationMethodPoint)")
    public void doBefore(JoinPoint joinPoint) throws NoSuchMethodException {
        System.out.println("doBefore===================================");
        Object target = joinPoint.getTarget();
        MethodSignature signature =(MethodSignature)joinPoint.getSignature();
        Method declaredMethod = target.getClass().getDeclaredMethod(signature.getName(),signature.getParameterTypes());
        AnnotationMethodPoint annotation = declaredMethod.getAnnotation(AnnotationMethodPoint.class);
        String msg = annotation.msg();

        Object[] args = joinPoint.getArgs();
        String[] parameterNames = signature.getParameterNames();
        Class[] parameterTypes = signature.getParameterTypes();

        for (int i = 0; i < args.length; i++) {
            System.out.println("参数 index:" + i + " 类型：" + parameterTypes[i] + " 值：" + args[i]);
        }
        System.out.println("msg:" + msg);

        System.out.println("doBefore end===================================");
    }

    @Around("@annotation(org.grit.aspects.annotations.AnnotationMethodPoint)")
    public void doRound(ProceedingJoinPoint proceedingJoinPoint) throws NoSuchMethodException {
        //获取目标对象
        Object target = proceedingJoinPoint.getTarget();
        //获取方法签名
        MethodSignature signature =(MethodSignature) proceedingJoinPoint.getSignature();
        //通过目标对象和方法签名 获取到方法
        Method method = target.getClass().getMethod(signature.getName(),signature.getParameterTypes());
        Class[] parameterTypes = signature.getParameterTypes();
        String[] parameterNames = signature.getParameterNames();
        Object[] args = proceedingJoinPoint.getArgs();
        for (int i = 0; i < parameterNames.length; i++) {
            System.out.println("参数 index:" + i + " 类型：" + parameterTypes[i] + " 值：" + args[i]);
        }
        //通过Method 获取方法上的注解对象
        AnnotationMethodPoint annotation = method.getAnnotation(AnnotationMethodPoint.class);
        String msg = annotation.msg();
        System.out.println("注解msg" + msg);
    }


}
