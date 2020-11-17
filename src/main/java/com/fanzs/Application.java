package com.fanzs;

import com.fanzs.config.MyConfiguration;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(MyConfiguration.class);
//        Person person = (Person) applicationContext.getBean("personId");
//        Person person2 = (Person) applicationContext.getBean("personId2");
//        System.out.println(person == person2);
//        System.out.println(person);
//        System.out.println(person2);
        Object colorBean = applicationContext.getBean("colorFactoryBean");
        System.out.println("colorBean class is " + colorBean.getClass());

        Object colorFactoryBean = applicationContext.getBean("&colorFactoryBean");
        System.out.println("colorFactoryBean class is " + colorFactoryBean.getClass());

        System.out.println();

        String[] beanDefinitionNames = applicationContext.getBeanDefinitionNames();
        for (String beanDefinitionName : beanDefinitionNames) {
            System.out.println(beanDefinitionName);
        }
    }
}
