package com.fanzs.domain;

import org.springframework.beans.factory.FactoryBean;

public class ColorFactoryBean implements FactoryBean {
    public boolean isSingleton() {
        return false;
    }

    public Object getObject() throws Exception {
        return new Color();
    }

    public Class<?> getObjectType() {
        return Color.class;
    }
}
