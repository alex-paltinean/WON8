package org.fasttrackit.interfaces2;

import java.util.ArrayList;
import java.util.List;

public class Custom {
    List<Citizen> queue = new ArrayList<>();

    public void addToQueue(Citizen c) {
        queue.add(0, c);
    }

    public void processCitizen() {
        Citizen citizen = queue.get(queue.size() - 1);
        System.out.println(citizen.getIdentifier());
        System.out.println(citizen.getName());
        queue.remove(citizen);
    }
}
