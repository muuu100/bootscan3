package com.muuu;

import com.muuu.config.ConditionConfig;
import com.muuu.config.ConditionConfigB;
import com.muuu.model.MyUser;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ConditionMain {

    public static void main(String[] args) {
        /**
         * 测试ConditionalOnProperty
         * 不可以正确读取配置
         */
        ApplicationContext context = new AnnotationConfigApplicationContext(ConditionConfigB.class);
        MyUser myUser = (MyUser) context.getBean("getUserName");
        System.out.println(myUser);
        /////---------------------------
//        ApplicationContext context = new AnnotationConfigApplicationContext(ConditionConfigB.class);
//        MyUser myUser = (MyUser) context.getBean("getUserName");
//        System.out.println(myUser);
    }
}
