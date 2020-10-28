package cn.java.learn.H3;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class IODemo1 {
    public static void main(String[] args) throws IOException {
//        File file=new File("a.txt");
//        FileOutputStream fos=new FileOutputStream(file);

        FileOutputStream fos=new FileOutputStream("b.txt");
        byte[] b="abcde".getBytes();
        for (int i = 0; i < b.length; i++) {
            fos.write(b[i]);
            fos.write("\r\n".getBytes());
        }

        fos.close();


    }
}
