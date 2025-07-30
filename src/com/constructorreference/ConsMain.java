package com.constructorreference;

public class ConsMain {
    public static void main(String[] args) {

        System.out.println("Learning constructor reference");

        // Constructor Reference
        // ClassName::new
        Provider provider = Student::new;
        Student student = provider.getStudent();
        student.display();
    }
}
