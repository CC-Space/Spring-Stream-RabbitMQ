package com.stream.rabbitmq.example.streamrabbitmqdemo.impl;

import com.stream.rabbitmq.example.streamrabbitmqdemo.api.MyBinding;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.Message;

@EnableBinding(MyBinding.class)
public class Comsumer {
    // 监听 binding 为 Sink.INPUT 的消息
    @StreamListener("myinput")
    public void input(Message<String> message) {
        System.out.println("一般监听收到：" + message.getPayload());
    }

}
