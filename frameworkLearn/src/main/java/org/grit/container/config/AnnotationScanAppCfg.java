package org.grit.container.config;

import org.grit.container.annotationBeans.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
@ComponentScan(basePackages = "org.grit.container")
public class AnnotationAppCfg {
    //Bean注解
//    @Bean(initMethod = "init",destroyMethod = "destory")
//    @Scope("prototype")
//    public Person injectPerson(){
//        return new Person();
//    }
}
