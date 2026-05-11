package com.example.main;

import com.example.Services.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainApp {
    public static void main(String[] args) {
        ApplicationContext Context=new AnnotationConfigApplicationContext(Appconfig.class);
        GreetingService greetingService= (GreetingService) Context.getBean("my bean");
        greetingService.sayHello();

        UserService userService= (UserService) Context.getBean(UserService.class);
        userService.notifyUser("Whats Up !");
    }
}