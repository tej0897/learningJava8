package LocalVariablesRestrictionsExample;

import java.util.function.Consumer;

public class LambdaVariable1 {

    public static void main(String[] args) {
        int i= 0;

        Consumer<Integer> consumer = i1 -> {     // not supposed to use i, can use i1
            //  int i = 2;      // cannot reassign the value of i
            System.out.println("Value of i is: "+i);
        };
        //i = i+1;    // this is also not allowed since it is in method's scope.
    }
}
