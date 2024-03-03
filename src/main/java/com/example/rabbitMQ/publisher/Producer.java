package com.example.rabbitMQ.publisher;

import com.example.rabbitMQ.model.Message;
import com.example.rabbitMQ.service.RabbitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rabbitmq")
public class Producer {
    @Autowired
    private RabbitService rabbitService;

    @GetMapping("/push-message")
    public ResponseEntity<String> sendMessage(@RequestBody Message message) {
        return ResponseEntity.ok(rabbitService.sendMessage(message));
    }

}
