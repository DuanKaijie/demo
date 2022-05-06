package com.duankaijie.demo.event;

import org.springframework.context.ApplicationEvent;
import com.duankaijie.demo.entity.User;
import org.springframework.context.ApplicationEvent;

public class MyEvent extends ApplicationEvent {

    private User user;

    public MyEvent(Object source, User user) {
        super(source);
        this.user = user;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
