package cn.java.learn.D9.Group;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        Lord host = new Lord("群主", 100);
        Member a=new Member("群友1",0);
        Member b=new Member("群友2",0);
        Member c=new Member("群友3",0);
        ArrayList<Integer> redList = host.send(30, 3);
        a.getRed(redList);
        b.getRed(redList);
        c.getRed(redList);
        host.show();
        a.show();
        b.show();
        c.show();
    }

}
