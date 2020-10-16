package cn.java.learn.H1;

import java.util.ArrayList;
import java.util.Collection;

public class GenericDemo {
    public static void main(String[] args) {
        Collection<String> col = new ArrayList();
        col.add("abc");
        col.add("itcast");
//        col.add(5);

        for(Object a:col){
            System.out.println(a);
        }
    }

}
