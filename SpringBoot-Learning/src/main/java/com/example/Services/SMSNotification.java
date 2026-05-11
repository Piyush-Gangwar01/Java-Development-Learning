package com.example.Services;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component()
@Primary   // ye ab primary hai work same as Qualifier.
public class SMSNotification implements NotificationService{
    public void send(String msg){
        System.out.println("SMS " +msg);
    }
}
