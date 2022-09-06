package org.fasttrackit.homework;

public class Bottle {
    private int totalCapacity;
    private int availableLiquid;
    private boolean open;

    public Bottle(int totalCapacity, int availableLiquid, boolean open) {
        this.totalCapacity = totalCapacity;
        this.availableLiquid = availableLiquid;
        this.open = open;
    }

    protected void protectedMethod(){

    }

    void defaultMethod(){

    }

    private void privateMethod(){
        // some partial logic 500 lines of code
    }

    public void publicMethod(){
        // logic part 1
        privateMethod();
        // logic part 3
    }

    public boolean hasLiquid() {
        return availableLiquid > 0;
    }

    public int getAvailableLiquid() {
        return availableLiquid;
    }

    public int getEmptyCapacity() {
        return totalCapacity - availableLiquid;
    }

    public String open() {
        if (open) {
            System.out.println("org.fasttrackit.homework.Bottle is already open");
            return null;
        }
        open = true;
        return "org.fasttrackit.homework.Bottle is opened";
    }

    public String close() {
        if (!open) {
            System.out.println("org.fasttrackit.homework.Bottle is already closed");
            return null;
        }
        open = false;
        return "org.fasttrackit.homework.Bottle is closed";
    }

    public String setOpen(boolean open) {
        String actionResult = open ? "opened" : "closed";
        if (open == this.open) {
            System.out.printf("bottle is already %s%n", actionResult);
            return null;
        }
        this.open = open;
        return String.format("org.fasttrackit.homework.Bottle is %s", actionResult);
    }

    public String drink(int liquid) {
        if (liquid <= 0) {
            System.out.println("Liquid to drink must be strictly positive");
            return null;
        }
        if (!open) {
            System.out.println("org.fasttrackit.homework.Bottle is not opened");
            return null;
        }
        if (liquid > availableLiquid) {
            System.out.println("Not enough liquid");
            return null;
        }
        availableLiquid -= liquid;
        return "Remaining liquid is " + availableLiquid;
    }

    public static void main(String[] args) {
        Bottle bottle = new Bottle(500, 490, false);
        bottle.drink(100); // error message
        System.out.println(bottle.open());
        bottle.open(); // error message
        bottle.drink(600); // error message
        bottle.drink(-200); // error message
        System.out.println(bottle.drink(200));
        System.out.println(bottle.close());
        bottle.close(); // error message

        String name = "Alex";
        int age = 31;
        boolean isMarried = true;
        String phrase1 = name + " has " + age + " years and " + (isMarried ? "is married" : "is not married");
        String phrase2 = String.format("%s has %d years and is%s married", name, age, isMarried ? "" : "not");
    }

}
