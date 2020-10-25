package cn.java.learn.H2;

public class ThreadDemo {
    public static void main(String[] args) {
        MyThread mt=new MyThread();
        mt.start();
        for (int i = 0; i < 1; i++) {
            System.out.println(Thread.currentThread().getName());
        }
    }
}
