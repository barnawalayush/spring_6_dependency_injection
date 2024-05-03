package com.barnawal.spring_6_dependency_injection.services.i18n;

import com.barnawal.spring_6_dependency_injection.services.GreetingService;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;


//@Profile("EN")
@Profile({"EN", "default"})   // default profile
@Service("i18NService")
public class EnglishGreetingService implements GreetingService {


    @Override
    public String sayGreeting() {
        return "Hello World - EN";
    }
}
