package com.company.main;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.InvocationTargetException;

import static java.awt.Font.BOLD;

public class TextAnimation extends JPanel {
    int x = 900;
    TextAnimation() {
        setBackground(Color.BLACK);
        setForeground(Color.WHITE);

        Thread thread=new Thread(() ->
        {
            while(true)
            {
                try { SwingUtilities.invokeAndWait(() ->
                {
                    x -= 5;
                    repaint();
                    if(x < -600){
                        x = 1900;
                    }
                });
                    Thread.sleep(16L); }
                catch(InterruptedException | InvocationTargetException e) { e.printStackTrace(); }
            }
        });
        thread.start();
    }
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setFont(new Font("arial", Font.PLAIN, 40));
        g.drawString("Centrum   Rybnicka  Symaptyczna ", x, 200);
    }
}