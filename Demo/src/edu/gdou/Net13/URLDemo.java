package edu.gdou.Net13;

import java.io.InputStream;
import java.net.URL;

public class URLDemo {
    public static void main(String[] args) throws Exception {
        String addr="https://www.baidu.com/";
        URL url=new URL(addr);
        InputStream ins=url.openStream();
        byte[] b=new byte[1024];
        int len;
        while((len=ins.read(b))!=-1){
            System.out.println(new String(b,0,len,"UTF-8"));
        }
//        InetAddress.getByName("https://www.baidu.com/");
    }
}
