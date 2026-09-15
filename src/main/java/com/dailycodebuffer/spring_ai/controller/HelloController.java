package com.dailycodebuffer.spring_ai.controller;


import org.springframework.ai.chat.client.ChatClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/")
@RestController
public class HelloController {


    private final ChatClient chatClient;

    public HelloController(ChatClient.Builder builder) {
        this.chatClient = builder.build();
    }

    @GetMapping(value = "prompt")
    public String prompt(@RequestParam(value = "message") String message) {
        return chatClient.prompt(message).call().content();
        //return "Hello";
    }

    @GetMapping(value = "celebrities")
    public String getCelebritiesDetails() {
        return "Hello";
    }
}
