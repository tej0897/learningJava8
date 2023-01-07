package FunctionalInterfaces;

import data.Student;
import data.StudentDataBase;

import java.util.List;
import java.util.function.BiConsumer;

public class BiConsumerExample {

    public static void BiConsumerIRLExamples(){
        List<Student> studentList = StudentDataBase.getAllStudents();

        BiConsumer biConsumer = (name, activities) ->
                System.out.println(name + " : " + activities);
        studentList.forEach(student -> biConsumer.accept(student.getName(), student.getActivities()));
    }




    public static void main(String[] args) {
        BiConsumer<String, String> biConsumer = (a,b) ->
                System.out.println("Value of a is : " +a+ " and the value of b is : " +b);

        biConsumer.accept("Java", "Hello there!");

        // useCase 2:

        BiConsumer<Integer, Integer> multiply = (a, b) ->
                System.out.println("Multiplication of A and B is: " + (a*b));

        BiConsumer<Integer, Integer> divide = (a, b) ->
                System.out.println("Multiplication of A and B is: " + (a/b));

        multiply.andThen(divide).accept(20,10);

        BiConsumerIRLExamples();
    }
}
