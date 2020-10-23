package edu.gdou.D8;

import java.util.function.IntBinaryOperator;

public class Demo1 {
    public static void main(String[] args) {
        IntBinaryOperator intBinaryOperator = (int x, int y) -> {
            return x + y;
        };

        System.out.println(intBinaryOperator);
    }
}
