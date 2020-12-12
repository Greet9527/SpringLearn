package org.grit.proxyMode.proxy;

//注意引入spring cglib包或者手动引入cglib包
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public class MaterialServiceCglibProxy implements MethodInterceptor {

    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {

        before(method.getName());
        Object res;
        try {
            res= methodProxy.invokeSuper(o, objects);
        }catch (Exception exception){
            doException(method.getName(), exception);
            return null;
        }
        after(method.getName());
        return res;
    }


    /**
     * 前置增强
     */
    private void before(String method) {
        System.out.println(this.getClass().getName()+"."+ method+" invoke before :对物料进行验证.");
    }

    /**
     *后置增强
     */
    private void after(String method){
        System.out.println(this.getClass().getName()+"."+ method+" invoke after.");
    }

    /**
     * 异常增强
     * */
    private void doException(String method,Exception exception){
        System.out.println(this.getClass().getName()+"."+ method+" invoke after exception :"+exception.getMessage());
    }
}
