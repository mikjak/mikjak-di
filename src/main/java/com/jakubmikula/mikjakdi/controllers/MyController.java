package com.jakubmikula.mikjakdi.controllers;

import com.jakubmikula.mikjakdi.services.GreetingService;
import org.springframework.stereotype.Controller;

@Controller
public class MyController {
    GreetingService service;

    public MyController(GreetingService service) {
        this.service = service;
    }

    public String sayHello() {
        return service.sayGreeting();
    }
}
