package com.fanzs.config;

import com.fanzs.aop.MathCalculator;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * aop 开启三步
 *  1.将页业务逻辑组件和切面类加入到容器中，告诉Spring哪个是切面类
 *  2.为切面类的每个通知方法标注通知注解，告诉Spring何时运行
 *  3.在配置类中开启注解 @EnableAspectJAutoProxy
 *
 * AOP 原理 （给容器中注入了什么组件）
 *  @EnableAspectJAutoProxy
 *      -> @Import(AspectJAutoProxyRegistrar.class)
 *          ->ImportBeanDefinitionRegistrar
 *              ->
 *
 */

@EnableAspectJAutoProxy
@ComponentScan(value = {"com.fanzs.aop"})
@Configuration
public class MyAopConfig {

    @Bean
    public MathCalculator mathCalculator(){
        return new MathCalculator();
    }
}
