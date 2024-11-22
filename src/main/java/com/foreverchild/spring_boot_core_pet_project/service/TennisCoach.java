package com.foreverchild.spring_boot_core_pet_project.service;

import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {
    @Override
    public String getDailyWorkout() {
        return "PRractice your backend valley";
    }

    @Override
    public String greet() {
        return "Welcome to tennis game caoch";
    }
}
