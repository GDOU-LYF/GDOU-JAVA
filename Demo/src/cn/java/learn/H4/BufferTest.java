package cn.java.learn.H4;

import java.io.*;
import java.util.HashMap;

public class BufferTest {
    public static void main(String[] args)throws IOException {
        HashMap<String,String> lineMap=new HashMap<>();
        BufferedReader br=new BufferedReader(new FileReader("book.txt"));

        String line=null;
        while((line=br.readLine())!=null){
            String[] split=line.split("\\.");
            lineMap.put(split[0],split[1]);
        }
        br.close();

        BufferedWriter bw=new BufferedWriter(new FileWriter("book_out.txt"));
        for(int i=1;i<= lineMap.size();i++){
            String key=String.valueOf(i);
            String value=lineMap.get(key);
            bw.write(key+"."+value);
            bw.newLine();
        }
        bw.close();

    }
}
