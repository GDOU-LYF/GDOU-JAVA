package edu.gdou.excise;

import java.util.Scanner;

public class Demo5_79_9 {
    public static void main(String[] args) {
        Scanner reader=new Scanner(System.in);
        int st=reader.nextInt();
        int h,m,s;
        h=st/3600;
        st=st-h*3600;
        m=st/60;
        st=st-m*60;
        s=st;
        System.out.println(h+" "+m+" "+s);
    }
}
