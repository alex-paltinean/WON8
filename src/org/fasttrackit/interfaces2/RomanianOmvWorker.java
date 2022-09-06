package org.fasttrackit.interfaces2;

public class RomanianOmvWorker implements Employee{
    @Override
    public long getIdentifier() {
        return 0;
    }

    @Override
    public String getHomeCountry() {
        return null;
    }

    @Override
    public boolean isVaccinated() {
        return false;
    }

    @Override
    public long getSalary() {
        return 0;
    }

    @Override
    public int getAge() {
        return 0;
    }

    @Override
    public String getName() {
        return null;
    }
}
