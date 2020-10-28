package cn.java.learn.H3;

import java.io.File;
import java.io.IOException;

public class FileDemo2 {
    public static void main(String[] args) {
        File f = new File("newDir");
        System.out.println("是否存在:" + f.exists());
        System.out.println("是否创建:" + f.mkdir());
        System.out.println("是否存在:" + f.exists());
        System.out.println(new File("newDir").delete());
    }
}

