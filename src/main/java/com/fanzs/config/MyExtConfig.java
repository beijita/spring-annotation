package com.fanzs.config;

import com.fanzs.domain.Color;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@ComponentScan({"com.fanzs.ext"})
@Configuration
public class MyExtConfig {

    @Bean
    public Color color() {
        return new Color();
    }
}
