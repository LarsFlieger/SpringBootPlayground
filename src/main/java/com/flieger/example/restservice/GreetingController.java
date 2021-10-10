package com.flieger.example.restservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "api/v1/greeting")
public class GreetingController {

    private final GreetingService greetingService;

    @Autowired
    public GreetingController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    @GetMapping
    public Greeting getGreeting(@RequestParam(name = "name", defaultValue = "World") String name) {
        return this.greetingService.getGreeting(name);
    }
    
    @GetMapping("/foo")
    public Foo getFoo() {
        return new Foo();
    }
}