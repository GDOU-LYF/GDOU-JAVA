package edu.gdou.test.Day8;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;

public class CSocket {
    public static void main(String[] args) throws IOException {
        Socket client=new Socket("127.0.0.1",8000);
        DataInputStream in=new DataInputStream(client.getInputStream());//read Server Massage->Client
        ObjectOutputStream out=new ObjectOutputStream(client.getOutputStream());//write Student Object->Server

        Student stu=null;
        for (int i = 0; i < 2; i++) {
            stu=InputStudent();
            out.writeObject(stu);
//            System.out.println("Client:"+stu);
            System.out.println("Server:"+in.readUTF());//读取服务器信息
        }
        in.close();
        out.close();
        client.close();
    }
    public static Student InputStudent(){
        Student stu=new Student();
        Scanner reader=new Scanner(System.in);
        System.out.println("请输入学生信息");
        System.out.print("name:");
        stu.setName(reader.next());
        System.out.print("ID:");
        stu.setID(reader.next());
        return stu;
    }
}
