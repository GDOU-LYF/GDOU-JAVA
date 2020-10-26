package edu.gdou.swg;

import javax.swing.*;
import java.awt.*;

public class Demo1 {
    public static void main(String[] args) {
//        JTextField jtf=new JTextField();
//        jtf.setText("233");
//        System.out.println(jtf.getText());
//
        JFrame app=new JFrame("文本编辑框例程");
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        app.setSize(320,120);
        Container c=app.getContentPane() ;
        c.setLayout(new FlowLayout());
        JTextField [ ] t = {
                new JTextField("正常文本:", 8), new JTextField("显示", 15),
                new JTextField("密码文本:", 8), new JPasswordField("隐藏", 15)};
        t[0].setEditable( false );
        t[2].setEditable( false );
        for (int i=0; i<4; i++)
            c.add( t[i] );
        app.setVisible( true );

    }
}
