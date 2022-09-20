package org.fasttrackit.collections;

import java.util.*;

public class SetExample {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();

        set.add(1);
        set.add(2);
        set.add(1);
        set.add(0);
        set.add(3);
        set.add(123);
        set.add(234);

        System.out.println(set);

        SortedSet<DescendingInteger> sortedSet = new TreeSet<>();
        sortedSet.add(new DescendingInteger(1));
        sortedSet.add(new DescendingInteger(2));
        sortedSet.add(new DescendingInteger(1));
        sortedSet.add(new DescendingInteger(0));
        sortedSet.add(new DescendingInteger(3));
        sortedSet.add(new DescendingInteger(123));
        sortedSet.add(new DescendingInteger(234));

        System.out.println(sortedSet);

        SortedSet<Integer> sorted = new TreeSet<>(new DescendingIntegerComparator());
        sorted.add(1);
        sorted.add(2);
        sorted.add(1);
        sorted.add(0);
        sorted.add(3);
        sorted.add(123);
        sorted.add(234);
        System.out.println(sorted);
    }
}

class DescendingIntegerComparator implements Comparator<Integer> {

    @Override
    public int compare(Integer o1, Integer o2) {
        return o2 - o1;
    }
}

class DescendingInteger implements Comparable<DescendingInteger> {
    private Integer value;

    public DescendingInteger(Integer value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value.toString();
    }

    @Override
    public int compareTo(DescendingInteger o) {
        return -(value - o.value);
    }
}
