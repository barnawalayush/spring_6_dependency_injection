package com.barnawal.spring_6_dependency_injection.controllers;


import com.barnawal.spring_6_dependency_injection.services.EnvironmentService;
import org.springframework.stereotype.Controller;

@Controller
public class EnvironmentController {

    private final EnvironmentService environmentService;

    public EnvironmentController(EnvironmentService environmentService) {
        this.environmentService = environmentService;
    }

    public String getEnvironment(){
        return "You are in "
                + environmentService.getEnv()
                + " Environment";
    }
}
