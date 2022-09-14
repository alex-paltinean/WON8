package org.fasttrackit.homework7.extra;

public class Algorithm {

    public static void main(String[] args) {
        int[] ints = {8, 7, 2, 5, 3, 1};
        printAllPairs(ints, 10);
        printAllTriplets(ints, 10);
    }

    public static void printAllPairs(int[] array, int target) {
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] + array[j] == target) {
                    System.out.println(String.format("%d + %d = %d", array[i], array[j], target));
                }
            }
        }
    }

    public static void printAllTriplets(int[] array, int target) {
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                for (int k = j + 1; k < array.length; k++) {
                    if (array[i] + array[j] + array[k] == target) {
                        System.out.println(String.format("%d + %d + %d = %d", array[i], array[j], array[k], target));
                    }
                }
            }
        }
    }
}
