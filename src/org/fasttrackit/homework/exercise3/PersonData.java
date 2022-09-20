package org.fasttrackit.homework.exercise3;

import java.time.LocalDateTime;
import java.time.Period;

public class PersonData {
    private Person person;

    public PersonData(Person person) {
        this.person = person;
    }

    public int getAge() {
        LocalDateTime now = LocalDateTime.now();
        LocalDateTime birthDate = person.getBirthDate();

        Period between = Period.between(birthDate.toLocalDate(), now.toLocalDate());
        return between.getYears();
    }
}
