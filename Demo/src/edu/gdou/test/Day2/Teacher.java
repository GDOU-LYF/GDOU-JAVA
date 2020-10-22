package edu.gdou.test.Day2;

import java.util.ArrayList;
import java.util.Iterator;

public class Teacher extends People {
    String ID;//学工号
    ArrayList<String> course;//教学课程

    public Teacher() {
        course = new ArrayList<>();
    }

    public Teacher(String name, int age, String ID) {
        super(name, age);
        this.ID = ID;
        course = new ArrayList<>();
    }

    public void addCourse(String course) {
        this.course.add(course);
    }


    @Override
    public void printInfo() {
        System.out.println("Teacher {name=" + getName() + ",age=" + getAge() + ",ID=" + ID + "}");
        System.out.print("Teacher Course=");
        Iterator<String> listInteger = course.iterator();
        while (listInteger.hasNext()) {
            String str = listInteger.next();
            System.out.print(str + " ");
        }
        System.out.println();
    }

}
