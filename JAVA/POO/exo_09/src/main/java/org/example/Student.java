package org.example;

public class Student {

    private String name;
    private int age;

    public Student(String name, int age) throws InvalidAgeException {
        if (age < 0) {
            throw new InvalidAgeException();
        }
        this.name = name;
        this.age = age;
    }
}
