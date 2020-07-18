package com.muuu.controller;

import com.muuu.config.ConditionConfigB;
import com.muuu.model.MyUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 测试ConditionalOnProperty。
 * 可以正确读取配置
 */
@RestController
public class ConditionControllerB {

//    @Autowired
//    private ConditionConfigB conditionConfigB;
//
//    @GetMapping("/getUser")
//    public String getMyUser(){
//        System.out.println(conditionConfigB);
//        return "ok";
//    }

}
