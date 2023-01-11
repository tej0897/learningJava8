package ConstructorReferenceExample;

import data.Student;

import java.util.function.Supplier;

public class ConstructorRefExample {

    static Supplier<Student> studentPredicate = Student::new;

    public static void main(String[] args) {
        System.out.println(studentPredicate.get());
    }
}
