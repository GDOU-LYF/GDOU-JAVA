package edu.gdou.test.Day7;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test1 {
    public static void main(String[] args) throws IOException {
        //读文件 f1.txt
        //对文本进行加密
        //写文件 f2.txt
        FileInputStream fis = new FileInputStream("E:\\JAVA_OBJ\\GDOUJAVA\\Demo\\src\\edu\\gdou\\test\\Day7\\f1.txt");
        FileOutputStream fos=new FileOutputStream("E:\\JAVA_OBJ\\GDOUJAVA\\Demo\\src\\edu\\gdou\\test\\Day7\\f2.txt");
        int read;
        while((read=fis.read())!=-1){
            fos.write((char)(read+10));
        }
        fis.close();
        fos.close();
        //读文件 f2.txt
        System.out.println("开始读取f2.txt内容");
        fis = new FileInputStream("E:\\JAVA_OBJ\\GDOUJAVA\\Demo\\src\\edu\\gdou\\test\\Day7\\f2.txt");
        while((read=fis.read())!=-1){
            System.out.print((char)(read-10));
        }
        fis.close();
    }
}
