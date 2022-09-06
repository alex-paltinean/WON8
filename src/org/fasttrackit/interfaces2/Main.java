package org.fasttrackit.interfaces2;

public class Main {
    public static void main(String[] args) {
        Custom custom = new Custom();

        Rebel rebel = new Rebel(18, "Mike");
        Romanian romanian = new Romanian(18, "Joe", 1234145, "Romania");
        RomanianOmvWorker monica = new RomanianOmvWorker();

        custom.addToQueue(romanian);
        custom.addToQueue(monica);
    }
}
