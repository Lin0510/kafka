package org.acme.processor;

import io.quarkus.kafka.client.serialization.ObjectMapperDeserializer;
import io.quarkus.test.junit.QuarkusTest;
import io.smallrye.common.annotation.Identifier;
import org.acme.model.Form;
import org.apache.kafka.clients.consumer.ConsumerConfig;
import org.apache.kafka.clients.consumer.ConsumerRecords;
import org.apache.kafka.clients.consumer.KafkaConsumer;
import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.ProducerRecord;
import org.apache.kafka.common.serialization.StringDeserializer;
import org.apache.kafka.common.serialization.StringSerializer;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import javax.inject.Inject;
import java.time.Duration;
import java.util.Collections;
import java.util.Map;
import java.util.Properties;
import java.util.UUID;

import static org.junit.jupiter.api.Assertions.*;

@QuarkusTest
public class FormProcessorTest {

    @Inject
    @Identifier("default-kafka-broker")
    Map<String, Object> kafkaConfig;

    KafkaProducer<String, String> formRequestProducer;
    KafkaConsumer<String, Form> formConsumer;

    @BeforeEach
    void setUp() {
        formConsumer = new KafkaConsumer<>(consumerConfig(), new StringDeserializer(), new ObjectMapperDeserializer<>(Form.class));
        formRequestProducer = new KafkaProducer<>(kafkaConfig, new StringSerializer(), new StringSerializer());
    }

    @AfterEach
    void tearDown() {
        formRequestProducer.close();
        formConsumer.close();
    }

    Properties consumerConfig() {
        Properties properties = new Properties();
        properties.putAll(kafkaConfig);
        properties.put(ConsumerConfig.GROUP_ID_CONFIG, "test-group-id");
        properties.put(ConsumerConfig.ENABLE_AUTO_COMMIT_CONFIG, "true");
        properties.put(ConsumerConfig.AUTO_OFFSET_RESET_CONFIG, "earliest");
        return properties;
    }

    @Test
    void testProcessor() {
        formConsumer.subscribe(Collections.singleton("forms"));
        UUID formId = UUID.randomUUID();
        formRequestProducer.send(new ProducerRecord<>("form-requests", formId.toString()));
        ConsumerRecords<String, Form> records = formConsumer.poll(Duration.ofMillis(10000));
        Form form = records.records("forms").iterator().next().value();
        assertEquals(form.id, formId.toString());
    }

}