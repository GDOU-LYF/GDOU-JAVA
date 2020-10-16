package edu.gdou.JAVA.Day01;

//import java.util.Random;

public class test02 {

    public static void main(String[] args) {
//        Random rd = new Random();
        int max, min;//取最大值和最小值
        int count = 0;//记录大于50的个数
        int[] a = new int[100];
        max = min = 0;
        for (int i = 0; i < a.length; i++) {
            a[i] = (int)(Math.random()*100);//nextInt的范围为:[0,n);
            if (a[i] > 50) {//记录大于50的数
                count += 1;
            }
            if (i == 0 || a[i] > max) {//利用逻辑陷阱 一行判断
                //若i==0 为真,不进行 a[i] > max 判断 直接出进入
                //若i!=0 ,进行a[i]>max判断
                max = a[i];
            }
            if (i == 0 || a[i] < min) {//同理
                min = a[i];
            }
        }
        System.out.println("生成的随机数为:");
        for (int i = 0, j = 0; i < a.length; i++) {
            j++;
            if (j % 10 != 0) {
                System.out.print(a[i] + "\t");
            } else {
                System.out.println(a[i]);
                j = 0;
            }

        }
        System.out.println("最大值:" + max + " 最小值:" + min);
        System.out.println("大于50的数值有:" + count + "个");
    }
}
