package org.fasttrackit.homework;

import java.util.ArrayList;

public class PassedByReference {

    public static void main(String[] args) {
        Basket basket = new Basket(new ArrayList<>(), 5);
        doSomething(basket);
        System.out.println(basket.getMaxCapacity());
    }

    public static int doSomething(Basket basket){
        // other code
        return 10;
    }
}
