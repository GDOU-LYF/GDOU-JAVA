package cn.java.learn.H2;

public class TicketDemo {
    public static void main(String[] args) {
//        new Ticket();
        new Thread(new Ticket()).start();
    }
}
