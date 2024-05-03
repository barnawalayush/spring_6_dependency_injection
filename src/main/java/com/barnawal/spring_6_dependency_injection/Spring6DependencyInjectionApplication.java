package com.barnawal.spring_6_dependency_injection;

import com.barnawal.spring_6_dependency_injection.controllers.MyController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Spring6DependencyInjectionApplication {

    public static void main(String[] args) {

        ApplicationContext context = SpringApplication.run(Spring6DependencyInjectionApplication.class, args);

        MyController controller = context.getBean(MyController.class);

        System.out.println("I'm Main Method");

        System.out.println(controller.sayHello());


    }

}
