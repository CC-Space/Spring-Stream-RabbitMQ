package com.stream.rabbitmq.example.streamrabbitmqdemo.api;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.messaging.SubscribableChannel;

public interface MyBinding {
    @Input("myinput")
    SubscribableChannel myinput();

    //@Output("myoutput")
    //MessageChannel myoutput();

}
