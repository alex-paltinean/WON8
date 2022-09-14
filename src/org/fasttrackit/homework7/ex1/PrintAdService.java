package org.fasttrackit.homework7.ex1;

public class PrintAdService implements AdvertisementProvider {
    @Override
    public void advertise(String message) {
        System.out.println(String.format("Printing newspaper with ad '%s'", message));
    }
}
