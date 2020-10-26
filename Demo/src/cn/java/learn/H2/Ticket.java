package cn.java.learn.H2;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Ticket implements Runnable {
    private int ticket = 100;
    Lock lock = new ReentrantLock();

    @Override
    public void run() {
        while (true) {
//            sellTicket();
            lock.lock();
            if (ticket > 0) {
                try {
                    Thread.sleep(100);
                } catch (Exception e) {
                    e.printStackTrace();
                }
                String name = Thread.currentThread().getName();
                System.out.println(name + "sell:" + ticket--);
            }
            lock.unlock();
        }
    }

    private synchronized void sellTicket() {
        if (ticket > 0) {
            try {
                Thread.sleep(100);
            } catch (Exception e) {
                e.printStackTrace();
            }
            String name = Thread.currentThread().getName();
            System.out.println(name + "sell:" + ticket--);
        }
    }
}


