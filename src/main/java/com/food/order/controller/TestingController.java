package com.food.order.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMethod;

@RestController
@RequestMapping("/api/v1")
public class TestingController {

    @RequestMapping(value = "/test", method = RequestMethod.GET)
    public String sayHello() {
        return "Hello, authenticated user!";
    }

}
