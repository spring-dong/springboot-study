package com.dubbo.provider.impl;

import com.dong.server.TestService;
import org.apache.dubbo.config.annotation.Service;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author yichaofan
 * @date 2019/12/9 15:34
 * @apiNote //TODO
 */
@Service(version = "1.0.0")
public class TestServiceImpl implements TestService {
    private static final Logger logger = LoggerFactory.getLogger(TestServiceImpl.class);

    @Override
    public String showName() {
        logger.info("TestServiceImpl开始执行方法====================");

        return "HELLO   DUBBO";
    }
}
