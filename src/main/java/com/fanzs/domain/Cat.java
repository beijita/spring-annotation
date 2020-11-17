package com.fanzs.domain;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class Cat implements InitializingBean, DisposableBean {

    public Cat() {
        System.out.println("Cat constructor ... ");
    }

    public void afterPropertiesSet() throws Exception {
        System.out.println("Cat InitializingBean afterPropertiesSet");
    }

    public void destroy() throws Exception {
        System.out.println("Cat DisposableBean destroy");
    }

    // bean 创建完成、属性赋值完成，来执行初始化方法
    @PostConstruct
    public void postConstruct() {
        System.out.println("Cat postConstruct");
    }

    // 在容器 销毁bean之前进行清理操作
    @PreDestroy
    public void preDestroy() {
        System.out.println("Cat PreDestroy");
    }
}
