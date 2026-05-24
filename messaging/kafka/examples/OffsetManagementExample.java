package messaging.kafka.examples;

import java.time.Duration;
import java.util.List;
import java.util.Properties;

import org.apache.kafka.clients.consumer.*;

public class OffsetManagementExample {

    public static void main(String[] args) {

        Properties properties =
                new Properties();

        properties.put(
                ConsumerConfig.ENABLE_AUTO_COMMIT_CONFIG,
                false
        );

        KafkaConsumer<String,String> consumer =
                new KafkaConsumer<>(
                        properties
                );

        consumer.subscribe(
                List.of(
                        "orders-topic"
                )
        );

        while (true) {

            ConsumerRecords<String,String>
                    records =

                    consumer.poll(
                            Duration.ofMillis(
                                    1000
                            )
                    );

            records.forEach(
                    System.out::println
            );

            consumer.commitSync();

        }

    }

}