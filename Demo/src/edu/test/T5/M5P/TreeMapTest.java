package edu.test.T5.M5P;

import java.util.*;

public class TreeMapTest {
    public static void main(String []args){
        //Map<String,String> map=new TreeMap<String,String>((String o1,String o2)->o2.compareTo(o1));
        Map<String,Integer> map=new TreeMap<>();
        map.put("c",123);
        map.put("a", 235);
        map.put("b", 653);
        map.put("d", 99);
        List<Map.Entry<String,Integer>> list=new ArrayList<>(map.entrySet());
        list.sort((Map.Entry<String,Integer>o1,Map.Entry<String,Integer>o2)->o2.getValue()-o1.getValue());
        for (Map.Entry<String, Integer> m : list) {
            System.out.println(m.getKey()+" "+m.getValue());
        }
//        Set<String> keySet=map.keySet();
//        Iterator<String> it=keySet.iterator();
//        while(it.hasNext()){
//            String key=it.next();
//            System.out.println(key);
//        }

    }
}
