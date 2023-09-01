package com.jakubmikula.mikjakdi.controllers;

import com.jakubmikula.mikjakdi.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Controller;

@Controller
public class SetterInjectedController {

    private GreetingService service;

    @Qualifier("setterGreetingService")
    @Autowired
    void setService(GreetingService service) {
        this.service = service;
    }

    public String getGreetings() {
        return service.sayGreeting();
    }
}
