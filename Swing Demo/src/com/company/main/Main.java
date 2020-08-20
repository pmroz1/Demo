package com.company.main;

import javax.swing.*;
import java.awt.*;

public class Main {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(()-> {
            try{
                Dimension dimension = new Dimension(1600,768);
                App run = new App(dimension);
            }catch (Exception e){
                throw  new RuntimeException(e);
            }
        });
    }
}
