package com.muuu.config;

import com.muuu.condition.MyCondition;
import com.muuu.model.MyUser;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConditionalOnProperty(value = "config.load",havingValue = "true",matchIfMissing = true)
public class ConditionConfigB {

    public ConditionConfigB() {
        System.out.println("ConditionConfigB constructor...");
    }

    @Bean
    public MyUser getUserName(){
        System.out.println("ConditionConfigB getUserName...");
        return new MyUser();
    }
}
