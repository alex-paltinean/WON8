package org.fasttrackit.homework7.ex1;

import java.time.LocalDateTime;

public class EmailAdService implements AdvertisementProvider{
    @Override
    public void advertise(String message) {
        System.out.println(String.format("Sending email with message: '%s'", message));
        
    }
}
