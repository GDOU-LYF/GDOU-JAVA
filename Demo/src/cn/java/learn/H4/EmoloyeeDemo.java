package cn.java.learn.H4;


import java.io.*;

public class EmoloyeeDemo {
    public static void main(String[] args) {

        Employee2 e=new Employee2();
        e.name="张三";
        e.address="北京路";
        e.age=20;
        try{
            ObjectOutputStream out=new ObjectOutputStream(new FileOutputStream("employee.txt"));
            out.writeObject(e);
            out.close();
        }catch(IOException ioException){
            ioException.printStackTrace();
        }
        e=null;
        try{
            ObjectInputStream in=new ObjectInputStream(new FileInputStream("employee.txt"));
            e=(Employee2)in.readObject();
            in.close();
        }catch (IOException ioException){
            ioException.printStackTrace();
            return;
        }catch(ClassNotFoundException c){
            System.out.println("class not found!");
            c.printStackTrace();
            return ;
        }
        System.out.println(e);
    }
}
