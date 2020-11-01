package cn.java.learn.H4;

import java.io.*;

public class TranssDemo {
    public static void main(String[] args) throws IOException {
        String srcFile="file_gbk.txt";
        String destFile="file_utf8.txt";

        InputStreamReader isr=new InputStreamReader(new FileInputStream(srcFile),"GBK");
        OutputStreamWriter osw=new OutputStreamWriter(new FileOutputStream(destFile));

        char[] cbuf=new char[1024];
        int len;
        while((len=isr.read(cbuf))!=-1){
            osw.write(cbuf,0,len);
        }
        osw.close();
        isr.close();

    }
}
