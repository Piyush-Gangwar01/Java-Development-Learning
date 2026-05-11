package com.example.main;

import org.springframework.stereotype.Component;

@Component("my bean")
public class GreetingService {
    public void sayHello(){
        System.out.println("Hello from Spring ! ");
    }
}
