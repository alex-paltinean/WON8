package org.fasttrackit.inheritance.main;

import org.fasttrackit.inheritance.Bike;
import org.fasttrackit.inheritance.PhysicalObject;
import org.fasttrackit.inheritance.StreetBike;

public class Main {
    public static void main(String[] args) {
        Bike bike = new Bike(30);
        StreetBike streetBike = new StreetBike(35, "blue");

        bike.honk();
        streetBike.honk();

        Bike secondBike = new StreetBike(40, "black");
        secondBike.honk();
        ((StreetBike)secondBike).getColor();
        if(bike instanceof StreetBike){
            System.out.println("not entering");
            ((StreetBike) bike).getColor();
        }


        Bike[] bikes = new Bike[3];
        bikes[0] = new Bike(20);
        bikes[1] = new StreetBike(45, "white");
        bikes[2] = new Bike(39);
        for (int i = 0; i < bikes.length; i++) {
            bikes[i].honk();
        }

        increaseSpeed(bike);
        increaseSpeed(streetBike);
//        increaseSpeed(new PhysicalObject()); -- compile error

        doSomething(bike);
        doSomething(streetBike);
        doSomething(secondBike);
    }

    private static void doSomething(Object o){
        System.out.println(o.getClass());
    }

    private static void increaseSpeed(Bike bike) {
        bike.increaseSpeed();
    }

    private static void overloading(StreetBike streetBike) {
        System.out.println(streetBike.getSpeed());
        streetBike.increaseSpeed();
        System.out.println(streetBike.getSpeed());
        streetBike.increaseSpeed(8, 7);
        System.out.println(streetBike.getSpeed());
    }

    private static void overriding(Bike bike, StreetBike streetBike) {
        bike.honk();
        streetBike.honk();
    }
}
