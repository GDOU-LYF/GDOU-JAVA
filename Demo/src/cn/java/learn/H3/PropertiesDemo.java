package cn.java.learn.H3;

import java.util.Properties;
import java.util.Set;

public class PropertiesDemo  {
    public static void main(String[] args) {
        Properties properties =new Properties();

        properties.setProperty("filename","a.txt");//设置键值
        properties.setProperty("length","209385038");
        properties.setProperty("location", "D:\\a.txt");

        System.out.println(properties);
//        System.out.println(properties.getProperty("filename"));//读取键的值
        Set<String> strings=properties.stringPropertyNames();//利用Set遍历键值
        for (String key : strings) {
            System.out.println(key+" --> "+properties.getProperty(key));
        }
    }
}
