package com.example.rabbitMQ.consumer;

import com.example.rabbitMQ.config.RabbitMQConfig;
import com.example.rabbitMQ.model.Message;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class Consumer {
    @RabbitHandler
    @RabbitListener(queues = RabbitMQConfig.QUEUE)
    public void receiveMessage(Message message) {
        log.info("Received message!\n" + message);
    }
}
