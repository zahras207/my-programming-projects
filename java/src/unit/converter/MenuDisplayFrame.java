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

 
public class MenuDisplayFrame extends JFrame implements ActionListener{
    JButton lengthButton;
    JButton temperatureButton;
    
    public MenuDisplayFrame(){
    
        this.setLayout(null);
        
     //Creating Menu frame where the user can choose what units of mesaurement they would like to convert between
        JLabel menuLabel = new JLabel();
        menuLabel.setText("Choose the type of units you would like to convert between.");
        menuLabel.setFont(new Font("Segoe UI", Font.PLAIN, 14)); //Sets font
        //menuLabel.setOpaque(true); use command to see position of label
        menuLabel.setBounds(80, 50, 500, 50); // Set position and width and height
        
        //Creating a button for converting between units of length
        lengthButton = new JButton("Length Converter");
        lengthButton.setBounds(30, 200, 200, 50);
        lengthButton.setOpaque(true);
        lengthButton.setFont(new Font("Segoe UI", Font.PLAIN, 14));
        lengthButton.setBackground(new Color(0xA8B504));
        lengthButton.setFocusPainted(false); // Removes border highlight
        
        //Action Listener for lengthButton 
        lengthButton.addActionListener(this);

        
        //Creating a button for converting between units of temperature
        temperatureButton = new JButton("Temperature Converter");
        temperatureButton.setBounds(300, 200, 200, 50);
        temperatureButton.setOpaque(true);
        temperatureButton.setFont(new Font("Segoe UI", Font.PLAIN, 14));
        temperatureButton.setBackground(new Color(0xA8B504));
        temperatureButton.setFocusPainted(false); // Removes border highlight
        
        //Action Listener for temperatureButton 
        temperatureButton.addActionListener(this);

        //Setting for Menu display
        this.setTitle("Unit Converter Tool");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //When closing the window, the program stops running
        this.setResizable(false);
        this.setSize(575,575);
        
        ImageIcon iconMenu = new ImageIcon("measurement.png");
        this.setIconImage(iconMenu.getImage()); //sets the frames icon
        this.getContentPane().setBackground(new Color(0xF7D560)); //changes frames colour (hexadecimal)
       
        this.add(menuLabel); //Add the label to the frame
        
         //Setting buttons for the Menu, for temperature and length
        this.add(lengthButton);
        this.add(temperatureButton);
       
        
        this.setVisible(true);
        
        
    }
   
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == lengthButton){
            new LengthConverterFrame(); //Opens the frame to enter units
        }
    }
    
}
