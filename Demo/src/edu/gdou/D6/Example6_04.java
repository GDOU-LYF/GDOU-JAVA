package edu.gdou.D6;

import java.util.Scanner;

public class Example6_04 {
    public static void main(String [] args){
        try{
            Scanner reader=new Scanner(System.in);
            System.out.println("name,age:");
            String name=reader.next();
            int age =reader.nextInt();
            if (age<0){
                throw new MyException("年龄不能为负");//主动抛出异常,使用自己的异常类
            }
            System.out.println("name:"+name+"\tage:"+age);
        }
        catch(Exception e){
            System.out.println("");//输出异常内容
        }
    }
}
