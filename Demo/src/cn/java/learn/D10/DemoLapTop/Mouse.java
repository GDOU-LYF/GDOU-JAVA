package cn.java.learn.D10.DemoLapTop;

public class Mouse extends USB{

    @Override
    public void open() {
        System.out.println("mouse:open");
    }

    @Override
    public void close() {
        System.out.println("mouse:close");
    }

    public void use(){
        System.out.println("use mouse");
    }
}
