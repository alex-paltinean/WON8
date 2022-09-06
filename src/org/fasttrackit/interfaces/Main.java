package org.fasttrackit.interfaces;

public class Main {
    public static void main(String[] args) {
        Company fasttrackIT = new Company(new KFC(), 6);

        for (int i = 0; i < 5; i++) {
            fasttrackIT.sendFoodToEmployees();
        }

        fasttrackIT.printReport();
    }
}
