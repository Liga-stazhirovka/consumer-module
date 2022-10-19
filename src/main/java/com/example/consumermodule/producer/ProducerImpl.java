package com.example.consumermodule.producer;

import com.example.consumermodule.domain.producer.MessageProducer;
import com.example.consumermodule.producer.api.Producer;
import org.springframework.stereotype.Component;

@Component
public class ProducerImpl implements Producer {
    @Override
    public void sendMessage(MessageProducer message) {
        System.out.printf("The message is received: %s" + "\n" + "From the queue: %s" + "\n",
                message.getMessage(), message.getQueueName());
    }
}
