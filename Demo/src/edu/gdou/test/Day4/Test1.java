package edu.gdou.test.Day4;

import java.util.ArrayList;
//import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();
        String name = reader.next();
        while (!"-1".equals(name)) {
            list.add(name);
            name = reader.next();
        }
//        Collections.sort(list);//利用Collections对集合类升序排序
        Iterator<String> it=list.iterator();
        while(it.hasNext()){
            name=it.next();
            if(name.toLowerCase().startsWith("chen")){
                System.out.println(name);
            }
        }
    }


}
