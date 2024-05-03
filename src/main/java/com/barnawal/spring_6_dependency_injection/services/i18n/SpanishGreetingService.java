package com.barnawal.spring_6_dependency_injection.services.i18n;

import com.barnawal.spring_6_dependency_injection.services.GreetingService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;


@Profile("ES")
@Service("i18NService")
public class SpanishGreetingService implements GreetingService {


    @Override
    public String sayGreeting() {
        return "Hola Mundo - ES";
    }
}
