package japi;

import java.util.ArrayList;
import java.util.Random;

public class DemoArraryList {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Random ra=new Random();
        for (int i = 0; i < 5; i++) {
            list.add(ra.nextInt(20)+1);
        }
        for (Integer integer : list) {
            System.out.println(integer);
        }
        System.out.println(list);
        for(int i=list.size()-1;i>=0;i--){
            list.remove(i);
            System.out.println("delete"+i+" "+list);
        }
//        System.out.println(list);
    }
}
