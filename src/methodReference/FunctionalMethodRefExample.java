package methodReference;

import java.util.function.Function;

public class FunctionalMethodRefExample {

    static Function<String, String> uppercaseUsingLambda = string -> string.toUpperCase();

    static Function<String, String> uppercaseUsingMethodReference = String::toUpperCase;

    public static void main(String[] args) {
        System.out.println(uppercaseUsingLambda.apply("java8"));
        System.out.println(uppercaseUsingMethodReference.apply("java8"));
    }
}
