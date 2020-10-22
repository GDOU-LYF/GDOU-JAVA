package edu.gdou.test.Day2;

import java.util.ArrayList;
import java.util.Iterator;

public class Student extends People {
    String ID;//学号
    ArrayList<String> course;//课程

    public Student() {
        course = new ArrayList<>();
    }

    public Student(String name, int age, String ID) {
        super(name, age);
        this.ID = ID;
        course = new ArrayList<>();
    }

    public void addCourse(String course) {
        this.course.add(course);
    }

    @Override
    public void printInfo() {
        System.out.println("Student {name=" + getName() + ",age=" + getAge() + ",ID=" + ID + "}");
        System.out.print("Student Course=");
        Iterator<String> listInteger = course.iterator();
        while (listInteger.hasNext()) {
            String str=listInteger.next();
            System.out.print( str+ " ");
        }
        System.out.println();
    }
}
