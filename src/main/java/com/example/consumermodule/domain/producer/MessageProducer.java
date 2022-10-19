package com.example.consumermodule.domain.producer;

import com.example.consumermodule.domain.message_status.MessageStatus;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.Builder;
import lombok.AccessLevel;

@Getter
@Builder
@ToString
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class MessageProducer{
    private MessageStatus status;
    private String message;
    private String queueName;
}

