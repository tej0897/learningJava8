package imperativeVsDeclarative;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ImperativeVsDeclarativeExample2 {
    public static void main(String[] args) {

        List<Integer> integerList = Arrays.asList(1, 2, 2, 3, 4, 4, 5, 5, 6, 7, 7, 8, 8, 8, 9);

        // Imperative Style of coding

        List<Integer> uniqueList = new ArrayList<>();
        for (Integer integer : integerList) {
            while (!uniqueList.contains(integer)) {
                uniqueList.add(integer);
            }
        }
        System.out.println("Using Imperative: " + uniqueList);

        // Declarative Style of coding


        List<Integer> uniqueList2 = integerList.stream().distinct().toList();
        System.out.println("Using Declarative: " + uniqueList2);

    }
}
