package com.example.helloworld.graphicUserInterface;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SimpleGui implements ActionListener {
    JButton button;
    JButton buttonOne;


    public static void main(String[] args) {
        SimpleGui gui = new SimpleGui();
        gui.go();


    }

    public void go() {
        JFrame frame = new JFrame();

        button = new JButton("click me");
        button.addActionListener(this);

        buttonOne = new JButton("I'm a button too");
        buttonOne.addActionListener(e -> buttonOne.setText("I've been clicked"));
        buttonOne.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                buttonOne.setText("I've been changed via second method");
            }
        });

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(BorderLayout.SOUTH, button);
        frame.getContentPane().add(BorderLayout.WEST, buttonOne);

        frame.setSize(300, 300);
        frame.setVisible(true);
    }


    @Override
    public void actionPerformed(ActionEvent event) {
        button.setText("I've been clicked!");
    }
}
