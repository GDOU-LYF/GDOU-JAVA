package edu.test.T5;

import java.io.*;

public class abc {
    public static void main(String args[]) {
        int i, s = 0;
        int a[] = {10, 15, 20, 25, 30, 35, 40, 45, 50};
        for (i = 0; i < a.length; i++){
            if (a[i] % 3 ==0 )s += a[i];
        }

        System.out.println("s=" + s);
    }
}

