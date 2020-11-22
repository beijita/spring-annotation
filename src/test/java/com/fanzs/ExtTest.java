package com.fanzs;

import com.fanzs.config.MyExtConfig;
import com.fanzs.domain.Color;
import org.junit.Test;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ExtTest {

    AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(MyExtConfig.class);

    @Test
    public void testExt() {
        applicationContext.publishEvent(new ApplicationEvent("我发布事件") {
            @Override
            public Object getSource() {
                return super.getSource();
            }
        });

        Color color = applicationContext.getBean(Color.class);
    }
}
