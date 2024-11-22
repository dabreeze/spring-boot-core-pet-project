package com.foreverchild.spring_boot_core_pet_project.service;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
import com.foreverchild.spring_boot_core_pet_project.util.Utils;

@Component
public class CricketCoach implements Coach {


    public CricketCoach() {
        System.out.println("In constructor: " + getClass().getSimpleName());

    }

    //    init method explained using postconstruct
    @PostConstruct
    public void doSomethingFirst() {
        System.out.println("Activities started successfully: " + getClass().getSimpleName());
    }

//        destroy method explained using preDestroy
    @PreDestroy
    public void doSomethingLast() {
        System.out.println("Activities ended successfully: " + getClass().getSimpleName());
    }

    @Override
    public String getDailyWorkout() {
        return "Practice Fast Bowling for 15 mins";
    }

    @Override
    public String greet() {
        return "Good morning to you";
    }
}
