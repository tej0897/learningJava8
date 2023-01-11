package functionalInterfaces;

import java.util.function.Function;

public class FunctionalExample {

    static Function<String, String > function = String::toUpperCase;
    static Function<String, String> function1 = input -> input.concat("defaultString");

    public static void main(String[] args) {
        System.out.println("Uppercase Result: "+function.apply("java8"));
        System.out.println(function.andThen(function1).apply("java8"));
        System.out.println(function.compose(function1).apply("java8"));

    }
}
