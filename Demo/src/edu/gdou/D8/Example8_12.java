package edu.gdou.D8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Example8_12 {
    public static void main(String[] args) {
        List<String> str= Arrays.asList("Hello","Mr","zhang","How","are","you","today");
        List<String> result=toUpper(fiter(str));
        System.out.println("print:");
        for(String s:result){
            System.out.println(s);
        }
        str.stream().filter(s->s.length()>=4).map(m->m.toUpperCase()).forEach(System.out::println);
    }


    public static List<String> fiter(List<String> str) {//过滤方法,返回长度
        ArrayList<String> list = new ArrayList<>();
        for (String s : str) {
            if (s.length() >= 4) {
                list.add(s);
            }
        }
        return list;
    }

    public static List<String> toUpper(List<String> str) {
        ArrayList<String> ulist = new ArrayList<>();
        for (String s : str) {
            ulist.add(s.toLowerCase());
        }
        return ulist;
    }
}
