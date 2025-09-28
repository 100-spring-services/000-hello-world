package com.lokie.hello_world.controllers;

import com.lokie.hello_world.entities.Message;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/")
@RestController
public class HelloWorldController {
    @Value("${hello.world.message}")
    private String data;
    @GetMapping
    public ResponseEntity<Message> greetUser() {
        Message message = new Message(data.toString());
        return ResponseEntity.ok(message);
    }
}
