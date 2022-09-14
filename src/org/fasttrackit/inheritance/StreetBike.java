package org.fasttrackit.inheritance;

public class StreetBike extends Bike {
    private String color;

    public StreetBike(int tyrePressure, String color) {
        super(tyrePressure);
        System.out.println("Street bike constructor start");
        this.color = color;
        System.out.println("Street bike constructor end");
    }

    public String getColor() {
        return color;
    }

    @Override
    public void honk(){
//        super.honk();
        System.out.println("street bike hooonk");
    }

}
