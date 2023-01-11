package functionalInterfaces;

public class FunctionalExample1 {

    public static String concatString(String string){
        return FunctionalExample.function1.apply(string);
    }
    public static void main(String[] args) {
        System.out.println(concatString("java8"));
    }
}
