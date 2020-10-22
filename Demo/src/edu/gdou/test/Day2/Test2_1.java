package edu.gdou.test.Day2;

import java.util.Scanner;

public class Test2_1 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int[] count = new int[101];//默认初始化为0
        int readInt = reader.nextInt();
        while (readInt != 0) {
            if (readInt > 100) {
                System.out.println("输入范围错误!");
                System.exit(0);//范围错误,直接退出程序
            }
            count[readInt] += 1;
            readInt = reader.nextInt();//再次输入
        }
        for (int i = 1; i < count.length; i++) {//遍历数组输出每个数出现的次数
            if (count[i] != 0) {
                System.out.println("数字:" + i + "  出现次数:" + count[i] + "次");
            }
        }
    }
}
