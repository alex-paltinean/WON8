package org.fasttrackit.homework7.ex2;

public class Main {

    public static void main(String[] args) {
        new Student(6, "Mark");
        new Student(10, "Maria");
        new Student(8, "Joshua");

        System.out.println(Student.averageGrade());
    }
}
