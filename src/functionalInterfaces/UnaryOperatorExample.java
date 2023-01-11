package functionalInterfaces;

import java.util.function.UnaryOperator;

public class UnaryOperatorExample {

    static UnaryOperator<String> unaryOperator = string -> string.concat("_default");

    public static void main(String[] args) {
        System.out.println(unaryOperator.apply("java8"));
    }
}
