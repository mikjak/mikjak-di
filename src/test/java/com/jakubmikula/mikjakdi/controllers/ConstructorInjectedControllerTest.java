package com.jakubmikula.mikjakdi.controllers;

import com.jakubmikula.mikjakdi.services.ConstructorGreetingService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ConstructorInjectedControllerTest {

    ConstructorInjectedController controller;

    @BeforeEach
    void setUp() {
        controller = new ConstructorInjectedController(new ConstructorGreetingService());
    }

    @Test
    void getGreetings() {
        System.out.println(controller.getGreetings());
    }
}