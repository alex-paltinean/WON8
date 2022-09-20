package org.fasttrackit.homework.exercise3;

import java.time.LocalDateTime;

public class Employee implements Person{
    private LocalDateTime birthDate;

    public Employee(LocalDateTime birthDate) {
        this.birthDate = birthDate;
    }

    @Override
    public LocalDateTime getBirthDate() {
        return birthDate;
    }

    @Override
    public String getFirstName() {
        return null;
    }

}
