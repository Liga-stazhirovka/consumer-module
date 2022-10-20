package com.example.consumermodule.consumer.listener;

import com.example.consumermodule.consumer.listener.api.QueueListener;
import com.example.consumermodule.domain.consumer.MessageConsumer;
import com.example.consumermodule.domain.dto.MessageDto;
import com.example.consumermodule.service.api.MessageService;
import lombok.RequiredArgsConstructor;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class DailyQueueListener implements QueueListener {
    private final MessageService service;
    private final String DAILY_QUEUE = "daily_queue";

    @Override
    @RabbitListener(queues = DAILY_QUEUE)
    public void listenQueue(MessageConsumer message) {
        MessageDto messageDto = MessageDto.builder()
                .status(message.getStatus())
                .message(message.getMessage())
                .queueName(DAILY_QUEUE)
                .build();

        service.handler(messageDto);
    }
}
