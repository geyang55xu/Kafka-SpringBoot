package com.geyang.kafkaspringboot;

import com.geyang.kafkaspringboot.producer.KafkaProducer;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest
class KafkaTests {

    @Autowired
    KafkaProducer producer;

    // 消费者：先启动 kafkaApp
    @Test
    void testSendMsg() {
        long time = System.currentTimeMillis();
        System.out.println("----" + time + "，已经发出----");
        producer.send("gy 666, " + time);
    }
}
