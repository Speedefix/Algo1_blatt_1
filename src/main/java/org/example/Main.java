package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    static int count_my = 0;
    static int count_bernd = 0;
    static int count_berta = 0;

    static List<Integer> myList = new ArrayList<>();
    static List<Integer> berndList = new ArrayList<>();
    static List<Integer> bertaList = new ArrayList<>();

    public static void main(String[] args) {
        int lowerBound = 0;
        int upperBound = 20;

        for (int i = lowerBound; i < upperBound; i++) {
            runStrategies(i);
        }

        for (int startingValue = lowerBound; startingValue < upperBound; startingValue++) {
            System.out.println("input: " + startingValue);
            System.out.println("My count: " + myList.get(startingValue - lowerBound));
            System.out.println("Bernd count: " + berndList.get(startingValue - lowerBound));
            System.out.println("Berta count: " + bertaList.get(startingValue - lowerBound));

            System.out.println("----------------------");
        }
    }

    private static void runStrategies(double startingValue) {
        count_my = 0;
        count_bernd = 0;
        count_berta = 0;

        my(startingValue);
        myList.add(count_my);

        bernd(startingValue);
        berndList.add(count_bernd);

        berta(startingValue);
        bertaList.add(count_berta);
    }


    private static void my(double b) {
        if (b == 0) {
            // System.out.println(1);
            count_my++;
        } else {
            my(b-1);
            // System.out.println(1);
            count_my++;
            my(b-1);
        }
    }
    private static void bernd(double b) {
        if (b == 0) {
            // System.out.println(1);
            count_bernd++;
        } else {
            bernd(Math.floor(b/2));
            // System.out.println(1);
            count_bernd++;
            bernd(Math.floor(b/2));
        }
    }

    private static void berta(double b) {
        if (b == 0) {
            // System.out.println(1);
            count_berta++;
        } else {
            // System.out.println(1);
            count_berta++;
            berta(b - 1);
        }
    }
}