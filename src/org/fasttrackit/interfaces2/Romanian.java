package org.fasttrackit.interfaces2;

public class Romanian implements Citizen{
    private int age;
    private String name;
    private long id;
    private String homeCountry;

    public Romanian(int age, String name, long id, String homeCountry) {
        this.age = age;
        this.name = name;
        this.id = id;
        this.homeCountry = homeCountry;
    }

    @Override
    public long getIdentifier() {
        return id;
    }

    @Override
    public String getHomeCountry() {
        return homeCountry;
    }

    @Override
    public boolean isVaccinated() {
        return false;
    }

    @Override
    public int getAge() {
        return age;
    }

    @Override
    public String getName() {
        return name;
    }
}
