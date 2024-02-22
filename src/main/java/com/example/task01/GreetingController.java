package com.example.task01;

import com.example.task01.models.Greeting;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class GreetingController {

    @GetMapping(value = "/greeting")
    public Greeting greeting(){
        Greeting greeting = new Greeting("Saba", "Afternoon");
        return greeting;
    }
}
