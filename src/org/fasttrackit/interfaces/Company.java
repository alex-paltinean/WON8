package org.fasttrackit.interfaces;

public class Company {
    private FoodProvider foodProvider;
    private long numberOfEmployees;

    public Company(FoodProvider foodProvider, long numberOfEmployees) {
        this.foodProvider = foodProvider;
        this.numberOfEmployees = numberOfEmployees;
    }

    public void sendFoodToEmployees() {
        for (int i = 0; i < numberOfEmployees; i++) {
            System.out.println(foodProvider.deliverFood() + " #" + foodProvider.getDeliveredQuantity());
        }
    }

    public void printReport() {
        System.out.println(String.format("%s has delivered %d menus.",
                foodProvider.getName(),
                foodProvider.getDeliveredQuantity()));
    }
}
