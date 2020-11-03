package edu.gdou.test.Day4;

import java.util.ArrayList;
import java.util.Iterator;

public class DemoE<E>  {
    private ArrayList<E> list=new ArrayList<>();

    public void add(E e){
        list.add(e);
    }

    public void printInfo(){
        Iterator<E> it=list.iterator();
        while(it.hasNext()){
            E e=it.next();
            System.out.println(e);
        }
    }
}
