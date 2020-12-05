package org.grit.container;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import java.util.Arrays;

@ComponentScan("org.grit.*")
public class AnnotationCfgContext {
    public static void main(String[] args) {
        ApplicationContext context=new AnnotationConfigApplicationContext();
        String[] beanDefinitionNames = context.getBeanDefinitionNames();
        Arrays.stream(beanDefinitionNames).forEach((name)->{
        System.out.println(name);
    });

    }
}
