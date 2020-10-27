package edu.gdou.test.Day3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        while (true) {
            try {
                Scanner reader = new Scanner(System.in);
                int a = reader.nextInt();//reader报错
                int b = reader.nextInt();
                if (b == 0) {
                    throw new ArithmeticException("除数为0");
                }
                System.out.println(a * 1.0 / b);
                break;
            } catch (ArithmeticException e) {
                System.out.println(e.getMessage());
                break;
            } catch (InputMismatchException e) {
                System.out.print("输入了其他符号,请重新输入数据:");

            }
        }
    }
}
