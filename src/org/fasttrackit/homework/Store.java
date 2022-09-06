package org.fasttrackit.homework;

public class Store {
    public static void main(String[] args) {
        System.out.println("I am main from Store");
        Bottle bottle = new Bottle(500, 200, true);
        bottle.defaultMethod();
        bottle.protectedMethod();
//        bottle.privateMethod(); - error, not visible
    }
}
