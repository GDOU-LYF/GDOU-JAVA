package edu.gdou.test.Day7;


import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Text2 {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos=new FileOutputStream("E:\\JAVA_OBJ\\GDOUJAVA\\Demo\\src\\edu\\gdou\\test\\Day7\\d1.txt");
        Scanner reader=new Scanner(System.in);
        double num;

        num=reader.nextDouble();
        byte[] bytes;
        while(num!=-1){
            bytes=Double.toString(num).getBytes();
            fos.write(bytes);
            fos.write(new String("\r\n").getBytes());
            num=reader.nextDouble();
        }
        fos.close();

        FileInputStream fis=new FileInputStream("E:\\JAVA_OBJ\\GDOUJAVA\\Demo\\src\\edu\\gdou\\test\\Day7\\d1.txt");
        fos=new FileOutputStream("E:\\JAVA_OBJ\\GDOUJAVA\\Demo\\src\\edu\\gdou\\test\\Day7\\d2.txt");
        StringBuffer stringbuffer=new StringBuffer("");
        int read;
        char word;
        while((read=fis.read())!=-1){
            word=(char)read;
            stringbuffer.append(word);
        }
        String[] string_list=stringbuffer.toString().split("\r\n");
        ArrayList<Double> list=new ArrayList<>();
        for(String string:string_list){
            list.add(Double.parseDouble(string));
        }
        Collections.sort(list);
        System.out.println(list);
        for(Double num_double:list){
            fos.write(num_double.toString().getBytes());
            fos.write(new String("\r\n").getBytes());
        }
    }
}
