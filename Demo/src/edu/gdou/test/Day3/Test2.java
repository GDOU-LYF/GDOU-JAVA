package edu.gdou.test.Day3;

import java.util.ArrayList;
import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) throws MyException {
        ArrayList<Student> list=new ArrayList<>();
        Scanner reader=new Scanner(System.in);
        String[] lists={"EDA实验","JAVA课程","高等数学"};
        for (String s : lists) {
            System.out.print("请输入姓名:");
            String name=reader.next();
            list.add( Student.getCoursePoint(name,s));
        }
        System.out.println(list);
    }
}
