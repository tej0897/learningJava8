package FunctionalInterfaces;

// Listing the Name and Activities based on filtering conditions using Predicate and Consumer.

import data.Student;
import data.StudentDataBase;

import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class PredicateAndConsumerExample {

    Predicate<Student> studentPredicate = student -> student.getGradeLevel()>=3;
    Predicate<Student> studentPredicate1 = student -> student.getGpa()>=3.9;

    BiPredicate<Integer, Double> biPredicate = (grade, gpa) -> grade>=3 && gpa>= 3.0;

    BiConsumer<String, List<String>> biConsumer = (name, activity) -> {
        System.out.println(name + " : " + activity);
    };

    Consumer<Student> studentConsumer = student -> {
//        if (studentPredicate.and(studentPredicate1).test(student)){
//            biConsumer.accept(student.getName(), student.getActivities());
//        }
        if (biPredicate.test(student.getGradeLevel(), student.getGpa())){
            biConsumer.accept(student.getName(), student.getActivities());
        }
    };
    public void filterAndDisplayStudents(List<Student> studentList){
        studentList.forEach(studentConsumer);
    }

    public static void main(String[] args) {
        List<Student> studentList = StudentDataBase.getAllStudents();

        new PredicateAndConsumerExample().filterAndDisplayStudents(studentList);
    }
}
