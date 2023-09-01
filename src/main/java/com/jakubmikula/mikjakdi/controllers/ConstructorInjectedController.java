package com.jakubmikula.mikjakdi.controllers;

import com.jakubmikula.mikjakdi.services.GreetingService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class ConstructorInjectedController {

    private GreetingService service;

    public ConstructorInjectedController(@Qualifier("constructorGreetingService") GreetingService service) {
        this.service = service;
    }

    public String getGreetings() {
        return service.sayGreeting();
    }

}
