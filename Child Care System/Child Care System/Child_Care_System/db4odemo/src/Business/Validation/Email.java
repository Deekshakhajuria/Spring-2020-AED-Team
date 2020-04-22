/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Validation;

import javax.mail.Authenticator;
import javax.mail.PasswordAuthentication;
/**
 *
 * @author deekshakhajuria
 */
public class Email extends Authenticator{
    
    public static final String SMTP_AUTH_USER = "childhealthcare@gmail.com";                                 
    public static final String SMTP_AUTH_PWD  = "childhealthcare";
    
    @Override
    public PasswordAuthentication getPasswordAuthentication()                                             
    {                                                                                                                                      
        String username = SMTP_AUTH_USER;                                                                    
        String password = SMTP_AUTH_PWD;                                                                     
        return new PasswordAuthentication(username, password);                                             
    } 
}
