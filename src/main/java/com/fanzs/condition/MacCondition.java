package com.fanzs.condition;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.env.Environment;
import org.springframework.core.io.ResourceLoader;
import org.springframework.core.type.AnnotatedTypeMetadata;

public class MacCondition implements Condition {

    public boolean matches(ConditionContext conditionContext, AnnotatedTypeMetadata annotatedTypeMetadata) {
        ClassLoader classLoader = conditionContext.getClassLoader();
        Environment environment = conditionContext.getEnvironment();
        ResourceLoader resourceLoader = conditionContext.getResourceLoader();

        String property = environment.getProperty("os.name");
        if(property.contains("Mac")){
            return true;
        }

        return false;
    }
}
