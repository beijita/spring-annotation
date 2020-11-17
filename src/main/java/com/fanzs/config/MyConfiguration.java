package com.fanzs.config;

import com.fanzs.condition.LinuxCondition;
import com.fanzs.condition.MacCondition;
import com.fanzs.domain.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.Scope;

@Configuration
@Import({MyConfig.class})
public class MyConfiguration {


    @Conditional({MacCondition.class})
    @Scope("prototype")
    @Bean
    public Person personId2() {
        return new Person("lisi", 16);
    }

    /**
     * ConfigurableBeanFactory
     *     String SCOPE_SINGLETON = "singleton";
     *     String SCOPE_PROTOTYPE = "prototype";
     * @return
     */
    @Conditional({LinuxCondition.class})
    @Scope("prototype")
    @Bean
    public Person personId() {
        return new Person("zhangshang", 16);
    }

}
