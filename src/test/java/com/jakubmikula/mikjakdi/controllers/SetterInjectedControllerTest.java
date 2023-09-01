package com.jakubmikula.mikjakdi.controllers;

import com.jakubmikula.mikjakdi.services.ConstructorGreetingService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SetterInjectedControllerTest {

    SetterInjectedController controller;

    @BeforeEach
    void setUp() {

        controller = new SetterInjectedController();
        controller.setService(new ConstructorGreetingService());

    }

    @Test
    void getGreetings() {
        System.out.println(controller.getGreetings());;
    }
}