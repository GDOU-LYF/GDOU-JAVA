package edu.gdou.D7;

public class Anki_test1 {
    public static void main(String[] args) {
        String str,sub;
        str="hello world.";
        sub="world";
        int index=str.indexOf(sub);//取文本索引
        int length=sub.length();//取文本长度
        String ret=str.substring(0,index);//取前段
        ret+=str.substring(index+length);//取后端
        System.out.println(ret);//返回删除后的字符串
    }
}
