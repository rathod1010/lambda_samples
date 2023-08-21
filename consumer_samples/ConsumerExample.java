package consumer_samples;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerExample {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David");

        // Using a Consumer to print each element in the list
        Consumer<String> printName = (name) -> System.out.println(name);
        names.forEach(printName);
    }
}
