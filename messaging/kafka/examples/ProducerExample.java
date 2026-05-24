package messaging.kafka.examples;

import java.util.Properties;

import org.apache.kafka.clients.producer.*;

public class ProducerExample {

    public static void main(String[] args) {

        Properties properties =
                new Properties();

        properties.put(
                ProducerConfig.BOOTSTRAP_SERVERS_CONFIG,
                "localhost:9092"
        );

        properties.put(
                ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG,
                "org.apache.kafka.common.serialization.StringSerializer"
        );

        properties.put(
                ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG,
                "org.apache.kafka.common.serialization.StringSerializer"
        );

        properties.put(
                ProducerConfig.ACKS_CONFIG,
                "all"
        );

        properties.put(
                ProducerConfig.ENABLE_IDEMPOTENCE_CONFIG,
                true
        );

        KafkaProducer<String, String> producer =
                new KafkaProducer<>(properties);

        ProducerRecord<String, String> record =
                new ProducerRecord<>(
                        "orders-topic",
                        "ORDER-1001",
                        "Order Created"
                );

        producer.send(
                record,
                (metadata, exception) -> {

                    if (exception == null) {

                        System.out.println(
                                metadata.partition()
                        );

                    }

                }
        );

        producer.close();

    }

}