package com.jakubmikula.mikjakdi.controllers;

import com.jakubmikula.mikjakdi.services.GreetingService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class I18nController {

    private final GreetingService service;

    public I18nController(@Qualifier("i18nService") GreetingService service) {
        this.service = service;
    }

    public String sayHello() {
        return service.sayGreeting();
    }
}
