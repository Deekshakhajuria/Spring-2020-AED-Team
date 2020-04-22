/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Validation;

import java.util.Properties;
import java.util.Random;
import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

/**
 *
 * @author deekshakhajuria
 */
public class EmailTextSending {
    
    private static final String SMTP_HOST_NAME = "smtp.gmail.com"; 
    private static final String SMTP_PORT_NUMBER = "587"; 
    private static StringBuilder emailMsgTxt ;
        
    private static String emailSubjectTxt = "Thank you!";
    private static String emailFromAddress = "childhelpcare@gmail.com";
    
    public static String generatePassword(String name)
    {
        try
        {
            Random random = new Random();
            String value = String.valueOf(random.nextInt(10000));
            String value1 = String.valueOf(random.nextInt(100));
            StringBuilder sb = new StringBuilder();
            sb.append(value1);
            sb.append(name);
            sb.append(value);
            System.out.println(">>>>Password>>>>>"+sb.toString());
            return sb.toString();
        }
        catch(Exception e)
        {
          
        }
        return null;
    }
    
    public static String generateUsername(String name)
    {
        try
            {
            Random random = new Random();
            String value1 = String.valueOf(random.nextInt(100));
            StringBuilder sb = new StringBuilder();
            sb.append(value1);
            sb.append(name);
            System.out.println(">>>>Username>>>>"+sb.toString());
            return sb.toString();
    }
     catch(Exception e)
        {
            
        }
        return null;
    }
    
   /* public static boolean sendEmail(String msg, String emailId, String userName, String password)
    {
        boolean isSent = true;
 
        try {
        Properties props = new Properties();
        props.put("mail.smtp.host", SMTP_HOST_NAME);                                                        
        props.put("mail.smtp.auth", "true");  
        props.put("mail.smtp.starttls.enable","true");
        props.put("mail.smtp.port", "587");
        Authenticator mailAuthenticator = new Email();
        Session mailSession = Session.getDefaultInstance(props,mailAuthenticator);
        Message message = new MimeMessage(mailSession);
        InternetAddress fromAddress ;
        InternetAddress toAddress;
        try
           {
            fromAddress = new InternetAddress(emailFromAddress);
            toAddress = new InternetAddress(emailId);
           }
        
        catch (AddressException ae) {
            ae.printStackTrace();
            isSent= false;
            return isSent;
           }
            message.setSubject(emailSubjectTxt);
            message.setText(msg);
            message.setFrom(fromAddress);
            message.setRecipient(Message.RecipientType.TO, toAddress);
            
 
        Transport.send(message);
        System.out.println("Email Sent Successfully!");
        } 
        catch (MessagingException mex) {
            isSent=false;
            return isSent;
        }
        catch (Exception e) {
            isSent=false;
        }
        return isSent;
    }*/
}
