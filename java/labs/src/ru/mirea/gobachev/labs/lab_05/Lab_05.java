package ru.mirea.gobachev.labs.lab_05;

import java.awt.FlowLayout;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Lab_05 extends JFrame {
    public static void main(String[] args){
        ImageIcon icon = new ImageIcon("../img/mi.jpg");
        JFrame frame = new JFrame();
        frame.setLayout(new FlowLayout());
        frame.setSize(800, 800);
        JLabel lbl = new JLabel();
        lbl.setIcon(icon);
        frame.add(lbl);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}