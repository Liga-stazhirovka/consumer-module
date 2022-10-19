package com.example.consumermodule.producer.api;

import com.example.consumermodule.domain.producer.MessageProducer;

public interface Producer {
    void sendMessage(MessageProducer message);
}
