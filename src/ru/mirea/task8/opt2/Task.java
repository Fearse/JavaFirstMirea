package ru.mirea.task8.opt2;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Task extends JFrame {
    Task(String s)
    {
        super("Task");
        setSize(500,500);
        JLabel jLabel = new JLabel();
        ImageIcon imageIcon = new ImageIcon(s);
        jLabel.setIcon(imageIcon);
        add(jLabel);
        setVisible(true);
    }
    public static void main(String []args)
    {
        //C:\1.jpg
        new Task(args[0]);
    }
}
