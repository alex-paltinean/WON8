package org.fasttrackit.accessmodifiers;

import org.fasttrackit.homework.Bottle;

public class Person {
    public static void main(String[] args) {
        System.out.println("I am main from Person");
        Bottle bottle = new Bottle(500, 100, false);
//        bottle.defaultMethod(); - error, not visible
//        bottle.protectedMethod();-  error, not visible
//        bottle.privateMethod(); - error, not visible


    }
}
