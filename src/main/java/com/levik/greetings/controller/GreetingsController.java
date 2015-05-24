package com.levik.greetings.controller;

import com.levik.greetings.service.GreetingsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingsController {

    @Autowired
    private GreetingsService greetingService;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String sayGreetings(){
        return greetingService.sayGreetings();
    }
}
