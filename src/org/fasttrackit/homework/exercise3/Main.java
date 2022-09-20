package org.fasttrackit.homework.exercise3;

import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        PersonData personData = new PersonData(new Employee(LocalDateTime.of(1991, 9, 25, 22, 0)));
        System.out.println(personData.getAge());
    }
}
