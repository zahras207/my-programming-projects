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
import javax.swing.JTextField;

/**
 *
 * @author Owner
 */
public class CentToFeetFrame extends JFrame implements ActionListener{
    JTextField centField;
    JTextField feetRField;
    JTextField inchesField;
    public CentToFeetFrame() {
        
        
    
    //Creating a label
        JLabel titleLabel = new JLabel();
        this.setLayout(null);
        titleLabel.setText("Convert from centimeters to feet/inches ");
        titleLabel.setFont(new Font("Segoe UI", Font.PLAIN, 14)); //Sets font
        titleLabel.setBounds(62, 20, 450, 30);
        
        //creating text fields where data can be inputted
        centField = new JTextField();
        centField.setBounds(50, 100, 100, 30);
        JLabel centLabel = new JLabel("Input Centimeters here");
        centLabel.setFont(new Font("Segoe UI", Font.PLAIN, 11)); 
        centLabel.setBounds(50, 70, 110, 25);
        
        
        inchesField = new JTextField();
        inchesField.setBounds(300, 170, 100, 30);
        JLabel inchesLabel = new JLabel("Inches");
        inchesLabel.setFont(new Font("Segoe UI", Font.PLAIN, 11)); 
        inchesLabel.setBounds(300, 150, 100, 25);
        inchesField.setEditable(false);
        
        feetRField = new JTextField();
        feetRField.setBounds(300, 100, 100, 30);
        JLabel feetLabel = new JLabel("Feet");
        feetLabel.setFont(new Font("Segoe UI", Font.PLAIN, 11)); 
        feetLabel.setBounds(300, 70, 100, 25);
        feetRField.setEditable(false);
        
      
        //resultsLabel.setBounds(120, 170, 100, 25);
        
        
        
        
        JButton convertButton = new JButton("Convert");
        convertButton.setBounds(200, 220, 120, 30);
        convertButton.setBackground(new Color(0xA8B504));
        convertButton.addActionListener(this);
        
        this.setTitle("Length Converter Tool");
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); //When closing the window, the program stops running
        this.setResizable(false);
        this.setSize(575,575);
        
        ImageIcon iconMenu = new ImageIcon("measurement.png");
        this.setIconImage(iconMenu.getImage()); //sets the frames icon
        this.getContentPane().setBackground(new Color(0xF7D560)); //changes frames colour (hexadecimal)
        
        this.add(titleLabel); //Add the label to the frame
        this.add(feetRField);
        this.add(inchesField);
        this.add(feetLabel);
        this.add(inchesLabel);
        this.add(centLabel);
        this.add(centField);
        this.add(convertButton);
      
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e){
        convertToFeet();
    }
            
    private void convertToFeet(){
        try {
            double centimeter = Double.parseDouble(centField.getText());
            
            
            double totalInches = (centimeter / 2.54);
            int totalFeet = ((int) totalInches / 12);
            double totalInchesR = (totalInches % 12);
            
            feetRField.setText(String.format("%d feet",totalFeet)); //
            inchesField.setText(String.format("%.1f inches",totalInchesR));
          } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Please enter a valid number for centimeters.", "Input Error", JOptionPane.ERROR_MESSAGE);
        }
        
    }
}
