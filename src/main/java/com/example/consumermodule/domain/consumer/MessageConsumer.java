package com.example.consumermodule.domain.consumer;

import com.example.consumermodule.domain.message_status.MessageStatus;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.AccessLevel;

@Getter
@ToString
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class MessageConsumer{
    private MessageStatus status;
    private String message;
}
