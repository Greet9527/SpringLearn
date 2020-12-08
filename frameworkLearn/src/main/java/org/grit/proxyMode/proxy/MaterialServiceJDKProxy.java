package org.grit.proxyMode.proxy;

import org.grit.proxyMode.service.IMaterialService;

//注意引入jdk自带的包。不要引入spring的包
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class MaterialServiceJDKDynamicProxy implements InvocationHandler {
    //目标对象
    private IMaterialService target;

    public MaterialServiceJDKDynamicProxy(IMaterialService target){
        this.target=target;
    }

    /*
    *
    * 代理方法，每次调用目标方法时都会执行
    * */
    @Override
    public Object invoke(Object o, Method method, Object[] args) throws Throwable {
        //TODO 调用前增强
        before();
        Object invoke = method.invoke(target, args);

        //TODO 调用后增强
        return invoke;
    }

    /**
     * 前置增强
     */
    private void before() {
        System.out.println("invoke before :对物料进行验证.");
    }
}
