package cn.java.learn.D10.DemoLapTop;

public class LapTop implements interface_laptop {

    @Override
    public void open() {
        System.out.println("laptop:run");
    }

    @Override
    public void close() {
        System.out.println("laptop:close");
    }

    public void read_usb(USB usb) {
        usb.open();
        if (usb instanceof KeyBroad) {
            KeyBroad keybroad = (KeyBroad) usb;
            keybroad.use();
        } else if (usb instanceof Mouse) {
            Mouse mouse = (Mouse) usb;
            mouse.use();
        }
        usb.close();
    }
}
