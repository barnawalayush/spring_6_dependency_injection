package com.barnawal.spring_6_dependency_injection.services;


import org.springframework.stereotype.Service;

@Service("propertyGreetingService")
public class GreetingServicePropertyInjected implements GreetingService{


    @Override
    public String sayGreeting() {
        return "Friends don't let friends to property injected!!!!";

    }
}
