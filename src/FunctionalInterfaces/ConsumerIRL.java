package FunctionalInterfaces;

import data.Student;
import data.StudentDataBase;

import java.util.List;
import java.util.function.Consumer;

public class ConsumerIRL {

    static Consumer<Student> consumer = (student) -> System.out.println(student.getName());
    static Consumer<Student> consumer1 = (student) -> System.out.println(student.getActivities());
    static Consumer consumer2 = System.out::println;

    public static void printName(){
        System.out.println("printName");
        List<Student> studentList = StudentDataBase.getAllStudents();
        studentList.forEach(consumer2);
        System.out.println("\n");
    }
    public static void printNameAndActivities(){
        System.out.println("printNameAndActivities");
        Consumer<Student> consumer = (student) ->
                System.out.println("Name: " +student.getName()+ " \t Activity: " + student.getActivities());
        List<Student> studentList = StudentDataBase.getAllStudents();
        studentList.forEach(consumer);
    }
    public static void printNameAndActivitiesTwo(){
        System.out.println("printNameAndActivitiesTwo");
        List<Student> studentList = StudentDataBase.getAllStudents();
        studentList.forEach(consumer.andThen(consumer1));
    }
    public static void printNameAndActivitiesWithCondition(){
        System.out.println("printNameAndActivitiesWithCondition");
        List<Student> studentList = StudentDataBase.getAllStudents();
        studentList.forEach(
                (student) -> {
                    if (student.getGradeLevel() >= 3){
                        consumer.andThen(consumer1).accept(student);
                    }
                }
        );
    }


    public static void main(String[] args) {
        printName();
        printNameAndActivities();
        printNameAndActivitiesTwo();
        printNameAndActivitiesWithCondition();
    }

}
