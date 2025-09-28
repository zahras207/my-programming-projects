/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unit.converter;

import java.awt.Color;
import java.util.Scanner;
import javax.swing.JFrame;
import javax.swing.ImageIcon;
import java.awt.Color;


public class UnitConverter {

   
    public static void main(String[] args) {
        
        
        /*
        //Creating Menu frame where the user can choose what units of mesaurement they would like to convert between
        JFrame frameMenu = new JFrame(); //Creates menu display
        frameMenu.setTitle("Unit Converter Tool");
        frameMenu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //When closing the window, the program stops running
        frameMenu.setResizable(false);
        frameMenu.setSize(500,500);
        frameMenu.setVisible(true);
        
        ImageIcon iconMenu = new ImageIcon("measurement.png");
        frameMenu.setIconImage(iconMenu.getImage()); //sets the frames icon
        frameMenu.getContentPane().setBackground(new Color(0xF7D560)); //changes frames colour (hexadecimal)
        */
        
        
        MenuDisplayFrame menuDisplayFrame = new MenuDisplayFrame();
    }
    
}
