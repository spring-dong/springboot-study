package com.dubbo.consumer;


import com.dong.server.TestService;
import com.dong.server.TestService2;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author yichaofan
 * @date 2019/12/9 18:20
 * @apiNote //TODO
 */
@RestController
public class TestDubboController {
    @Reference(version = "1.0.0")
    TestService2 service2;
    @Reference(version = "1.0.0")
    TestService service;

    @GetMapping("test1")
    public String test1(){
        return  service.showName();
    }
    @GetMapping("test2")
    public String test2(){
        return  service2.showName();
    }
}
