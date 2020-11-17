package com.fanzs;

import com.fanzs.config.BeanLifeCycleConfig;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class IOCTest1 {

    @Test
    public void test_BeanLifeCycle(){
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(BeanLifeCycleConfig.class);
        applicationContext.close();
    }
}
