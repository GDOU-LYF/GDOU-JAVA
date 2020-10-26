package cn.java.learn.H2;

public class Lambda2Demo {
    public static void main(String[] args) {
        invokeCalc(120, 130, (a, b) -> a+b);
    }

    private static void invokeCalc(int a, int b, Calculator calculator) {
        int result = calculator.calc(a, b);
        System.out.println("结果是：" + result);
    }

}
