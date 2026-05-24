package messaging.kafka.examples;

import java.time.Duration;
import java.util.List;
import java.util.Properties;

import org.apache.kafka.clients.consumer.*;

public class ConsumerExample {

    public static void main(String[] args) {

        Properties properties =
                new Properties();

        properties.put(
                ConsumerConfig.BOOTSTRAP_SERVERS_CONFIG,
                "localhost:9092"
        );

        properties.put(
                ConsumerConfig.GROUP_ID_CONFIG,
                "backend-group"
        );

        properties.put(
                ConsumerConfig.KEY_DESERIALIZER_CLASS_CONFIG,
                "org.apache.kafka.common.serialization.StringDeserializer"
        );

        properties.put(
                ConsumerConfig.VALUE_DESERIALIZER_CLASS_CONFIG,
                "org.apache.kafka.common.serialization.StringDeserializer"
        );

        KafkaConsumer<String, String> consumer =
                new KafkaConsumer<>(properties);

        consumer.subscribe(
                List.of(
                        "orders-topic"
                )
        );

        while (true) {

            ConsumerRecords<String, String> records =
                    consumer.poll(
                            Duration.ofSeconds(1)
                    );

            for (ConsumerRecord<String, String> record : records) {

                System.out.println(
                        record.value()
                );

            }

        }

    }

}