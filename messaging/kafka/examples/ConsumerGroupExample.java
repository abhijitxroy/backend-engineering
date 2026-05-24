package messaging.kafka.examples;

public class ConsumerGroupExample {

    public static void main(String[] args) {

        System.out.println(
                "Consumer Group distributes partition ownership"
        );

        System.out.println(
                "One partition -> One consumer inside same group"
        );

        System.out.println(
                "Different consumer groups receive same message"
        );

    }

}