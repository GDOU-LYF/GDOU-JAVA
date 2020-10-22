package edu.gdou.D10;

import java.util.LinkedList;

public class LinkedListDemo {
    public static void main(String [] args){
        LinkedList<String> link=new LinkedList<>();
        link.add("abc1");
        link.add("abc2");
        link.add("abc3");
        System.out.println(link);

        System.out.println(link.getFirst());
        System.out.println(link.getLast());

//        System.out.println(link.removeFirst());
//        System.out.println(link.removeLast());

        while(!link.isEmpty()){
            System.out.println(link.pop());
        }

        System.out.println(link);
    }
}
