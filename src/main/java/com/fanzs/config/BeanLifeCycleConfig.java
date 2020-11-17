package com.fanzs.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@ComponentScan({"com.fanzs.domain", "com.fanzs.processor"})
@Configuration
public class BeanLifeCycleConfig {

}
