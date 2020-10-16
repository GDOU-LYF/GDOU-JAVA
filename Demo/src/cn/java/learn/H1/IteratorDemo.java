package cn.java.learn.H1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class IteratorDemo {
    public static void main(String[] args) {
        Collection<String> col=new ArrayList<>();

        col.add("01");
        col.add("02");
        col.add("03");

//        Iterator<String> it=col.iterator();
//        while(it.hasNext()){
//            String s = it.next();
//            System.out.println(s);
//        }
        for (String s:col){
            System.out.println(s);
        }
    }
}
