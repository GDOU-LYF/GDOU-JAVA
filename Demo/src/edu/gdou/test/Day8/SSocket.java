package edu.gdou.test.Day8;

import java.io.DataOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class SSocket {
    public static void main(String[] args) throws IOException,ClassNotFoundException {
        ServerSocket serverSocket=new ServerSocket(8000);
        Socket server_accept=serverSocket.accept();
        ObjectInputStream in=new ObjectInputStream(server_accept.getInputStream());//read Client  Student Object->Server
        DataOutputStream out =new DataOutputStream(server_accept.getOutputStream());//write Message->Client
        Student stu=null;
        for (int i = 0; i < 2; i++) {
            stu=(Student)in.readObject();
            System.out.println("get Client Object:"+stu);
            out.writeUTF("Server:获取到第"+(i+1)+"个学生信息");
        }

        out.close();
        in.close();
        server_accept.close();
        serverSocket.close();
    }
}
