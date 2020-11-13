package edu.test.T4;

public class J_Test {
    public static void mb_method(StringBuffer x, StringBuffer y) {
        x.append(y);
        y = x;
    }

    public static void main(String args[]) {
        StringBuffer a = new StringBuffer("A");
        StringBuffer b = new StringBuffer("B");
        mb_method(a, b);
        System.out.println(a + "," + b);
    }
}
