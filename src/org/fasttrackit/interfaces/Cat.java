package org.fasttrackit.interfaces;

public class Cat implements Animal{
    @Override
    public String getName() {
        return "cat";
    }

    @Override
    public Integer getWeight() {
        return 2;
    }

    public static void main(String[] args) {
        Cat cat = new Cat();
        System.out.println(cat.getSummary());
    }
}
