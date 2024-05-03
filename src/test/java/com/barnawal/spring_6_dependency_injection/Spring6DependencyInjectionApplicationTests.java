package com.barnawal.spring_6_dependency_injection;

import com.barnawal.spring_6_dependency_injection.controllers.MyController;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

@SpringBootTest
class Spring6DependencyInjectionApplicationTests {

    @Autowired
    ApplicationContext context;

    @Autowired
    MyController myController;

    @Test
    void testAutowiredOfController(){
        System.out.println(myController.sayHello());
    }

    @Test
    void testGetControllerFromContext(){
        MyController controller = context.getBean(MyController.class);

        System.out.println(controller.sayHello());
    }

    @Test
    void contextLoads() {
    }

}
