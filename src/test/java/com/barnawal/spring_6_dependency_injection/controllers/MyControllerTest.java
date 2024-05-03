package com.barnawal.spring_6_dependency_injection.controllers;

import org.junit.jupiter.api.Test;

public class MyControllerTest {

    @Test
    void sayHello(){
        MyController myController = new MyController();

        System.out.println(myController.sayHello());

    }

}
