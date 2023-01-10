package FunctionalInterfaces;

// filters using grade level

import data.Student;
import data.StudentDataBase;

import java.util.List;
import java.util.function.Predicate;

public class PredicateIRLExample {

    static Predicate <Student> studentPredicate = (student) -> student.getGradeLevel()>=3;
    static Predicate <Student> studentPredicate1 = (student) -> student.getGpa()>=3.9;

    public static void filterStudentsByGrade(){
        System.out.println("Filtering As Per Grade >= 3");
            List<Student> studentList = StudentDataBase.getAllStudents();
            studentList.forEach(
                    (student) ->{
                        if (studentPredicate.test(student)){
                            System.out.println(student);
                        }
                    }
            );
    }

    public static void filterStudentsByGPA(){
        System.out.println("Filtering As Per GPA >= 3.9");
        List<Student> studentList = StudentDataBase.getAllStudents();
        studentList.forEach(
                (student) -> {
                    if(studentPredicate1.test(student)){
                        System.out.println(student);
                    }
                }
        );
    }

    public static void filteringUsingGPAAndGrade(){
        System.out.println("Filtering Using Both GPA and Grade");
        List<Student> studentList = StudentDataBase.getAllStudents();
        studentList.forEach(
                student -> {
                    if(studentPredicate.and(studentPredicate1).test(student)){
                        System.out.println(student);
                    }
                }
        );
    }

    public static void main(String[] args) {
        filterStudentsByGrade();
        filterStudentsByGPA();
        filteringUsingGPAAndGrade();
    }
}
