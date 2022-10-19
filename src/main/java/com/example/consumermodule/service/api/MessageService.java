package com.example.consumermodule.service.api;

import com.example.consumermodule.domain.dto.MessageDto;

public interface MessageService {
    void handler(MessageDto message);
}
