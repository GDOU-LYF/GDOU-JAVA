package edu.gdou.D7;

import java.math.BigInteger;

public class Example7_07 {
    public static void main(String[] args) {
        BigInteger sum = new BigInteger("0");
        /*将 BigInteger 的十进制字符串表示形式转换为 BigInteger。该字符串表示形式包括一个可选的减号，后跟一个或多个十进制数字序列。
        字符到数字的映射由 Character.digit 提供。该字符串不能包含任何其他字符（例如，空格）。
         */
        BigInteger item = new BigInteger("1"),
                ONE = new BigInteger("1"),
                i = ONE,
                n = new BigInteger("30");
        while(i.compareTo(n)<=0){//i 与 n比较,当此 BigInteger 在数值上小于、等于或大于 n 时，返回 -1，0，或 1。
            /*
            将此 BigInteger 与指定的 BigInteger 进行比较。对于针对六个布尔比较运算符 (<, ==, >, >=, !=, <=) 中的每一个运算符的各个方法，优先提供此方法。
            执行这些比较的建议语句是：(x.compareTo(y) <op> 0)，其中 <op> 是六个比较运算符之一。
             */
            sum=sum.add(item);//返回其值为 (this + val) 的 BigInteger。
            System.out.println("sum:"+sum+"\t i:"+(i));
            i=i.add(ONE);
            item=item.multiply(i);//返回其值为 (this * val) 的 BigInteger。
        }
        System.out.println(sum.toString());
    }
}
