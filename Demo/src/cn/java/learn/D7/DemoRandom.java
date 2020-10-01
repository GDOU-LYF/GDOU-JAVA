package cn.java.learn.D7;

import java.util.Random;

public class DemoRandom {
    public static void main(String[] args) {
        Random r=new Random();
        for (int i = 0; i < 30; i++) {
            System.out.print(r.nextInt(30)+1+"\t");
        }
    }
}
