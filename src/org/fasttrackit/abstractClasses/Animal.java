package org.fasttrackit.abstractClasses;

public abstract class Animal {
    private int weight;

    public Animal(int weight) {
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }

    abstract public String talk();
}
