package org.example;

public class Array {
    public static void main(String[] args) {
        String [] stringArray = new String[3];
        stringArray[0] = "Eko";
        stringArray[1] = "Kurniawan";
        stringArray[2] = "Khanedys";


        for (int i = 0 ; i< 3 ; i++){
            System.out.println(stringArray[i]);
        }
        stringArray[0] = "Budi";

        System.out.println(stringArray[0]);

    }
}
