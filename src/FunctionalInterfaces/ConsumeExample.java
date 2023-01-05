package FunctionalInterfaces;

import java.util.function.Consumer;

public class ConsumeExample {

    public static void main(String[] args) {
        // accepts an input, performs uppercase operation on it and displays the result.
        Consumer<String> consumer = (input) -> System.out.println(input.toUpperCase());

        consumer.accept("hi world, Hello there!!");
    }
}
