package com.bwalczak.booklist.booklistapp.example;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeMessage {

    @RequestMapping("/")
    public String welcomeUser() {
        return "Hello User!";
    }
}
