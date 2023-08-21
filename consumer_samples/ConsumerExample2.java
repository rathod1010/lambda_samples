package consumer_samples;

import java.util.function.Consumer;

public class ConsumerExample2 {
    public static void main(String[] args) {
        Consumer<String> printUpperCase = (str) -> System.out.println(str.toUpperCase());
        Consumer<String> printLength = (str) -> System.out.println("Length: " + str.length());

        // Chain two Consumers together
        Consumer<String> combinedConsumer = printUpperCase.andThen(printLength);

        combinedConsumer.accept("Hello, World!");
    }
}
