package org.fasttrackit.abstractClasses;

public class Dog extends Animal {

    public Dog(int weight) {
        super(weight);
    }

    @Override
    public String talk() {
        return "ham-ham";
    }
}
