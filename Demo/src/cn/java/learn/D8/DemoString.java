package cn.java.learn.D8;

import java.util.Arrays;

public class DemoString {
    public static void main(String[] args) {
        String s1 = "hello";
        String s2 = "hello";
        String s3 = "HELLO";
        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s3));
        System.out.println(s2.equalsIgnoreCase(s3));
        System.out.println(s1.concat(s3));
        System.out.println(s1.charAt(0));
        System.out.println(s1.indexOf("llo"));
        System.out.println(s1.substring(2));
        char[] chars = s1.toCharArray();
        System.out.println(Arrays.toString(chars));
        System.out.println(
                s1.replace("llo", "LLO")
        );

        System.out.println("================");
//        System.out.println(Math.ceil());
    }
}
