package cn.java.learn.H3;

import java.io.FileInputStream;
import java.io.IOException;

public class IODemo2 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("b.txt");
        int read;
        while((read=fis.read())!=-1){// 循环读取
            System.out.println((char) read);
        }
        fis.close();
    }

}
