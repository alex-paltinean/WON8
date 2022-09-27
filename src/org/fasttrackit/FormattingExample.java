package org.fasttrackit;

import org.fasttrackit.homework.Person;

import java.util.Arrays;

public class FormattingExample {
    public static void main(String[] args) {
        String input = "a123";
        if (input.matches("\\d+")) {
            System.out.println(Integer.parseInt(input));
        } else {
            System.out.println(Integer.parseInt(input.replaceAll("\\D", "")));
        }

        String doubleInput = "asda0fsdf.a2sdffs";
        if (doubleInput.matches("\\d+\\.?\\d*")) {
            System.out.println(Double.parseDouble(doubleInput));
        } else {
            System.out.println(Double.parseDouble(doubleInput.replaceAll("[^\\d\\.]", "")));
        }

        doSomething("1", 1, 2, 3);
        doSomething("1", 1);
        doSomething("1", 1, 2, 3, 4);
    }

    private static void doSomething(String s, int... numbers) {
        for (int i : numbers) {
            System.out.println(i);
        }
    }

    private static void doSomethingElse(Person... persons) {

    }


}
