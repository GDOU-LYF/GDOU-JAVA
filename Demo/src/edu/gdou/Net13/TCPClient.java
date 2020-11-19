package edu.gdou.Net13;

import java.io.*;
import java.net.Socket;

public class TCPClient {
    public static void main(String[] args) throws IOException {
        Socket client=new Socket("127.0.0.1",8000);
        DataInputStream is=new DataInputStream(client.getInputStream());
        DataOutputStream os=new DataOutputStream(client.getOutputStream());
        os.writeUTF("hello I am Cilent-1");//return  Unicode 字符串
        System.out.println("Client-1:'hello I am Cilent-1'");
        String str=is.readUTF();//会阻塞
        System.out.println("Server:"+str);
        is.close();//先关输入后输出
        os.close();
        client.close();
    }
}
