package org.fasttrackit.interfaces;

import javax.print.attribute.standard.MediaSize;

public class McDonalds implements FoodProvider {
    public static final String NAME = "mcDonalds";
    private int quantity = 0;

    @Override
    public String deliverFood() {
        quantity++;
        return "burger";
    }

    @Override
    public int getDeliveredQuantity() {
        return quantity;
    }

    @Override
    public String getName() {
        return NAME;
    }
}
