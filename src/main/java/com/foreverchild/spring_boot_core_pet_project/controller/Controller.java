package com.foreverchild.spring_boot_core_pet_project.controller;

import com.foreverchild.spring_boot_core_pet_project.service.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    private Coach myCoach;


    @Autowired
    public Controller (@Qualifier("swimCoach") Coach coach){
        System.out.println("In constructor: "+ getClass().getSimpleName());
        myCoach = coach;
    }

    @GetMapping("/dailyworkout")
    public String getDailyWorkout(){
        return myCoach.getDailyWorkout();
    }

    @GetMapping("/greet")
    public String greet(){
        return myCoach.greet();
    }
}
