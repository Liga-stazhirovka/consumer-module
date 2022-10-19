package com.example.consumermodule.service;

import com.example.consumermodule.domain.dto.MessageDto;
import com.example.consumermodule.mapper.MessageMapper;
import com.example.consumermodule.producer.api.Producer;
import com.example.consumermodule.service.api.MessageService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MessageServiceImpl implements MessageService {
    private final Producer producer;
    private final MessageMapper mapper;

    @Override
    public void handler(MessageDto message) {
        producer.sendMessage(mapper.toProducer(message));
    }
}
