package cn.java.learn.H2;


public class LambdaDemo {
    public static void main(String[] args) {
// TODO 请在此使用Lambda【标准格式】调用invokeCook方法
        invokeCook(()-> System.out.println("吃饭啦！"));
    }

    private static void invokeCook(Cook cook) {
        cook.makeFood();
    }

}
