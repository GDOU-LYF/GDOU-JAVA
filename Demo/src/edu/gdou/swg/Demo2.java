package edu.gdou.swg;

import javax.swing.*;
import java.awt.*;

public class Demo2 {
    public static void main(String[] args) {
        JFrame app = new JFrame();
        app.setTitle("小窗口");
        Dimension dim = app.getToolkit().getScreenSize();
        app.setBounds(0, 0, dim.width, dim.height);//全屏幕
        app.setBounds(200, 200, 500, 150);
//        JLabel jl=new JLabel();//标签
//        jl.setText("233");
//        JTextField
        app.setLayout(new FlowLayout());//设置窗口布局为流式布局
        app.add(new JLabel("233"));
        app.add(new JTextField(23));
        app.add(new JTextArea());
        System.out.println(new JTextArea("233232").getText());
//        ButtonGroup group = new ButtonGroup(); //创建单选按钮作用域
//        JRadioButton radio1 = new JRadioButton("男",true);
//        JRadioButton radio2 = new JRadioButton("女");
//        group.add(radio1); //将单选按钮加入作用域
//        group.add(radio2);
//        app.add(radio1);//向窗口中加入单选按钮
//        app.add(radio2);
        JButton button=new JButton("注册"); //创建注册按钮
        app.add(button);//向窗口中加入按钮
        app.add(new JScrollPane(new JTextArea(6,12)));//向窗口中加入带滚动条的文本区
        app.setVisible(true);
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        app.show();//过时


    }
}
