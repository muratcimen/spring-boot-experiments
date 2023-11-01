package com.muratcimen.springcoredemo.config;

import com.muratcimen.springcoredemo.common.Coach;
import com.muratcimen.springcoredemo.common.SwimCoach;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SportConfig {

    @Bean("aquatic")
    public Coach swimCoach() {
        return new SwimCoach();
    }
}
