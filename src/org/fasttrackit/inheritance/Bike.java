package org.fasttrackit.inheritance;

public class Bike extends PhysicalObject {
    public int tyrePressure;
    private int speed;

    public Bike(int tyrePressure) {
        System.out.println("Bike constructor start");
        this.tyrePressure = tyrePressure;
        this.speed = 10;
        System.out.println("Bike constructor end");
    }

    public Bike(int tyrePressure, int speed) {
        this.tyrePressure = tyrePressure;
        this.speed = speed;
    }

    public int getSpeed() {
        return speed;
    }

    public void increaseSpeed() {
        this.speed++;
    }

    public void increaseSpeed(int amount) {
        System.out.println("with int");
        this.speed += amount;
    }

    public void increaseSpeed(int a, int b){
        System.out.println("Two ints");

    }

    public void increaseSpeed(int... a){
        if(a.length==2){
            System.out.println("you won 1mil!");
        }
        System.out.println("Variable number of params");
    }

    public void increaseSpeed(long amount){
        System.out.println("with long");
        this.speed += amount;
    }

    public void increaseSpeed(byte amount){
        System.out.println("with byte");
        this.speed += amount;
    }

    public void increaseSpeed(byte a, int b){
        System.out.println("with byte");
        this.speed += a;
    }

    public void increaseSpeed(int b, byte a){
        System.out.println("with byte");
        this.speed += a;
    }


    public void honk() {
        System.out.println("bike hooooonk");
    }

    @Override
    public void fall() {
        System.out.println("");
    }
}
