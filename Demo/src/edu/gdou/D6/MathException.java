package edu.gdou.D6;

import java.util.Scanner;

public class MathException {
    public static void main(String[] args) {
        Scanner reader= new Scanner(System.in);
        try{
            int a=reader.nextInt();
            int b=reader.nextInt();
            System.out.println("a/b="+a/b);
        }
        catch(Exception e){
            System.out.println("error");
        }
        System.out.println("end");
//        catch(ArithmeticException e){
//            System.out.println("program error\t"+"b==0");
//        }
//        catch(InputMismatchException e){
//            System.out.println("program error\t"+"type error");
//        }
    }
}
