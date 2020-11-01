package cn.java.learn.H4;

import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedReaderDemo2 {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw=new BufferedWriter(new FileWriter("out.txt"));
        bw.write("1");
        bw.newLine();
        bw.write("2");
        bw.newLine();
        bw.write(30000);
        bw.close();

    }
}
