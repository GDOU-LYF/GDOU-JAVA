package edu.gdou.D7;

import java.util.Scanner;

public class Example7_05 {
    public static void main(String[] args) {
        String bill="tv 3200.00元 iphone2200.00元 PC 4200.00元 eat 120.25";
        Scanner reader=new Scanner(bill);//使reader输入源为上述字符串
        double total=0.0;
        reader.useDelimiter("[^0-9.]+");
        while(reader.hasNextDouble()){
            total+=reader.nextDouble();
        }
        System.out.println(total);
    }
}

