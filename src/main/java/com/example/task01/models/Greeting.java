package com.example.task01.models;

import java.time.LocalTime;

public class Greeting {
    private String name;
    private LocalTime timeOfDay;

    public Greeting(){}

    public Greeting(String name, LocalTime timeOfDay){
        this.name = name;
        this.timeOfDay = timeOfDay;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalTime getTimeOfDay() {
        return timeOfDay;
    }

    public void setTimeOfDay(LocalTime timeOfDay) {
        this.timeOfDay = timeOfDay;
    }
}
