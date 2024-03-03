package com.example.rabbitMQ.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
//@JsonIgnoreProperties(ignoreUnknown = true) //map JSON <=> POJO, bỏ qua fields nếu không khớp
public class Message {
    private String sender;

    private String content;
}
