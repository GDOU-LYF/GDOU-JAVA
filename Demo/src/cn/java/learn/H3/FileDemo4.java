package cn.java.learn.H3;

import java.io.File;

public class FileDemo4 {
    public static void main(String[] args){
        File dir=new File("E:\\EDA");
        printDir(dir);
    }
    public static void printDir(File dir){
        File[] files=dir.listFiles();
        for(File file:files){
            if (file.isFile()){
                System.out.println("文件名:"+file.getAbsolutePath());
            }else{
                System.out.println("目录:"+file.getAbsolutePath());
                printDir(file);
            }
            
        }
    }
}
