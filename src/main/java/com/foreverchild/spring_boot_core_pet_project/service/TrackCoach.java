package com.foreverchild.spring_boot_core_pet_project.service;

import org.springframework.stereotype.Component;

@Component
public class TrackCoach implements Coach {
    @Override
    public String getDailyWorkout() {
        return "Run a hard 5k";
    }

    @Override
    public String greet() {
        return "Welcome to track coach";
    }
}
