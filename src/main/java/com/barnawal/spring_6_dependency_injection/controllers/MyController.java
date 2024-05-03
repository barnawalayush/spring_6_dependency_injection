package com.barnawal.spring_6_dependency_injection.controllers;


import com.barnawal.spring_6_dependency_injection.services.GreetingService;
import com.barnawal.spring_6_dependency_injection.services.GreetingServiceImpl;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;


@Controller
public class MyController {

    private final GreetingService greetingService;

    public MyController() {
        greetingService = new GreetingServiceImpl();
    }

    public String sayHello(){
        System.out.println("I'm a controller");

        return greetingService.sayGreeting();
    }

    public void beforeInit(){
        System.out.println("## - Before Init - Called by Bean Post Processor");
    }

    public void afterInit(){
        System.out.println("## - After init called by Bean Post Processor");
    }

}
