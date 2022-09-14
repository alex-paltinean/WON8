package org.fasttrackit.homework7.ex1;

public class FacebookAdService implements AdvertisementProvider, DMProvider {
    @Override
    public void advertise(String message) {
        System.out.println(String.format("Posting '%s' to Facebook", message));
    }

    @Override
    public void sendMessage(String message) {

    }
}
