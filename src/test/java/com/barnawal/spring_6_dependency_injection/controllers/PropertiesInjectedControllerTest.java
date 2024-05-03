package com.barnawal.spring_6_dependency_injection.controllers;

import com.barnawal.spring_6_dependency_injection.services.GreetingServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;


@SpringBootTest
class PropertiesInjectedControllerTest {

    @Autowired
    PropertiesInjectedController propertiesInjectedController;

//    @BeforeEach
//    void setUp(){
//
//        propertiesInjectedController = new PropertiesInjectedController();
//        propertiesInjectedController.greetingService = new GreetingServiceImpl();
//
//    }

    @Test
    void sayHello(){

        System.out.println(propertiesInjectedController.sayHello());

    }
}