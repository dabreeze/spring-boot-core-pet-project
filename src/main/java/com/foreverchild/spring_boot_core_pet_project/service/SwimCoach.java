package com.foreverchild.spring_boot_core_pet_project.service;

public class SwimCoach implements Coach {

    public SwimCoach (){
        System.out.println("Swim coach : "+ getClass().getSimpleName());
    }

    @Override
    public String getDailyWorkout() {
        return "Swim a 1000 meters as a warm up";
    }

    @Override
    public String greet() {
        return "Welcom to swim coach";
    }
}
