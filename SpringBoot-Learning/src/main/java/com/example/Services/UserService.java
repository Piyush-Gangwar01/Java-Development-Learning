package com.example.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("SMSbean")
public class UserService {

    public NotificationService notificationService;


    // using Qualifier Annotation
    @Autowired
    public UserService(@Qualifier("emailService") NotificationService notificationService){
        this.notificationService = notificationService;
    }

    // using primary Annotation ( use @Primary in class jisko pehle use krna hai)
    public UserService(NotificationService notificationService){
        this.notificationService = notificationService;
    }

    public void notifyUser(String msg){
        notificationService.send("Notification hello ");
    }

    public void setNotificationService(NotificationService notificationService){
        this.notificationService = notificationService;
    }
}