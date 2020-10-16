package edu.gdou.JAVA.Day01;

public class test01 {
    public static void main(String[] args) {
        int sum;
        int ret = 0;
        final int MAX=10;
        for (int i = 1; i <= MAX; i++) {
            sum = 1;
            for (int j = 2; j <= i; j++) {//求阶乘
                sum *= j;
            }
            ret += sum;//对每个阶乘累加
        }
        System.out.println(ret);

    }

}
