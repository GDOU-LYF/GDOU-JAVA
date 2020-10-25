package cn.java.learn.H2;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {
    public static void main(String[] args) {
        Map<Student, String> map = new HashMap<>();
        map.put(new Student("lisi", 28), "上海");
        map.put(new Student("wangwu", 22), "北京");
        map.put(new Student("zhaoliu", 24), "成都");
        map.put(new Student("zhouqi", 25), "广州");
        map.put(new Student("wangwu", 22), "南京");

        Set<Student> keySet=map.keySet();
        for (Student key:keySet){
            String value=map.get(key);
            System.out.println(key+".."+value);
        }
    }
}
