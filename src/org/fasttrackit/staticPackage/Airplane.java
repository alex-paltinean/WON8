package org.fasttrackit.staticPackage;

public class Airplane {
    private static final double GRAVITY_COEFICIENT = 9.8;
    private double fuelLeft;
    private String type;

    public Airplane(double fuelLeft, String type) {
        this.fuelLeft = fuelLeft;
        this.type = type;
    }

    public static double getGravityCoeficient() {
//        this.type - error. who is this?
//        getType() - error
        return GRAVITY_COEFICIENT;
    }

    public double getFuelLeft() {
        double d = GRAVITY_COEFICIENT;
        getType();
        getGravityCoeficient();
        return fuelLeft;
    }

    public String getType() {
        return type;
    }

    public void setFuelLeft(double fuelLeft) {
        this.fuelLeft = fuelLeft;
    }

    public void setType(String type) {
        this.type = type;
    }
}
