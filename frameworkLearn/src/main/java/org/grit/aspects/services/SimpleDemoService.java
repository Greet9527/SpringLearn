package org.grit.aspects.services;

import org.grit.aspects.pointCuts.AnnotationMethodPoint;
import org.springframework.stereotype.Component;

@Component
public class AspectDemoService {

    public void aspectHello(int a ,int b,String c) throws Exception {
        System.out.println("aspect hello a:"+a+",b:"+b+",c:"+c);
        throw new Exception("aspect hello throw exception");
    }

    @AnnotationMethodPoint
    public void aopAspect(int a ,int b,String c){

    }
}
