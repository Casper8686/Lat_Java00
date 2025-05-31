package org.example;

public class Continue {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            if (i == 3) {
                continue; // lewati saat i = 3
            }
            System.out.println("i = " + i);
        }
    }
}
