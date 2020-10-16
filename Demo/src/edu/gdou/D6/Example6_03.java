package edu.gdou.D6;

import java.util.Scanner;

public class Example6_03 {
    public static void main(String[] args) {
        Scanner reader=new Scanner(System.in);
        System.out.println("please two Integer:");
        try{
            int a=reader.nextInt();
            int b=reader.nextInt();
//            int ret=a/b;
            if(b==0){
                throw new ArithmeticException();
            }
            System.out.println("a/b="+a/b);
        }
        catch(Exception e){
            System.out.println("throw");
            System.out.println("error:"+e);
        }
        System.out.println("end");
    }
}
