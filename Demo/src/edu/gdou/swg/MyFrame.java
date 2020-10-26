package edu.gdou.swg;

import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame {
    public MyFrame(String title,int x,int y,int width,int height) throws HeadlessException {
        super(title);
        setBounds(x,y,width,height);
        setResizable(false);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);//如果注释掉该行，会有什么变化？
    }
}
