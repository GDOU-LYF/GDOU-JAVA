package cn.java.learn.D10.DemoLapTop;

public class DemoLapTop {
    public static void main(String[] args) {
        LapTop pc = new LapTop();
        USB key = new KeyBroad();
        USB mouse = new Mouse();
        pc.open();
        pc.read_usb(key);
        pc.read_usb(mouse);

        pc.close();
    }
}
