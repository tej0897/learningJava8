package Lambdas;

import java.util.Comparator;

public class ComparatorExample {
    public static void main(String[] args) {

        // before Java 8
        Comparator<Integer> comparator = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1.compareTo(o2);    // 0 if o1 == o2;
                                            // 1 if o1 > o2;
                                            // -1 if o1 < o2;
            }
        };
        System.out.println("Comparing 7 with 8 : " + comparator.compare(7,8));

        // After Java 8

        Comparator<Integer> comparatorLambda = (Integer a, Integer b) -> { return a.compareTo(b);};

        System.out.println("Comparing 8 with 8 : " + comparatorLambda.compare(8,8));

        Comparator<Integer> integerComparator  = (a, b) -> {return a.compareTo(b);};

        System.out.println("Comparing 10 with 8 : " + comparatorLambda.compare(10,8));

    }
}
