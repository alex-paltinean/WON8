package org.fasttrackit.interfaces;

public interface Animal {
    String getName();

    Integer getWeight();

    default String getSummary() {
        return getName() + " : " + getWeight();
    }
}
