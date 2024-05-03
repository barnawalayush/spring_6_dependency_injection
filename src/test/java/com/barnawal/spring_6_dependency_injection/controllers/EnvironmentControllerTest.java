package com.barnawal.spring_6_dependency_injection.controllers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.couchbase.CouchbaseProperties;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

import static org.junit.jupiter.api.Assertions.*;


@ActiveProfiles({"uat", "EN"})
@SpringBootTest
class EnvironmentControllerTest {

    @Autowired
    EnvironmentController controller;

    @Test
    void getEnvironment(){
        System.out.println(controller.getEnvironment());
    }

}