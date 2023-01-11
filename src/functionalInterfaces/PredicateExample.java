package functionalInterfaces;

import java.util.function.Predicate;

public class PredicateExample {
    static Predicate<Integer> evenCheck = (number) -> {return number%2==0;};
    static Predicate<Integer> evenCheck2 = (number) -> number%2==0;
    static Predicate<Integer> divisibleBy5Check = (number) -> number%5==0;

    public static void predicateAnd(){
        System.out.println("Predicate And OP: " + divisibleBy5Check.and(evenCheck2).test(20));
        System.out.println("Predicate And OP: " + divisibleBy5Check.and(evenCheck2).test(4));
    }

    public static void predicateOr(){
        System.out.println("Predicate Or OP: " + divisibleBy5Check.or(evenCheck2).test(20));
        System.out.println("Predicate Or OP: " + divisibleBy5Check.or(evenCheck2).test(7));
    }

    public static void predicateNegate(){
        System.out.println("Predicate Or Negated Result: " + divisibleBy5Check.or(evenCheck2).negate().test(20));
        System.out.println("Predicate And Negated Result: " + divisibleBy5Check.and(evenCheck2).negate().test(7));
    }

    public static void main(String[] args) {
        System.out.println(evenCheck.test(2));
        System.out.println(evenCheck2.test(3));
        predicateAnd();
        predicateOr();
        predicateNegate();
    }
}
