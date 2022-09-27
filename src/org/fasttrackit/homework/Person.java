package org.fasttrackit.homework;

public record Person(String name, int age, String position) {

    public boolean isManager() {
        return position.equals("manager");
    }
}
