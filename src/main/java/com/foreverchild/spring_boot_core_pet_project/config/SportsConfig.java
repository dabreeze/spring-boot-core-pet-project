package com.foreverchild.spring_boot_core_pet_project.config;

import com.foreverchild.spring_boot_core_pet_project.service.Coach;
import com.foreverchild.spring_boot_core_pet_project.service.SwimCoach;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SportsConfig {

    @Bean
    public Coach swimCoach(){
        return new SwimCoach();
    }
}
