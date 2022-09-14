package org.fasttrackit.homework7.ex2;

public class Student {
    private static int gradeSum = 0;
    private static int studentNumber = 0;

    private final int grade;
    private final String name;

    public Student(int grade, String name) {
        this.grade = grade;
        this.name = name;
        gradeSum += grade;
        studentNumber++;
    }

    public int getGrade() {
        return grade;
    }

    public String getName() {
        return name;
    }

    public static double averageGrade() {
        return (double) gradeSum / studentNumber;
    }
}
