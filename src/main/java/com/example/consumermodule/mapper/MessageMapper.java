package com.example.consumermodule.mapper;

import com.example.consumermodule.domain.dto.MessageDto;
import com.example.consumermodule.domain.producer.MessageProducer;
import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring", injectionStrategy = InjectionStrategy.CONSTRUCTOR,
        unmappedTargetPolicy = ReportingPolicy.ERROR)
public interface MessageMapper {
    MessageProducer toProducer(MessageDto messageDto);
}