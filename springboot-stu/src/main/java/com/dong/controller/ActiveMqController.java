package com.dong.controller;


import com.dong.activemq.MsgProducer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.jms.Destination;

/**
 * ActiveMQ controller
 * @author shengwu ni
 */
@RestController
@RequestMapping("/activemq")
public class ActiveMqController {

    private static final Logger logger = LoggerFactory.getLogger(ActiveMqController.class);

    @Resource
    private MsgProducer producer;

    @Resource
    private Destination queue;

    @Resource
    private Destination topic;


    @GetMapping("/send/queue")
    public String sendQueueMessage() {

        logger.info("===开始发送点对点消息===");

        producer.sendMessage(queue, "董学类最帅气!");
        return "success";
    }

    @GetMapping("/send/topic")
    public String sendTopicMessage() {

        logger.info("===开始发送订阅消息===");
        producer.sendMessage(topic, "Topic: hello activemq!");
        return "success";
    }

}