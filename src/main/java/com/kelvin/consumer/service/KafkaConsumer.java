package com.kelvin.consumer.service;

import com.kelvin.consumer.model.Payment;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumer {
    @KafkaListener(topics = "payments", groupId = "payment_id")
    public void consume(Payment payment){
        System.out.println("Consumed payment"+payment);
    }
}
