package cn.java.learn.H2;

import java.util.HashMap;
import java.util.Set;

public class MapDemo {
    public static void main(String[] args) {
        HashMap<String,String> map=new HashMap<>();
        map.put("huang","yang");
        map.put("wenzhang","maliao");
        map.put("wenzhang",null);
        map.put("启航","201911211401");
//        System.out.println(map.remove("wenzhang"));
//        System.out.println(map.get("huang"));
//        System.out.println(map);
        Set<String> keys=map.keySet();
        for (String key : keys) {
            String value=map.get(key);
            System.out.println(key+"\t"+value);
        }
    }
}
