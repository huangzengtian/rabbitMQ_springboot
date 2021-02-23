package com.bjpowernode.direct;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

@Service
public class Receive {
    //@RabbitListener注解用于标记当前方法为消息监听方法，可以监听某个队列，当队列中有新消息则自动完成接收，
    @RabbitListener(queues ="myQueueDirect")
    public void receive(String message){
        System.out.println("Boot的Direct消息----"+message);
    }
}
