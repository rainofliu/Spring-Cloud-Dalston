package com.ajin.service;

import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;

/**
 * @Auther: ajin
 * @Date: 2019/1/26 18:20
 * @Description:
 */
public interface SinkSender {
    String OUTPUT="input";
    @Output(SinkSender.OUTPUT)
    MessageChannel output();
}
