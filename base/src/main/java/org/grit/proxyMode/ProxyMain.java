package org.grit.proxyMode;

import org.grit.proxyMode.beans.Material;
import org.grit.proxyMode.proxy.MaterialServiceCglibProxy;
import org.grit.proxyMode.proxy.MaterialServiceJDKProxy;
import org.grit.proxyMode.service.IMaterialService;
import org.grit.proxyMode.service.MaterialServiceImpl;
import org.springframework.asm.ClassWriter;
import org.springframework.cglib.core.DebuggingClassWriter;
import org.springframework.cglib.proxy.Callback;
import org.springframework.cglib.proxy.Enhancer;

import java.lang.reflect.Proxy;
import java.util.Arrays;

public class ProxyMain {

    public static void main(String[] args) {
        /**static proxy*/
//        {
//            IMaterialService materialService = new MaterialServiceStaticProxy();
//            materialService.add(new Material());
//        }

        /** jdk proxy*/
//        {
//            IMaterialService target = new MaterialServiceImpl();
//            IMaterialService materialService = (IMaterialService) Proxy.newProxyInstance(target.getClass().getClassLoader(),
//                    target.getClass().getInterfaces(), new MaterialServiceJDKProxy(target));
//            materialService.add(new Material());
//        }
        String[] strs = new String[]{"1", "2"};
        var ref = new Object() {
            String tmp = new String();
        };
        Arrays.stream(strs).forEach(str -> {
            ref.tmp = ref.tmp +str;
        });
        System.out.println(ref.tmp);
        /** CGLIB proxy*/
//        {
//            System.setProperty(DebuggingClassWriter.DEBUG_LOCATION_PROPERTY, "D:\\workspace\\java\\SpringLearn\\frameworkLearn\\target\\cglibDebugSource");
//            Enhancer enhancer = new Enhancer();
//            enhancer.setSuperclass(MaterialServiceImpl.class);
//            enhancer.setCallback(new MaterialServiceCglibProxy());
//            MaterialServiceImpl proxy = (MaterialServiceImpl) enhancer.create();
//            proxy.add(new Material());
//        }
    }
}
