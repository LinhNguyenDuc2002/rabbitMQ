package com.example.rabbitMQ.service;

import com.example.rabbitMQ.config.RabbitMQConfig;
import com.example.rabbitMQ.model.Message;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class RabbitService {
    @Autowired
    private RabbitTemplate template;

    public String sendMessage(Message message) {
        template.convertAndSend(RabbitMQConfig.EXCHANGE, RabbitMQConfig.ROUTING_KEY, message);
        log.info("Pushed message!");
        return "Sent message successfully!";
    }
}
