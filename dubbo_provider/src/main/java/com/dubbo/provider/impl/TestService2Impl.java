package com.dubbo.provider.impl;

import com.dong.server.TestService2;
import org.apache.dubbo.config.annotation.Service;

/**
 * @author yichaofan
 * @date 2019/12/9 15:34
 * @apiNote //TODO
 */
@Service(version = "1.0.0")
public class TestService2Impl implements TestService2 {
    @Override
    public String showName() {
        return "HELLO   TestService2";
    }
}
