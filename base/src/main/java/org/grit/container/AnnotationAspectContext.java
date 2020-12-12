package org.grit.container;

import org.grit.aspects.services.MethodDemoService;
import org.grit.aspects.services.SimpleDemoService;
import org.grit.configs.AspectCfg;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AnnotationAspectContext {

    public static void main(String[] args) throws Exception {
        AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(AspectCfg.class);
        SimpleDemoService demoService = context.getBean(SimpleDemoService.class);
        MethodDemoService methodDemoService = context.getBean(MethodDemoService.class);
//        try {
//            demoService.aspectHello(1,2,"3");
//        }catch (Exception exception) {
//            System.out.println("exception");
//        }
        demoService.aopAspect(4,5,"6");

        //methodDemoService.aopMethod('a',4,"hello aop");
    }

}
