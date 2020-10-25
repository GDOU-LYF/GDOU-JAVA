package cn.java.learn.H2;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class LinkedMapDemo {
    public static void main(String[] args) {
        LinkedHashMap<String, String> map = new LinkedHashMap<>();
        map.put("邓超", "孙丽");
        map.put("李晨", "范冰冰");
        map.put("刘德华", "朱莉");
        Set<Map.Entry<String, String>> entrySet = map.entrySet();
        for (Map.Entry<String, String> entry : entrySet) {
            System.out.println(entry.getKey() + "  "+entry.getValue());
        }
    }
}
