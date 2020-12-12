package org.grit.events;

import org.grit.configs.AnnotationScanAppCfg;
import org.grit.events.publish.HelloWorldEventPublish;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class EventMain {


    public static void main(String[] args) {
        ApplicationContext context=new AnnotationConfigApplicationContext(AnnotationScanAppCfg.class);
        HelloWorldEventPublish bean = context.getBean(HelloWorldEventPublish.class);
        bean.publish("hello world event");
    }
}
