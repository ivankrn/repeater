package com.ivankrn.repeater.service;

import com.ivankrn.repeater.dto.BugDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class KafkaListenerService {

    @KafkaListener(topics = "bug", containerFactory = "bugKafkaListenerContainerFactory")
    @SendTo("bug-response")
    public String listen(BugDto bug) {
        log.info("Received bug with title: {}", bug.getTitle());
        return "OK!";
    }

}
