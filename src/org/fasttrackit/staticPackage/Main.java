package org.fasttrackit.staticPackage;

import org.fasttrackit.accessmodifiers.Person;
import org.fasttrackit.homework.Store;

public class Main {
    public static void main(String[] args) {
        Airplane a1 = new Airplane(34, "military");
        Airplane a2 = new Airplane(12, "commercial");

        System.out.println(a1.getFuelLeft()); //34
        System.out.println(a2.getFuelLeft()); //12

        a1.setFuelLeft(25);

        System.out.println(a1.getFuelLeft()); //25
        System.out.println(a2.getFuelLeft()); //12

        System.out.println(Airplane.getGravityCoeficient()); //

        Person.main(args);
        Store.main(args);
    }
}
