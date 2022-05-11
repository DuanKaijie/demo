package com.duankaijie.demo.listener;

import com.duankaijie.demo.service.UserService;
import com.duankaijie.demo.entity.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

import javax.servlet.ServletContext;

@Component
public class MyServletContextListener implements ApplicationListener<ContextRefreshedEvent> {

    @Override
    public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {
        // 先获取到application上下文，在这里是先获取到application上下文才能获取到application域对象 ServletContext
        ApplicationContext applicationContext = contextRefreshedEvent.getApplicationContext();
        // 获取对应的service
        UserService userService = applicationContext.getBean(UserService.class);
        User user = userService.getUser(20L);
        // 获取application域对象，将查到的信息放到application域中，application域对象实质上就是ServletContext
        ServletContext application = applicationContext.getBean(ServletContext.class);
        application.setAttribute("user", user);//在这永远都是key,value的形式
    }
}
