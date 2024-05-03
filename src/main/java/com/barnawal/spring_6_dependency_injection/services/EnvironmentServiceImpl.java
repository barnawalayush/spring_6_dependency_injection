package com.barnawal.spring_6_dependency_injection.services;


import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;


@Profile({"dev", "default"})
@Service
public class EnvironmentServiceImpl implements EnvironmentService {
    @Override
    public String getEnv() {
        return "dev";
    }
}
