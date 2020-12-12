package org.grit.events.eventDefine;

import org.springframework.context.ApplicationEvent;

public class HelloWorldEvent extends ApplicationEvent {

    private String msg;
    /**
     * Create a new {@code ApplicationEvent}.
     *
     * @param source the object on which the event initially occurred or with
     *               which the event is associated (never {@code null})
     */
    public HelloWorldEvent(Object source,String msg) {
        super(source);
        this.msg=msg;
    }

    public String getMsg() {
        return msg;
    }
}
