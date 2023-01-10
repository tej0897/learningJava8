package FunctionalInterfaces;

import data.Student;
import data.StudentDataBase;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

public class FunctionalIRLExample {

    static Function<List<Student>, Map<String, Double>> mapFunction = students ->
    {
        Map<String, Double> studentGPAMap = new HashMap<>();
        students.forEach(
                student -> {
                    if (PredicateIRLExample.studentPredicate.test(student)){
                        studentGPAMap.put(student.getName(), student.getGpa());
                    }
                }
        );
        return studentGPAMap;
    };

    public static void main(String[] args) {
        System.out.println(mapFunction.apply(StudentDataBase.getAllStudents()));
    }
}
