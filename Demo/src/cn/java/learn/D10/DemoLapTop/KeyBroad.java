package cn.java.learn.D10.DemoLapTop;

public class KeyBroad extends USB {
    @Override
    public void open() {
        System.out.println("keybroad:open");
    }

    @Override
    public void close() {
        System.out.println("keybroad:close");
    }

    public void use(){
        System.out.println("open keybroad");
    }
}
