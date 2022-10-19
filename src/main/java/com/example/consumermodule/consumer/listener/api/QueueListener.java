package com.example.consumermodule.consumer.listener.api;

import com.example.consumermodule.domain.consumer.MessageConsumer;

public interface QueueListener {
    void listenQueue(MessageConsumer message);
}
