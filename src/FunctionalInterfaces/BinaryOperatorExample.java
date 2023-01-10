package FunctionalInterfaces;

import java.util.Comparator;
import java.util.function.BinaryOperator;

public class BinaryOperatorExample {
    static BinaryOperator<Integer> binaryOperator = (a,b) -> a*b;
    static Comparator<Integer> comparator = Integer::compareTo;

    public static void main(String[] args) {
        System.out.println(binaryOperator.apply(4,5));

        BinaryOperator<Integer> binaryOperator1 = BinaryOperator.maxBy(comparator);
        System.out.println("Result of MaxBy: "+ binaryOperator1.apply(4,5));

        BinaryOperator<Integer> binaryOperator2 = BinaryOperator.minBy(comparator);
        System.out.println("Result of MinBy: "+ binaryOperator2.apply(4,5));
    }
}
