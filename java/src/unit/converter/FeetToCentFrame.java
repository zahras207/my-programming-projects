
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
public class FeetToCentFrame extends JFrame implements ActionListener{
    JTextField feetField;
    JTextField inchField;
    JTextField resultsField;
    public FeetToCentFrame() {
        
        
    
    //Creating a label
        JLabel titleLabel = new JLabel();
        this.setLayout(null);
        titleLabel.setText("Convert from feet/inches to centimeters ");
        titleLabel.setFont(new Font("Segoe UI", Font.PLAIN, 14)); //Sets font
        titleLabel.setBounds(62, 20, 450, 30);
        
        //creating text fields where data can be inputted
        feetField = new JTextField();
        feetField.setBounds(50, 100, 100, 30);
        JLabel feetLabel = new JLabel("Input Feet here");
        feetLabel.setFont(new Font("Segoe UI", Font.PLAIN, 11)); 
        feetLabel.setBounds(50, 70, 100, 25);
        
        
        inchField = new JTextField();
        inchField.setBounds(300, 100, 100, 30);
        JLabel inchLabel = new JLabel("Input Inches here");
        inchLabel.setFont(new Font("Segoe UI", Font.PLAIN, 11)); 
        inchLabel.setBounds(300, 70, 100, 25);
        
        JLabel resultsLabel = new JLabel("Centimeters:");
        resultsLabel.setBounds(120, 170, 100, 25);
        
        resultsField = new JTextField();
        resultsField.setBounds(220, 170, 150, 25);
        resultsField.setEditable(false); //So the field cannot be edited this field
        
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
        this.add(feetField);
        this.add(inchField);
        this.add(feetLabel);
        this.add(inchLabel);
        this.add(resultsLabel);
        this.add(resultsField);
        this.add(convertButton);
      
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e){
        convertToCent();
    }
            
    private void convertToCent(){
        try {
            double feet = Double.parseDouble(feetField.getText()); // double gives extra precision, changes string to double
            double inches = Double.parseDouble(inchField.getText());
            
            double totalInches = (feet * 12) + inches;
            double centimeters = totalInches * 2.54;
            
            resultsField.setText(String.format("%.2f cm",centimeters)); //
          } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Please enter valid numbers for feet and inches.", "Input Error", JOptionPane.ERROR_MESSAGE);
        }
        
    }
}
