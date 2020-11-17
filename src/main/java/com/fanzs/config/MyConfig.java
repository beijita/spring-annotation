package com.fanzs.config;

import com.fanzs.domain.ColorFactoryBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyConfig {

    @Bean
    public ColorFactoryBean colorFactoryBean() {
        return new ColorFactoryBean();
    }
}
