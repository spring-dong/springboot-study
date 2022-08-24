package com.dubbo.provider.impl;

import com.dong.server.TestService2;
import org.apache.dubbo.config.annotation.Service;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author yichaofan
 * @date 2019/12/9 15:34
 * @apiNote //TODO
 */
@Service(version = "1.0.0")
public class TestService2Impl implements TestService2 {
    private static final Logger logger = LoggerFactory.getLogger(TestService2Impl.class);


    @Override
    public String showName() {
        logger.info("TestService2Impl开始执行方法====================");
        return "HELLO   TestService2";
    }
}
