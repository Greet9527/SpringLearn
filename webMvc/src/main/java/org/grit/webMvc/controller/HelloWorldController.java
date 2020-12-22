package org.grit.webMvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloWorldController {
    @RequestMapping("/sayHello")
    public String sayHello(){
        System.out.println("hello");
        return "hello";
    }
}
