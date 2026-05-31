package com.example.demo.service;

import com.example.demo.model.MessageResponse;
import org.springframework.stereotype.Service;

@Service
public class HelloService {
    public MessageResponse getGreeting() {
        return new MessageResponse("Hello, world! The API is up and running.");
    }
}