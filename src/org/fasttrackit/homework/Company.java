package org.fasttrackit.homework;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Company {
    private List<Person> employees = new ArrayList<>();

    public void employ(Person person) {
        if (person.isManager() && this.hasManager()) {
            System.out.println("Already has a manager");
        }
        employees.add(person);
    }

    private boolean hasManager() {
        for (Person p : employees) {
            if (p.isManager()) {
                return true;
            }
        }
        return false;
    }

    public List<Person> getPersonsOlder(int age) {
        List<Person> result = new ArrayList<>();
        Iterator<Person> iterator = employees.iterator();
        while (iterator.hasNext()) {
            Person currentPerson = iterator.next();
            if (currentPerson.age() > age) {
                result.add(currentPerson);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Company company = new Company();
        company.employ(new Person("Alex", 31, "welder"));
        company.employ(new Person("John", 23, "manager"));
        System.out.println(company.getPersonsOlder(20));
    }
}
