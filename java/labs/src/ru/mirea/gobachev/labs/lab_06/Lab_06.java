package ru.mirea.gobachev.labs.lab_06;

import javax.swing.*;
import java.awt.*;

public class Lab_06 {
    private static final int fontSize = 15;

    public static void main(String[] args) {
        JTextArea textArea = new JTextArea(10, 25);
        JFrame frame = new JFrame("Text Changer");
        JMenuBar menuBar = new JMenuBar();
        JMenu colorBar = new JMenu("Color"), fontBar = new JMenu("Font");

        //frame
        frame.setSize(500, 300);
        frame.setVisible(true);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        frame.setLocation(dim.width/2-frame.getSize().width/2, dim.height/2-frame.getSize().height/2);

        //toolbar
        colorBar.add(createColorChangingItem(textArea, "Red", Color.RED));
        colorBar.add(createColorChangingItem(textArea, "Green", Color.GREEN));
        colorBar.add(createColorChangingItem(textArea, "Blue", Color.BLUE));
        fontBar.add(createFontChangingItem(textArea, "Times New Roman"));
        fontBar.add(createFontChangingItem(textArea, "MS Sans Serif"));
        fontBar.add(createFontChangingItem(textArea, "Courier New"));

        //add bar and textArea on frame
        menuBar.add(colorBar);
        menuBar.add(fontBar);
        frame.setJMenuBar(menuBar);
        frame.add(textArea);

    }

    private static JMenuItem createFontChangingItem(JTextArea area, String fontName) {
        JMenuItem menuItem = new JMenuItem(fontName);
        menuItem.addActionListener(e -> area.setFont(new Font(fontName, Font.PLAIN, fontSize)));
        return menuItem;
    }

    private static JMenuItem createColorChangingItem(JTextArea area, String cname, Color c) {
        JMenuItem menuItem = new JMenuItem(cname);
        menuItem.addActionListener(e -> area.setForeground(c));
        return menuItem;
    }
}