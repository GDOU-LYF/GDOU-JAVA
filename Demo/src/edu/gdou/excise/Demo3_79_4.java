package edu.gdou.excise;

import java.util.Scanner;

public class Demo3_79_4 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int[] arraryA = new int[4];
        for (int i = 0; i < arraryA.length; i++) {
            arraryA[i] = reader.nextInt();
        }
        for (int i = 0; i < arraryA.length; i++) {
            for (int j = i; j < arraryA.length ; j++) {
                if (arraryA[i] > arraryA[j]) {
                    int temp = arraryA[i];
                    arraryA[i] = arraryA[j];
                    arraryA[j] = temp;
                }
            }
        }
        for (int j : arraryA) {
            System.out.print(j + "\t");
        }
        System.out.println();
    }
}
