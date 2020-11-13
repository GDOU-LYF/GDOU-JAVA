package edu.gdou.test.Day6;

public class Test3 {
    public static void main(String[] args) {
        Ticket tk = new Ticket();
        Thread tr1 = new PayThread("李平", 20, tk);
        Thread tr2 = new PayThread("张红", 5, tk);
        Thread tr3 = new SellThread(tk);
        tr1.start();
        tr2.start();
        tr3.start();
    }

}

class Ticket {
    boolean can = false;
    int num_5 = 2;
}

class PayThread extends Thread {
    int money;

    private final Ticket tk;

    PayThread(String name, int memory, Ticket tk) {
        super(name);
        this.money = memory;
        this.tk = tk;
    }

    @Override
    public void run() {
        while (true) {
            synchronized (tk) {
                if (!tk.can) {
                    try {
                        tk.wait();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
                System.out.println(currentThread().getName()+"正在购票...");
                try {
                    Thread.sleep(1000);
                } catch (Exception e) {
                    e.printStackTrace();
                }
                if (money / 5 - 1 <= tk.num_5) {

                    tk.can = false;
                    tk.notify();
                    System.out.println(currentThread().getName() + "购票成功!");
                    tk.num_5++;
                    money -= 5;
                    break;
                }

            }
        }
    }
}

class SellThread extends Thread {//售票员
    int num_5 = 2;
    private final Ticket tk;

    public SellThread(Ticket tk) {
        this.tk = tk;
    }

    @Override
    public void run() {
        while (true) {
            synchronized (tk) {
                if (tk.can ) {
                    try {
                        num_5 = tk.num_5;
                        tk.wait();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
                if (tk.num_5 == 4) {
                    break;
                }
                System.out.println("正在售票...");
                try {
                    Thread.sleep(1000);
                } catch (Exception e) {
                    e.printStackTrace();
                }
                tk.can = true;
                tk.notifyAll();
            }
        }
    }
}
