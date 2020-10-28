package cn.java.learn.H3;

import java.io.FileInputStream;
import java.io.IOException;

public class IODemo3 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("b.txt");
        int len;
        byte[] read=new byte[2];
        while((len=fis.read(read))!=-1){// 循环读取
            System.out.println(new String(read,0,len));
        }
        fis.close();
    }

}
