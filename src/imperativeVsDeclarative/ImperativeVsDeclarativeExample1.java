package imperativeVsDeclarative;

// sum of numbers from 0 to 100

import java.util.stream.IntStream;

public class ImperativeVsDeclarativeExample1 {
    public static void main(String[] args) {
        int sumUsingImperative=0;
        for (int i=0; i<=100;i++){
            sumUsingImperative+=i;
        }
        System.out.println("Sum using Imperative: "+ sumUsingImperative);


        // using Declarative:

        int sumUsingDeclarative = IntStream.rangeClosed(0,100)
                .sum();
        System.out.println("Sum using Declarative: " + sumUsingDeclarative);
    }
}
