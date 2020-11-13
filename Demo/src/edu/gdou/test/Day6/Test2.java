package edu.gdou.test.Day6;

class DelayThread2 implements Runnable {
    private static int count = 0;
    private int no;
    private int delay;

    public DelayThread2() {
        count++;
        no = count;
    }
    @Override
    public void run() {
        try {
            for (int i = 0; i < 10; i++) {
                delay = (int) (Math.random() * 5000);//0-5000随机数
                Thread.sleep(delay);
                System.out.println("Thread " + no +"with a delay "+delay);
            }
        } catch (InterruptedException e) {
        }
    }
}

public class Test2 {
    public static void main(String args[]) {
        DelayThread2 run1 = new DelayThread2();
        DelayThread2 run2 = new DelayThread2();
        Thread tr1=new Thread(run1);
        Thread tr2=new Thread(run2);
        tr1.start();
        tr2.start();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println("Thread wrong");
        }
    }
}