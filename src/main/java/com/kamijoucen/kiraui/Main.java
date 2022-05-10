package com.kamijoucen.kiraui;

import com.kamijoucen.kiraui.ui.MainPanel;

import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {

        EventQueue.invokeLater(() -> {
            JFrame frame = new JFrame();
            frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
            frame.setSize(800, 600);
            frame.getContentPane().add(new MainPanel());

            frame.setVisible(true);
        });
    }
}