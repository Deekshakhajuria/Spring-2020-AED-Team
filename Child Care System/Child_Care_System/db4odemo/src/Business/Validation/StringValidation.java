/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Validation;

import java.awt.Color;
import javax.swing.InputVerifier;
import javax.swing.JComponent;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author verle
 */
public class StringValidation extends InputVerifier{
    
    @Override
    public boolean verify(JComponent input) {
        String text = ((JTextField) input).getText();
     
        String pattern = "^[A-Za-z ]+[A-Za-z ]++$";
        //String pattern = "^([a-zA-Z\\u0080-\\u024F]+(?:. |-| |'))[a-zA-Z\\u0080-\\u024F]$";
        if (text.length() > 0) {
            if (text.toLowerCase().startsWith(" ") || text.length() == 0 || text.matches(pattern) != true) {
                input.setBackground(Color.red);
                JOptionPane.showMessageDialog(input, "Please enter a valid string", "Error", JOptionPane.ERROR_MESSAGE);
                return false;
            } else {
                input.setBackground(Color.white);
                return true;
            }
        }
        else
        {
            input.setBackground(Color.white);
            return true;
        }
    }
}
