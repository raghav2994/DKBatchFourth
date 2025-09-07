package org.example.javabasics.day4;

public class Student {

    public Student()
    {
        System.out.println("Student constructor");
    }

    //constructor overloading
    public Student(int age)
    {
        System.out.println("Student Constructor with parameter age: " +age);
    }
}
