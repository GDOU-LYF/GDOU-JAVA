package edu.gdou.swg;

import javax.swing.*;
import java.awt.*;
class FrameWithGridLayout extends JFrame
{
    void display()
    {
        setTitle("网格布局管理器示例");
        JTextField text=new JTextField(20);
        add(text, BorderLayout.NORTH);

        JPanel p = new JPanel();//设置一个JPanel容器对象
        //将JPanel的布局管理器设置为网格布局管理器，
        //网格为4行3列，网格之间行、列间距均为4个像素
        p.setLayout(new GridLayout(4,3,4,4));
        String[] name = {"1","2","3","4","5","6","7","8","9","*","0","#"};
        for (int i = 0; i < name.length; ++i)
            p.add(new JButton(name[i]));//JPanel的各个网格中加入按钮对象
        add(p);//将JPanel容器加入到窗口中，默认为中间位置
        pack();//设置窗口为合适大小

        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}
