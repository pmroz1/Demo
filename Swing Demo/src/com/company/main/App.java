package com.company.main;

import javax.swing.*;
import java.awt.*;

public class App {
    protected JFrame display;
    public App(Dimension dimension){
        display = new JFrame();
        display.setSize(dimension);
        display.setResizable(false);
        display.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        display.add(new TextAnimation());
        display.setVisible(true);
    }
}