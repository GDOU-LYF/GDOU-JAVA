package edu.gdou.test.Day4;

import java.util.ArrayList;
import java.util.Iterator;

public class Test2 {
    public static void main(String[] args){
        DemoE<Object> demo=new DemoE<>();
        demo.add(new Student("小明","2019001",true,18,"高等数学"));
        demo.add(new Teacher("陈老师","001",false,20,50000,"JAVA程序设计"));
        demo.add(new User("客户1","2020001",true,35));
        demo.printInfo();
    }
}
