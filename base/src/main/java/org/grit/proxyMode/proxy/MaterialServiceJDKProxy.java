package org.grit.proxyMode.proxy;

import org.grit.proxyMode.service.IMaterialService;

//注意引入jdk自带的包。不要引入spring的包
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class MaterialServiceJDKProxy implements InvocationHandler {
    //目标对象
    private IMaterialService target;

    public MaterialServiceJDKProxy(IMaterialService target){
        this.target=target;
    }

    /*
    *
    * 代理方法，每次调用目标方法时都会执行
    * */
    @Override
    public Object invoke(Object o, Method method, Object[] args) throws Throwable {
        // 调用前增强
        before(method.getName());
        Object res;
        try {
             res = method.invoke(target, args);
        }catch (Exception exception)
        {
            doException(method.getName(),exception);
            return null;
        }
        // 调用后增强
        after(method.getName());
        return res;
    }

    /**
     * 前置增强
     */
    private void before(String method) {
        System.out.println(this.getClass().getName()+"."+ method+" invoke before :对物料进行验证.");
    }

    /*
    * 后置增强
    *
    * */
    private void after(String method){
        System.out.println(this.getClass().getName()+"."+ method+" invoke after.");
    }

    /*
    * 异常处理增强
    * */
    private void doException(String method,Exception exception){
        System.out.println(this.getClass().getName()+"."+ method+" invoke after exception :"+exception.getMessage());
    }
}
