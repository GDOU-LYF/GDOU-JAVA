package cn.java.learn.H3;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class IOImgDemo {
    public static void main(String[] args) throws IOException {
        FileInputStream fis=new FileInputStream("D:\\Pictures\\Snipaste_2020-02-25_19-07-18.png");
        FileOutputStream fos=new FileOutputStream("copy.png");

        byte[] b=new byte[1024];
        int len;
        while((len=fis.read(b))!=-1){
            fos.write(b,0,len);
        }
        fos.close();
        fis.close();
    }
}
