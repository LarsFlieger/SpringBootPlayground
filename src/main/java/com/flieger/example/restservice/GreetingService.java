package com.flieger.example.restservice;

import org.springframework.stereotype.Service;

@Service
public class GreetingService {
    
    public Greeting getGreeting(String name) {
        return new Greeting(1, String.format("Hello %s!", name));
    }
}
