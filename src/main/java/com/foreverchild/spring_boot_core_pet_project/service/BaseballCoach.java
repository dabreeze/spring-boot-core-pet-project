package com.foreverchild.spring_boot_core_pet_project.service;

import org.springframework.stereotype.Component;

@Component
public class BaseballCoach implements Coach {

    public BaseballCoach(){
        System.out.println("In constructor: "+ getClass().getSimpleName());
    }
    @Override
    public String getDailyWorkout() {
        return "Make sure to do 50 reps daily";
    }

    @Override
    public String greet() {
        return "Hello i am baseball coach";
    }
}
