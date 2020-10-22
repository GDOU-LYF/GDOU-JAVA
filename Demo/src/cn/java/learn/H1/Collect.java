package cn.java.learn.H1;

import java.util.ArrayList;
import java.util.Collections;

public class Collect {
    public static void main(String[] args) {
        ArrayList<String> list=new ArrayList<>();
        Collections.addAll(list,"a","b","c","d");
        Collections.shuffle(list);
        System.out.println(list);
    }
}
