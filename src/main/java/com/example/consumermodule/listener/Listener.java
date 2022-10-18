package com.example.consumermodule.listener;

import com.example.consumermodule.dto.Message;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class Listener {
    private final String ALERT_QUEUE = "alert_queue";
    private final String DAILY_QUEUE = "daily_queue";
    private final String ERROR_QUEUE = "error_queue";

    @RabbitListener(queues = ALERT_QUEUE)
    public void listenerAlertQueue(Message message) {
        System.out.printf("Message received: %s \nFrom the queue: %s\n",
                message.getMessage(), ALERT_QUEUE);
    }

    @RabbitListener(queues = DAILY_QUEUE)
    public void listenerDailyQueue(Message message) {
        System.out.printf("Message received: %s \nFrom the queue: %s\n",
                message.getMessage(), DAILY_QUEUE);
    }

    @RabbitListener(queues = ERROR_QUEUE)
    public void listenerErrorQueue(Message message) {
        System.out.printf("Message received: %s \nFrom the queue: %s\n",
                message.getMessage(), ERROR_QUEUE);
    }
}
