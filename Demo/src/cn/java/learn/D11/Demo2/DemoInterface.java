package cn.java.learn.D11.Demo2;

import java.util.ArrayList;
import java.util.List;

public class DemoInterface {
    public static void main(String[] args) {
        List<String> list=new ArrayList<>();

        List<String> result=addNames(list);
        for (String s : result) {
            System.out.println(s);
        }

        int a[]=new int[10];
        for (int i:a) {
            System.out.println(i);
        }
    }

    public static List<String> addNames(List<String> list){
        list.add("阿巴");
        list.add("阿爸阿巴");
        return list;
    }
}
