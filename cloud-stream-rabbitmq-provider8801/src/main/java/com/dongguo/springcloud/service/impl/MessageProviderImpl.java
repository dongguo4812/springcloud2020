package com.dongguo.springcloud.service.impl;

import com.dongguo.springcloud.service.IMessageProvider;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.messaging.MessageChannel;
import org.springframework.integration.support.MessageBuilder;
import javax.annotation.Resource;
import org.springframework.cloud.stream.messaging.Source;

import java.util.UUID;

/**
 * @author Dongguo
 * @date 2021/7/24 0024 15:53
 * @description:发送消息接口实现类
 */
@EnableBinding(Source.class) // 可以理解为是一个消息的发送管道的定义
public class MessageProviderImpl implements IMessageProvider
{
    @Resource
    private MessageChannel output; // 消息的发送管道

    @Override
    public String send()
    {
        String serial = UUID.randomUUID().toString();
        this.output.send(MessageBuilder.withPayload(serial).build()); // 创建并发送消息
        System.out.println("***serial: "+serial);

        return serial;
    }
}
