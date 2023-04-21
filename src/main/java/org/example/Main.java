package org.example;

public class Main {
    static int count_bernd = 0;
    static int count_berta = 0;
    public static void main(String[] args) {
        int times = 14;

        bernd(times);
        System.out.println("Bernd count: " + count_bernd);

        berta(times);
        System.out.println("Berta count: " + count_berta);
    }

    private static void bernd(double b) {
        if (b == 0) {
            // System.out.println(1);
            count_bernd++;
        } else {
            bernd(Math.floor(b/2));
            // System.out.println(1);
            count_bernd++;
            bernd(b/2);
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