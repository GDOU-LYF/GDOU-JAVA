package cn.java.learn.H2;

public class MyThread extends Thread{
    public MyThread() {
    }
    @Override
    public void run(){
        for (int i = 0; i < 1; i++) {
//            System.out.println("run"+i);
            System.out.println(getThreadGroup().getName());
        }
    }
}
