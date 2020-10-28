package cn.java.learn.H3;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class IODemo4 {
    public static void main(String[] args) throws IOException {
        FileWriter fw=new FileWriter("b.txt");

        char[] cbuf={97,'b','c',30000};
//        fw.write (97);
//        fw.write('b');
//        fw.write('c');
//        fw.write(30000);
        fw.write(cbuf,0,cbuf.length-2);
        fw.flush();
        fw.write(cbuf,cbuf.length-2, 2);
        fw.write("\r\nabc田");
//        int len;
//        char[] b=new char[2];
//        while((len=fr.read(b))!=-1){
//            System.out.println(new String(b,0,len));
//        }

        fw.close();
    }
}
