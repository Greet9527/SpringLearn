package org.grit.events.publish;

import org.grit.events.eventDefine.HelloWorldEvent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Component;

@Component
public class HelloWorldEventPublish {
    @Autowired
    private ApplicationEventPublisher applicationEventPublisher;

    public void publish(String msg){
        HelloWorldEvent event=new HelloWorldEvent(this,msg);
        applicationEventPublisher.publishEvent(event);
    }
}
