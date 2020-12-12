package org.grit.aspects.services;

import org.springframework.stereotype.Component;

@Component
public class SimpleDemoService {

    public void aspectHello(int a ,int b,String c) throws Exception {
        System.out.println("aspect hello a:"+a+",b:"+b+",c:"+c);
        throw new Exception("aspect hello throw exception");
    }

    public void aopAspect(int a ,int b,String c){

    }
}
