package edu.gdou.test.Day5;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;

public class Test2 implements ActionListener{
    JFrame app;
    JLabel label_name;
    JLabel label_ID;
    JTextField name_tf;//name内容
    JTextField id_tf;//ID内容
    JButton button1,button2;//写入按钮,读取按钮
    JLabel label_bool;//输出成功与否
    public static void main(String[] args) {
        new Test2().init();
    }

    public void init(){
        app=new JFrame("保存学生信息");
        label_name=new JLabel("学生姓名:");
        label_ID=new JLabel("学生学号:");
        name_tf =new JTextField(5);
        id_tf =new JTextField(5);
        button1=new JButton("写入文件");
        button2=new JButton("读取信息");
        label_bool=new JLabel();

        app.setLayout(new FlowLayout());
        app.add(label_name);
        app.add(name_tf);
        app.add(label_ID);
        app.add(id_tf);
        app.add(button1);
        app.add(button2);
        app.add(label_bool);

        button1.addActionListener(this);
        button2.addActionListener(this);
        Dimension dim=app.getToolkit().getScreenSize();
        app.setVisible(true);
        app.setBounds(dim.width/2-130,dim.height/2-60,260,120);
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==button1){//写入文件
            String name= name_tf.getText();
            String ID= id_tf.getText();
            Student stu=new Student(name,ID);
            try {
                ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("stu.txt"));
                oos.writeObject(stu);
                oos.close();
                label_bool.setText("写出信息-成功");
            } catch (IOException ioException) {
                label_bool.setText("写出信息-失败");
                ioException.printStackTrace();
            }
        }else if(e.getSource()==button2){//读取信息到窗口
            try {
                ObjectInputStream ois=new ObjectInputStream(new FileInputStream("stu.txt"));
                Object obj=ois.readObject();
                Student stu=(Student)obj;
                ois.close();
                name_tf.setText(stu.getName());
                id_tf.setText(stu.getID());
                label_bool.setText("读取信息-成功");
            } catch (Exception Exception) {
                Exception.printStackTrace();
                label_bool.setText("读取信息-失败");
            }

        }
    }
}
