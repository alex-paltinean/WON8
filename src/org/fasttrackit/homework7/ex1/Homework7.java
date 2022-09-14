package org.fasttrackit.homework7.ex1;

public class Homework7 {
    public static void main(String[] args) {
        Company company = new Company(new EmailAdService());
        company.releaseNewFeature();
    }
}
