package Lambdas;

public class RunnableExample {
    public static void main(String[] args) {

        // before Java 8

        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("Inside Runnable 1!");
            }
        };
        new Thread(runnable).start();

        // After Java 8

        // Method 1

        Runnable runnable1 = () -> {
            System.out.println("Inside thread using Lambda");
        };
        new Thread(runnable1).start();

        // Method 2

        Runnable runnable2 = () -> System.out.println("Inside Runnable using Lambda 2");
        new Thread(runnable2).start();

        // Method 3

        new Thread(
                () -> System.out.println("Inside Runnable using Lambda 3")
        ).start();
    }
}
