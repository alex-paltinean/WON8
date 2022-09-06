package org.fasttrackit.interfaces2;

public interface Citizen extends Person {
    long getIdentifier();

    String getHomeCountry();

    boolean isVaccinated();
}
