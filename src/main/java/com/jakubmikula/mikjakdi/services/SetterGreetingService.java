package com.jakubmikula.mikjakdi.services;

import org.springframework.stereotype.Service;

@Service
public class SetterGreetingService implements GreetingService {

    @Override
    public String sayGreeting() {
        return "Hello world! - Setter";
    }
}
