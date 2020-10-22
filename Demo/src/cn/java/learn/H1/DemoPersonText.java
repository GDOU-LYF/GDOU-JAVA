package cn.java.learn.H1;

import java.util.ArrayList;
import java.util.Collections;

public class DemoPersonText {
    public static void main(String[] args) {
        ArrayList<Person> list=new ArrayList<>();
        list.add(new Person("张三",5));
        list.add(new Person("李四",64));
        list.add(new Person("王五",23));
        Collections.sort(list);
        System.out.println(list);
    }
}
