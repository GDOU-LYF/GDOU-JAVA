package cn.java.learn.H4;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderDemo {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new FileReader("b.txt"));
        String line=null;
        while((line=br.readLine())!=null){
            System.out.println(line);
            System.out.println("-----");
        }
        br.close();
    }
}
