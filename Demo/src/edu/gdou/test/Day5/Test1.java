package edu.gdou.test.Day5;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class Test1 implements ActionListener {
    JFrame app;
    FlowLayout fw;
    JLabel label;
    JLabel label2;
    JTextField text;
    JButton button;
    int num = 0;

    public static void main(String[] args) {
        new Test1().init();
    }

    public void init() {
        app = new JFrame("猜数字");
        fw = new FlowLayout();
        app.setLayout(fw);
        label = new JLabel("输入猜测的数字(0-9):");
        text = new JTextField(5);
        button = new JButton("确定");
        button.addActionListener(this);

        label2 = new JLabel();

        app.add(label);
        app.add(text);
        app.add(button);
        app.add(label2);

        app.setVisible(true);

        Dimension dim=app.getToolkit().getScreenSize();
        app.setBounds(dim.width/2-115,dim.height/2-50,230,100);
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        num = new Random().nextInt(10);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button) {
            int text_num = Integer.parseInt(text.getText());
            if (text_num == num) {
                label2.setText("输入正确");
            } else if (text_num > num) {
                label2.setText("猜大了");
            } else {
                label2.setText("猜小了");
            }
        }
    }
}
