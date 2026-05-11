package com.example.Services;

import org.springframework.stereotype.Component;
@Component()
public class EmailService implements  NotificationService{
    @Override
    public void send(String msg){
        System.out.println("Email"+ msg);
    }

}
