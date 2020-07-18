package com.muuu.config;

import com.muuu.condition.MyCondition;
import com.muuu.model.MyUser;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConditionConfig {

    @Bean
    @Conditional(MyCondition.class)
    public MyUser getUserName(){
        return new MyUser();
    }
}
