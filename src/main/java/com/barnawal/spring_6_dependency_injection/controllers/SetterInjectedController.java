package com.barnawal.spring_6_dependency_injection.controllers;

import com.barnawal.spring_6_dependency_injection.services.GreetingService;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;


@Controller
public class SetterInjectedController {

//    @Qualifier("setterGreetingBean")
//    @Autowired
    private GreetingService greetingService;


    // if we don't put autowired here then it
    // will not get called but if we put autowired here then it get called
//    @Autowired
//    public void setGreetingService(GreetingService greetingService){
//        System.out.println("SetterInjectedController.setGreetingService");
//        this.greetingService = greetingService;
//
//    }

    @Autowired
    public void setGreetingService(@Qualifier("setterGreetingBean") GreetingService greetingService){
        System.out.println("SetterInjectedController.setGreetingService");
        this.greetingService = greetingService;

    }


    public String sayHello(){
        return greetingService.sayGreeting();
    }
}
