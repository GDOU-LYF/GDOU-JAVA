package cn.java.learn.H4;


import java.io.*;

public class ReaderDemo2 {
    public static void main(String[] args) throws IOException {
        String filename="E:\\JAVA_OBJ\\GDOUJAVA\\Demo\\src\\cn\\java\\learn\\H4\\gbk.txt";
        InputStreamReader isr=new InputStreamReader(
                new FileInputStream(filename),"GBK");
        //创建流对象,指定编码

        int read;
        while((read=isr.read())!=-1){
            System.out.println((char)read);
        }
        isr.close();
        filename="E:\\JAVA_OBJ\\GDOUJAVA\\Demo\\src\\cn\\java\\learn\\H4\\gbk2.txt";
        OutputStreamWriter osw=new OutputStreamWriter(new FileOutputStream(filename),"GBK");
        osw.write("你好");
        osw.close();


    }
}
