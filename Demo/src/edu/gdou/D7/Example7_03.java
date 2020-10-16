package edu.gdou.D7;

import java.util.StringTokenizer;

public class Example7_03 {
    public static void main(String[] args) {//StringTokenizer类的使用
        String s = "I am Jame ,,, You are Jerry,and he is Tom";
        StringTokenizer fenxi = new StringTokenizer(s, " ,");
        int number = fenxi.countTokens();//取单词个数
        while (fenxi.hasMoreTokens()) {//判断是否还有可读单词
            String str = fenxi.nextToken();//取下一个单词
            System.out.println(str);
        }
        System.out.println("word number:" + number);
    }
}

