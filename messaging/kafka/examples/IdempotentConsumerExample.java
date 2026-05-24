package messaging.kafka.examples;

import java.util.HashSet;
import java.util.Set;

public class IdempotentConsumerExample {

    private static final Set<String>
            processedMessages =

            new HashSet<>();

    public void process(
            String messageId,
            String payload
    ) {

        if (

                processedMessages.contains(
                        messageId
                )

        ) {

            System.out.println(
                    "Duplicate Ignored"
            );

            return;

        }

        processedMessages.add(
                messageId
        );

        System.out.println(
                "Processed : "
                        + payload
        );

    }

}