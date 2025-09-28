
package unit.converter;

import javax.swing.JButton;
import java.awt.Color;
import java.util.Scanner;
import javax.swing.JFrame;
import javax.swing.ImageIcon;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.*;




public class LengthConverterFrame extends JFrame implements ActionListener{
    JButton feetToCentButton;
    JButton centTofeetButton;
    public LengthConverterFrame() {
        
        JLabel lengthLabel = new JLabel();
        this.setLayout(null);
        
        //Creating a label
        lengthLabel.setText("Convert between feet/inches and centimeters or vice versa");
        lengthLabel.setFont(new Font("Segoe UI", Font.PLAIN, 14)); //Sets font
        lengthLabel.setBounds(62, 20, 450, 30);
     
        //Creating a button for feet/inches to centimenters
        feetToCentButton = new JButton("Feet/Inches to Centimeters");
        feetToCentButton.setBounds(30, 200, 200, 50);
        feetToCentButton.setOpaque(true);
        feetToCentButton.setFont(new Font("Segoe UI", Font.PLAIN, 14));
        feetToCentButton.setBackground(new Color(0xA8B504));
        feetToCentButton.setFocusPainted(false); // Removes border highlight
        
        //Action Listener for lengthButton 
        feetToCentButton.addActionListener(this);
        
        
        //Creating a button for centimeters to feet/inches
        centTofeetButton = new JButton("Centimeters to Feet/Inches");
        centTofeetButton.setBounds(300, 200, 200, 50);
        centTofeetButton.setOpaque(true);
        centTofeetButton.setFont(new Font("Segoe UI", Font.PLAIN, 14));
        centTofeetButton.setBackground(new Color(0xA8B504));
        centTofeetButton.setFocusPainted(false); // Removes border highlight
        
        //Action Listener for centTofeetButton
        centTofeetButton.addActionListener(this);
        
        
        
        this.setTitle("Length Converter Tool");
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); //When closing the window, the program stops running
        this.setResizable(false);
        this.setSize(575,575);
        
        ImageIcon iconMenu = new ImageIcon("measurement.png");
        this.setIconImage(iconMenu.getImage()); //sets the frames icon
        this.getContentPane().setBackground(new Color(0xF7D560)); //changes frames colour (hexadecimal)
        
        this.add(lengthLabel); //Add the label to the frame
        this.add(feetToCentButton);
        this.add(centTofeetButton);
        setVisible(true);
    }
    

    
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == feetToCentButton) {
            new FeetToCentFrame(); //Opens the frame to enter units
        } else if (e.getSource() == centTofeetButton) {
            new CentToFeetFrame(); //Opens the frame to enter units
        }
    }
}

