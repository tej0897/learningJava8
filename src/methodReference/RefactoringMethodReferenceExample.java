package methodReference;

import data.Student;
import data.StudentDataBase;

import java.util.function.Predicate;

public class RefactoringMethodReferenceExample {

    static Predicate<Student> predicate = student -> student.getGradeLevel()>=3;

    static Predicate<Student> studentPredicate = RefactoringMethodReferenceExample::filterByGrade;

    public static boolean filterByGrade(Student student){
        return student.getGradeLevel()>=3;
    }

    public static void main(String[] args) {
        System.out.println(predicate.test(StudentDataBase.studentSupplier.get()));
        System.out.println(studentPredicate.test(StudentDataBase.studentSupplier.get()));
    }
}
