package cn.java.learn.D10.Demo3;

public class Cat extends Animal{
    @Override
    public void eat() {
        System.out.println("cat:eat");
    }

    public void sleep(){
        System.out.println("cat:sleep");
    }
}
