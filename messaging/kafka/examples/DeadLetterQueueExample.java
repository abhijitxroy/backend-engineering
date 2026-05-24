package messaging.kafka.examples;

public class DeadLetterQueueExample {

    public void processMessage(
            String message
    ) {

        try {

            validate(message);

            System.out.println(
                    "Processed : " + message
            );

        } catch (Exception exception) {

            publishToDeadLetterQueue(
                    message
            );

        }

    }

    private void validate(
            String message
    ) {

        if (message == null) {

            throw new RuntimeException();

        }

    }

    private void publishToDeadLetterQueue(
            String message
    ) {

        System.out.println(
                "Moved To DLQ : "
                        + message
        );

    }

}