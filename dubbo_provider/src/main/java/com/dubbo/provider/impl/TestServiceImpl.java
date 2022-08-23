package com.dubbo.provider.impl;

import com.dong.server.TestService;
import org.apache.dubbo.config.annotation.Service;

/**
 * @author yichaofan
 * @date 2019/12/9 15:34
 * @apiNote //TODO
 */
@Service(version = "1.0.0")
public class TestServiceImpl implements TestService {
    @Override
    public String showName() {
        return "HELLO   DUBBO";
    }
}
