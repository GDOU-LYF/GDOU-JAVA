package edu.gdou.D6;

import java.util.Scanner;

public class Example6_02 {
    public static void main(String[] args) {
        Scanner reader= new Scanner(System.in);
        double sum=0;
        int i = 0;
        try{
            System.out.println("input 6 month money");
            for (; i <6 ; i++) {
                sum+=reader.nextDouble();
            }
        }
        catch(Exception e){//e是捕获到异常类型
            System.out.println("error:"+i+"month");
        }
        finally {
            System.out.println(sum+"\t"+sum/i);
        }
    }
}
