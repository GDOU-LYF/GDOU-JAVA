package edu.gdou.excise;

import java.io.*;
import java.util.*;

public class Demo3_363_5 {
    public static void main(String[] args) throws IOException {
        //打开文件取文本信息
        FileInputStream fis=new FileInputStream("a.txt");
        int len;
        byte[] bytes=new byte[4];
        StringBuffer sb = new StringBuffer();
        while((len=fis.read(bytes))!=-1){
            sb.append(new String(bytes,0,len));
        }
        System.out.println(sb.toString());
        //分割,记录
        String val = sb.toString();
        HashMap<String,Integer> map=new HashMap();
        for (String word : val.split(" ")) {
            if (map.containsKey(word)) {
                map.put(word, map.get(word) + 1);
            } else {
                map.put(word, 1);
            }
        }
        //调整顺序
        ArrayList<Map.Entry<String,Integer>> list=new ArrayList<Map.Entry<String,Integer>>(map.entrySet());
        list.sort((Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2)->o2.getValue().compareTo(o1.getValue()));
        for (Map.Entry<String,Integer> m:list){
            System.out.println(m.getKey()+" "+m.getValue());
        }

    }
}
