/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Validation;

import java.awt.Color;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.InputVerifier;
import javax.swing.JComponent;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author niramaykelkar
 */
public class PhoneNoValidation extends InputVerifier{
    
    @Override
    public boolean verify(JComponent input) {
        String text = ((JTextField) input).getText();
        
         String pattern = "^[1-9]{1}+[0-9]{9}$" ;
         Pattern phoneNoPattern = Pattern.compile(pattern);
            Matcher matcher = phoneNoPattern.matcher(text);
            if (text.length() > 0) {
               if (text.toLowerCase().startsWith(" ") || text.length() == 0 || matcher.matches() != true) {
                input.setBackground(Color.red);
                JOptionPane.showMessageDialog(input, "Please enter a valid Phone Number", "Error", JOptionPane.ERROR_MESSAGE);
                return false;
            } else {
                input.setBackground(Color.white);
                return true;
            }
            }    
        else {
            input.setBackground(Color.white);
            return true;
        }
    
   
    }
}
