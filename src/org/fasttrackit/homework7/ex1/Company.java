package org.fasttrackit.homework7.ex1;

public class Company {
    private AdvertisementProvider advertisementProvider;

    public Company(AdvertisementProvider advertisementProvider) {
        this.advertisementProvider = advertisementProvider;
    }

    public void releaseNewFeature() {
        // some code;
        advertisementProvider.advertise("We have release a new feature");
    }
}
