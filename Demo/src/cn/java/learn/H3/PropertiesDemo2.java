package cn.java.learn.H3;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;

public class PropertiesDemo2 {
    public static void main(String[] args) throws IOException {
        Properties pro =new Properties();
        pro.load(new FileInputStream("read.txt"));

        Set<String> strings=pro.stringPropertyNames();//利用Set遍历键值
        for (String key : strings) {
            System.out.println(key+" --> "+pro.getProperty(key));
        }
    }
}
