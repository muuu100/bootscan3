package com.muuu;

import com.muuu.config.ConditionConfigB;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * 测试ConditionalOnProperty
 *  * 可以正确读取配置
 */
@RunWith(SpringRunner.class)
@SpringBootTest
class BootApplicationTests {

//    @Autowired
//    private ConditionConfigB conditionConfigB;
//
    @Test
    void contextLoads() {
//        System.out.println(conditionConfigB);
    }

}
