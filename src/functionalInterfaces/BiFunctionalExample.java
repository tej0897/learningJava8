package functionalInterfaces;

import data.Student;
import data.StudentDataBase;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.Predicate;

public class BiFunctionalExample {

    static BiFunction<List<Student>, Predicate<Student>, Map<String, Double>> biFunction = (students, studentPredicate) -> {
        Map<String, Double> studentGPAMap = new HashMap<>();
        students.forEach(
                student -> {
                    if (studentPredicate.test(student)){
                        studentGPAMap.put(student.getName(), student.getGpa());
                    }
                }
        );
        return studentGPAMap;
    };

    public static void main(String[] args) {
        System.out.println(biFunction.apply(StudentDataBase.getAllStudents(), PredicateIRLExample.studentPredicate1));
    }
}
