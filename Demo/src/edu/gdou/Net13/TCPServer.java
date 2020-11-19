package edu.gdou.Net13;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPServer {
    public static void main(String[] args) throws IOException {
        ServerSocket server=new ServerSocket(8000);
        Socket server_accept=server.accept();
        DataInputStream is=new DataInputStream(server_accept.getInputStream());
        DataOutputStream os=new DataOutputStream(server_accept.getOutputStream());
        String str=is.readUTF();//会阻塞
        System.out.println("Client:"+str);
        os.writeUTF("hello I am Server.");
        os.close();//client 先关输出后输入
        is.close();
        server_accept.close();
        server.close();
    }
}
