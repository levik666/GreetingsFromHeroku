package com.levik.greetings.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class GreetingsService {

    @Value("${GREETINGS}")
    private String greetings;

    public String sayGreetings(){
        return greetings;
    }
}
