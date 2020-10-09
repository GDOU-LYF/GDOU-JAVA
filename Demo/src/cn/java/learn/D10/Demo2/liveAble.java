package cn.java.learn.D10.Demo2;

public interface liveAble {
    public abstract void eat();

    public abstract void sleep();

    public default void fly(){
        System.out.println("fly");
    }

    public static void runStatic(){
        System.out.println("static-run");
    }

//    default void func(){
//        func1();
//        func2();
//    }

}
