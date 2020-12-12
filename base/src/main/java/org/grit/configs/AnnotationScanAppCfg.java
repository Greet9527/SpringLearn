package org.grit.configs;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "org.grit.*")
public class AnnotationScanAppCfg {
    //Bean注解
//    @Bean(initMethod = "init",destroyMethod = "destory")
//    @Scope("prototype")
//    public Person injectPerson(){
//        return new Person();
//    }
}
