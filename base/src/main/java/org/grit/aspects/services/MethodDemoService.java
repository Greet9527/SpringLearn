package org.grit.aspects.services;

import org.grit.aspects.annotations.AnnotationMethodPoint;
import org.springframework.stereotype.Component;

@Component
public class MethodDemoService {

    @AnnotationMethodPoint
    public void aopMethod(char code, double version,String message){
        System.out.println("aopMethod param: code: " + code + " version: " + version + " message: " + message);
    }
}
