package FunctionalInterfaces;

import data.Student;
import data.StudentDataBase;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class SupplierExample {
    public static void main(String[] args) {
        Supplier<Student> supplier = () -> {
            return new Student("Adam",2,4.0,"male", Arrays.asList("swimming", "basketball","volleyball"));
        };

        Supplier<List<Student>> listSupplier = StudentDataBase::getAllStudents;

        System.out.println("Getting Supplies, i.e. a student: " + supplier.get());
        System.out.println("List of all the students \n" + listSupplier.get());
    }
}
