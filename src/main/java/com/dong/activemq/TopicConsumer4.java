package com.dong.activemq;

import com.dong.config.ActiveMqConfig;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
public class TopicConsumer4 {

    @JmsListener(destination = ActiveMqConfig.TOPIC_NAME, containerFactory = "topicListenerContainer")
    public void receiveTopicMsg(String msg) {
        System.out.println("收到的消息为4：" + msg);
    }

}
