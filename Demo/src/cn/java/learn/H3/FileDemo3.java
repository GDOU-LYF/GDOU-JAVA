package cn.java.learn.H3;

import java.io.File;

public class FileDemo3 {
    public static void main(String[] args) {
        File dir=new File("E:\\EDA");
        File[] files=dir.listFiles();
        for (File file : files) {
//            System.out.println(file+" "+file.length());
            System.out.println(file);
        }
    }
}
