package cn.java.learn.H3;

import java.io.File;

public class FileDemo {
    public static void main(String[] args) {
        String pathname = "E:\\S\\Java基础\\08.会员版(2.0)-就业课(2.0)-File类与IO流\\19.【File类、递归】-笔记\\code\\08_FileAndRecursion\\1.txt";
        File file1=new File(pathname);
        System.out.println(file1.getAbsolutePath());
        System.out.println(file1.getName());
        System.out.println(file1.length());
    }
}
