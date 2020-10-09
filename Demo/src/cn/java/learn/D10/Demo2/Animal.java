package cn.java.learn.D10.Demo2;

public class Animal implements liveAble {
    @Override
    public void eat() {
        System.out.println("eat");
    }

    @Override
    public void fly() {
        System.out.println("override-fly");
    }

    @Override
    public void sleep() {
        System.out.println("sleep");
    }
}
