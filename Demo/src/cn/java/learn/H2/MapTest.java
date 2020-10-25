package cn.java.learn.H2;

import java.util.HashMap;
import java.util.Scanner;

public class MapTest {
    public static void main(String[] args) {
        String str = new Scanner(System.in).next();
        findChar("hello");
    }

    public static void findChar(String line) {//计算一个字符串中每个字符出现次数。
        HashMap<Character, Integer> map = new HashMap<>();//创建HashMap
        for (int i = 0; i < line.length(); i++) {
            char c = line.charAt(i);//取字符
            if (!map.containsKey(c)) {//判断是否存在键值
                map.put(c, 1);
            } else {
                Integer count = map.get(c);
                map.put(c, ++count);
            }
        }
        System.out.println(map);
    }
}
