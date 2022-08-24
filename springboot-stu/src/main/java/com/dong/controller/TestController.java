package com.dong.controller;

import com.ctrip.framework.apollo.Config;
import com.ctrip.framework.apollo.ConfigService;
import com.ctrip.framework.apollo.spring.annotation.ApolloConfig;
import com.dong.entiy.JsonResult;
import com.dong.entiy.User;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/swagger")
@Api(value = "Swagger2 在线接口文档")
public class TestController {

    @Value( "${dong}" )
    String dateValue;

    @Value( "${stuName}" )
    String stuName;

    @ApolloConfig("application")
    private Config application;

    @ApolloConfig("mysql")
    private Config mysql;

    @GetMapping("/get/{id}")
    @ApiOperation(value = "根据用户唯一标识获取用户信息")
    public String getUserInfo(@PathVariable @ApiParam(value = "用户唯一标识") Long id) {
        // 模拟数据库中根据id获取User信息
        User user = new User(id, "董学类", "123456");

        String appDong = application.getProperty("dong", "kong");
        String mysqlDong = mysql.getProperty("dong", "kong");
        return  appDong+mysqlDong;





    }
    
    @PostMapping("/insert")
    @ApiOperation(value = "添加用户信息")
    public JsonResult<Void> insertUser(@RequestBody @ApiParam(value = "用户信息") User user) {
        // 处理添加逻辑
        return new JsonResult<>();
    }

    public static void main(String[] args) {
        Config config = ConfigService.getAppConfig(); //config instance is singleton for each namespace and is never null
        String someKey = "stuName";
        String someDefaultValue = "kong";
        String value = config.getProperty(someKey, someDefaultValue);
        System.out.printf(value);
    }
}
