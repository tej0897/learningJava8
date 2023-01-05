package FunctionalInterfaces;

import data.Student;
import data.StudentDataBase;

import java.util.List;
import java.util.function.Consumer;

public class ConsumerIRL {
    public static void main(String[] args) {
        printName();
        printNameAndActivities();
        printNameAndActivitiesTwo();
    }
    public static void printName(){
        Consumer consumer = System.out::println;
        List<Student> studentList = StudentDataBase.getAllStudents();
        studentList.forEach(consumer);
        System.out.println("\n");
    }
    public static void printNameAndActivities(){
        Consumer<Student> consumer = (student) -> System.out.println("Name: " +student.getName()+ " \t Activity: " + student.getActivities());
        List<Student> studentList = StudentDataBase.getAllStudents();
        studentList.forEach(consumer);
    }
    public static void printNameAndActivitiesTwo(){
        Consumer<Student> consumer = (student) -> System.out.println(student.getName());
        Consumer<Student> consumer1 = (student) -> System.out.println(student.getActivities());
        List<Student> studentList = StudentDataBase.getAllStudents();
        studentList.forEach(consumer.andThen(consumer1));
    }

}
