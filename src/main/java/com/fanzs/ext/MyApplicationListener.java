package com.fanzs.ext;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

import java.util.concurrent.atomic.AtomicInteger;

@Component
public class MyApplicationListener implements ApplicationListener<ApplicationEvent> {
    private static AtomicInteger count = new AtomicInteger();

    public void onApplicationEvent(ApplicationEvent event) {
        count.incrementAndGet();
        System.out.println("MyApplicationListener.onApplicationEvent----");
        System.out.println(event);
        System.out.println(count.get());
    }
}
