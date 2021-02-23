package com.bjpowernode.direct;

import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.DirectExchange;
import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AmqpConfig {
    //@Bean 用于模拟Spring配置文件中的<bean>标签，用于创建名字为
// BootDirectExchange的交换机
    @Bean
    public DirectExchange myChange(){
        return new DirectExchange("BootDirectExchange", true, false);
    }

    @Bean
    public Queue directQueue() {
        return new Queue("directQueue");
    }

    @Bean
    public Binding binding() {
        //构建者的设计模式
        //该设计模式是隐藏了创建的过程
        //最终通过调用方法的方式将Binding的返回值获取到
        //return BindingBuilder.bind();
        return null;
    }
}
