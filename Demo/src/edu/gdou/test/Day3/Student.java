package edu.gdou.test.Day3;

import java.util.Scanner;

public class Student {
    private String name;
    private String course;
    private int point;

    public Student() {
    }

    public Student(String name, String course, int point) {
        this.name = name;
        this.course = course;
        this.point = point;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPoint() {
        return point;
    }

    public void setPoint(int point) {
        this.point = point;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", Course='" + course +
                "', point=" + point +
                '}';
    }

    public static Student getCoursePoint(String name, String cr) throws MyException {
        Scanner reader = new Scanner(System.in);
        System.out.print("请输入" + name + "的" + cr + "成绩:");
        String point = reader.next();
        char[] ch = point.toCharArray();//转换为char数组用来是否输入了"不是数字"的信息
        for (char c : ch) {
            if (c < '0' || c > '9') {
                throw new MyException("成绩数据类型异常!");
            }
        }
        int course_point = Integer.parseInt(point);//String->Integer->拆箱->int
        if (course_point < 0 || course_point > 100) {
            throw new MyException("成绩数据范围异常!");
        }

        return new Student(name, cr, course_point);//创建Student对象
    }
}
