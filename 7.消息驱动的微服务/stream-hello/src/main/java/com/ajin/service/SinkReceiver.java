package com.ajin.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Sink;

/**
 * 创建用于接收来自RabbitMQ消息的消费者
 * @Auther: ajin
 * @Date: 2019/1/26 16:41
 * @Description:
 */
@EnableBinding(Sink.class)
public class SinkReceiver {
    private static final Logger log= LoggerFactory.getLogger(SinkReceiver.class);
    @StreamListener(Sink.INPUT)
    public  void receive(Object payload) {
        log.info("Received:"+payload);
    }

}
