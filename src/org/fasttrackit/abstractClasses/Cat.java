package org.fasttrackit.abstractClasses;

public class Cat extends Animal {

    public Cat(int weight) {
        super(weight);
    }

    @Override
    public String talk() {
        return "miau";
    }
}
