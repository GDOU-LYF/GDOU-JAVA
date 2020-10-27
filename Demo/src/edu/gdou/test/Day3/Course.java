package edu.gdou.test.Day3;

import java.util.Scanner;

public class Course {

    private int count = 0;
    private double sum = 0;

    public int getCount() {
        return count;
    }

    //    public static int getPoint() throws MyException{
//        Scanner reader = new Scanner(System.in);
//        System.out.print("输入成绩:");
//        String point = reader.next();
//        char[] ch = point.toCharArray();
//        for (char c : ch) {
//            if (c < '0' || c > '9') {
//                throw new MyException("成绩数据类型异常!");
//            }
//        }
//        int course = Integer.parseInt(point);
//        if (course < 0 || course > 100) {
//            throw new MyException("成绩数据范围异常!");
//        }
//        return course;
//    }
//    public static Student getPoint(String name, String cr) throws MyException {
//        Scanner reader = new Scanner(System.in);
//        System.out.print("请输入" + name + "的" + cr + "成绩:");
//        String point = reader.next();
//        char[] ch = point.toCharArray();
//        for (char c : ch) {
//            if (c < '0' || c > '9') {
//                throw new MyException("成绩数据类型异常!");
//            }
//        }
//        int course_point = Integer.parseInt(point);
//        if (course_point < 0 || course_point > 100) {
//            throw new MyException("成绩数据范围异常!");
//        }
//
//        return new Student(name, cr, course_point);
//    }

    public boolean addPoint(int course) {
        sum += course;
        count++;
        return true;
    }

    public boolean addPoint(double course) {
        sum += course;
        count++;
        return true;
    }

    public double getSum() {
        return sum;
    }

    public double getMean() throws MyException {
        if (count == 0) {
            throw new MyException("计时器为0");
        }
        return sum / count;
    }
}
