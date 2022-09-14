package org.fasttrackit.inheritance;

public class Vehicle extends PhysicalObject{
    private String licensePlate;

    public Vehicle(String licensePlate) {
        this.licensePlate = licensePlate;
    }

    @Override
    public void fall() {
        System.out.println("A vehicle is falling!");
    }
}
