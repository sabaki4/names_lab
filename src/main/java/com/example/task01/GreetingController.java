package com.example.task01;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class GreetingController {

    @GetMapping(value = "/greeting")
    public String greeting(){
        return "Good Afternoon Saba!";
    }

}
