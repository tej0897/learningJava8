package methodReference;

import data.Student;
import data.StudentDataBase;

import java.util.function.Consumer;

public class ConsumerMethodRefExample {

    static Consumer<Student> studentConsumer = student -> System.out.println(student);
    static Consumer<Student> studentConsumer1 = System.out::println;

    public static void main(String[] args) {
        StudentDataBase.getAllStudents().forEach(studentConsumer);
        StudentDataBase.getAllStudents().forEach(studentConsumer1);
    }
}
