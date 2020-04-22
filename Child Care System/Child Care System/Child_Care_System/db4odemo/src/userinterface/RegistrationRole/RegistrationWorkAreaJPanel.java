/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.RegistrationRole;

import Business.EcoSystem;
import Business.Employee.Employee;
import Business.Employee.EmployeeDirectory;
import Business.Enterprise.ChildHelpEnterprise;
import Business.Enterprise.Enterprise;
import Business.Enterprise.HospitalEnterprise;
import Business.Network.Network;
import Business.Organization.DoctorOrganization;
import Business.Organization.ApplicantOrganization;
import Business.Organization.Organization;
import Business.Role.DoctorRole;
import Business.Role.ApplicantRole;
import Business.UserAccount.UserAccount;
import Business.Validation.DOBValidation;
import Business.Validation.EmailValidation;
import Business.Validation.NumberValidation;
import Business.Validation.PasswordValidation;
import Business.Validation.PhoneNoValidation;
import Business.Validation.StringValidation;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.InputVerifier;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author hp
 */

public class RegistrationWorkAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form RegistrationworkAreaJPanel
     */
    private JPanel userProcessContainer;
    private EmployeeDirectory employeeDirectory;
    private EcoSystem business; 
    private Enterprise enterprise;
    private Organization organization;
    public RegistrationWorkAreaJPanel(JPanel userProcessContainer, EcoSystem business) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
       this.business = business;
       inputVerifier();
       populateCountryComboBox();
    }
    
    public void inputVerifier()
    {
        InputVerifier strValidation = new StringValidation();
        firstNameText.setInputVerifier(strValidation);
        LastNameText.setInputVerifier(strValidation);
        userNameTxt.setInputVerifier(strValidation);
        addressLine1Text.setInputVerifier(strValidation);
        addressLine2Text.setInputVerifier(strValidation);
        cityText.setInputVerifier(strValidation);
        occupationTxt.setInputVerifier(strValidation);
        
        InputVerifier noValidation = new NumberValidation();
        zipCodeTxt.setInputVerifier(noValidation);
        
        InputVerifier phnValidation = new PhoneNoValidation();
        phoneTxt.setInputVerifier(phnValidation);
        
        InputVerifier emailValidation = new EmailValidation();
        mailTxt.setInputVerifier(emailValidation);
        confirmaMailTxt.setInputVerifier(emailValidation);
        
        InputVerifier dobValidation = new DOBValidation();
        DobText.setInputVerifier(dobValidation);
        
        InputVerifier psdValidation = new PasswordValidation();
        passswordTxt.setInputVerifier(psdValidation);
        confirmPasswordTxt.setInputVerifier(psdValidation);
    }
    
    private void populateCountryComboBox()
        {
            countryComboBox.removeAllItems();
            countryComboBox.addItem("Please select a country");
            countryComboBox.addItem("United States");
        }   
        
    private void populateNetworkComboBox()
    {
        networkComboBox.removeAllItems();
        if(business.getNetworkList().isEmpty())
        {
        JOptionPane.showMessageDialog(null, "Networks does not exist! Sorry for inconvenience.");  
         return;        
        }
        networkComboBox.addItem("Please Select a Network");
        for(Network network : business.getNetworkList()){
             networkComboBox.addItem(network);
         }
    }
    
     public void getEnterprise(Network network)
    {
     try
                {
                 for (Network n : business.getNetworkList())
                    {
                    if(n.getName().equals(network.getName()))   
                    {     
                        for(Enterprise e : n.getEnterpriseDirectory().getEnterpriseList())
                      {
                           if(e instanceof ChildHelpEnterprise && applicantRadioBtn.isSelected())
                           {
                             this.enterprise = e;
                             network = n;
                            }
                           
                           if(e instanceof HospitalEnterprise && doctorRadioBtn.isSelected())
                           {
                             this.enterprise = e;
                             network = n;
                            }
                    }
    }
                    }
                }
     catch(Exception e)
                {
                 JOptionPane.showMessageDialog(null, "Please create Enterprise","warning", JOptionPane.WARNING_MESSAGE);
                    return;    
                }
    }
     
     
     public void getOrganization(String orgName, Enterprise e){
     
        try
        {
     for (Organization organization : e.getOrganizationDirectory().getOrganizationList()){
         if(orgName.equals("HelpSeeker") && organization instanceof ApplicantOrganization)
             {
               this.organization = organization;
               this.employeeDirectory = organization.getEmployeeDirectory();
             }  
       
       else if(orgName.equals("Doctor") && organization instanceof DoctorOrganization)
             {
               this.organization = organization;
               this.employeeDirectory = organization.getEmployeeDirectory();
             } 
             }
        }
        
        catch(Exception ex)
        {
         return;     
        }
     }
     
     public void resetFields()
    {
     passswordTxt.setText("");
     confirmPasswordTxt.setText("");
    firstNameText.setText("");
    LastNameText.setText("");
    DobText.setText("");
    addressLine1Text.setText("");
    addressLine2Text.setText("");
    cityText.setText("");
    zipCodeTxt.setText("");
    occupationTxt.setText("");
    mailTxt.setText("");
   confirmaMailTxt.setText("");
    phoneTxt.setText("");
    applicantRadioBtn.setSelected(false);
    doctorRadioBtn.setSelected(false);
     
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel8 = new javax.swing.JLabel();
        stateComboBox = new javax.swing.JComboBox();
        addressLine1Text = new javax.swing.JTextField();
        countryComboBox = new javax.swing.JComboBox();
        jLabel7 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        confirmPasswordTxt = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        passswordTxt = new javax.swing.JTextField();
        userNameTxt = new javax.swing.JTextField();
        zipCodeTxt = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        cityText = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        addressLine2Text = new javax.swing.JTextField();
        genderComboBox = new javax.swing.JComboBox();
        doctorRadioBtn = new javax.swing.JRadioButton();
        jLabel14 = new javax.swing.JLabel();
        applicantRadioBtn = new javax.swing.JRadioButton();
        jLabel13 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        confirmaMailTxt = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        mailTxt = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        DobText = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        LastNameText = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        firstNameText = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        phoneTxt = new javax.swing.JTextField();
        registerNowBtn = new javax.swing.JButton();
        jLabel20 = new javax.swing.JLabel();
        networkComboBox = new javax.swing.JComboBox();
        jLabel18 = new javax.swing.JLabel();
        occupationTxt = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel8.setText("ADDRESS LINE 2 :");
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 390, -1, -1));

        stateComboBox.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        stateComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stateComboBoxActionPerformed(evt);
            }
        });
        add(stateComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 310, 144, -1));

        addressLine1Text.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        addressLine1Text.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addressLine1TextActionPerformed(evt);
            }
        });
        add(addressLine1Text, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 350, 144, -1));

        countryComboBox.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        countryComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                countryComboBoxActionPerformed(evt);
            }
        });
        add(countryComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 270, 144, -1));

        jLabel7.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel7.setText("ADDRESS LINE 1 :");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 350, -1, -1));

        jLabel19.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel19.setText("RE-ENTER PASSWORD :");
        add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 280, -1, -1));

        jLabel6.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel6.setText("STATE :");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 310, -1, -1));

        confirmPasswordTxt.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        confirmPasswordTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmPasswordTxtActionPerformed(evt);
            }
        });
        add(confirmPasswordTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 280, 150, -1));

        jLabel5.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel5.setText("COUNTRY :");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 270, -1, -1));

        jLabel17.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel17.setText("PASSWORD :");
        add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 240, -1, -1));

        passswordTxt.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        passswordTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passswordTxtActionPerformed(evt);
            }
        });
        add(passswordTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 240, 150, -1));

        userNameTxt.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        userNameTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userNameTxtActionPerformed(evt);
            }
        });
        add(userNameTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 200, 150, -1));

        zipCodeTxt.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        zipCodeTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                zipCodeTxtActionPerformed(evt);
            }
        });
        add(zipCodeTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 470, 144, -1));

        jLabel10.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel10.setText("ZIP CODE:");
        add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 480, -1, -1));

        cityText.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        cityText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cityTextActionPerformed(evt);
            }
        });
        add(cityText, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 430, 144, -1));

        jLabel9.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel9.setText("CITY :");
        add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 430, 130, 30));

        addressLine2Text.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        addressLine2Text.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addressLine2TextActionPerformed(evt);
            }
        });
        add(addressLine2Text, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 390, 144, -1));

        genderComboBox.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        genderComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Choose gender", "Female", "Male", "Transgender", "Unknown" }));
        add(genderComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 590, 144, -1));

        buttonGroup1.add(doctorRadioBtn);
        doctorRadioBtn.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        doctorRadioBtn.setText("Doctor");
        doctorRadioBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                doctorRadioBtnActionPerformed(evt);
            }
        });
        add(doctorRadioBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 100, 160, -1));

        jLabel14.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel14.setText("PHONE NUMBER :");
        add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 630, -1, -1));

        buttonGroup1.add(applicantRadioBtn);
        applicantRadioBtn.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        applicantRadioBtn.setText("Applicant");
        applicantRadioBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                applicantRadioBtnActionPerformed(evt);
            }
        });
        add(applicantRadioBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 100, -1, -1));

        jLabel13.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel13.setText("GENDER :");
        add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 590, -1, -1));

        jLabel1.setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
        jLabel1.setText("Your Child Care, at your Service!");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 30, -1, -1));

        confirmaMailTxt.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        confirmaMailTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmaMailTxtActionPerformed(evt);
            }
        });
        add(confirmaMailTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 550, 144, -1));

        jLabel12.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel12.setText("CONFIRM E-MAIL ADDRESS :");
        add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 560, -1, -1));

        mailTxt.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        mailTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mailTxtActionPerformed(evt);
            }
        });
        add(mailTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 510, 144, -1));

        jLabel11.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel11.setText("E-MAIL ADDRESS :");
        add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 520, -1, -1));

        DobText.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        DobText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DobTextActionPerformed(evt);
            }
        });
        add(DobText, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 230, 144, -1));

        jLabel4.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel4.setText("DATE OF BIRTH (MM/DD/YYY) :");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, -1, -1));

        LastNameText.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        LastNameText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LastNameTextActionPerformed(evt);
            }
        });
        add(LastNameText, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 190, 144, -1));

        jLabel16.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel16.setText("USERNAME :");
        add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 200, -1, -1));

        jLabel3.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel3.setText("LAST NAME :");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, -1, -1));

        jLabel15.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        jLabel15.setText("Create your user account here:");
        add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 150, -1, -1));

        firstNameText.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        firstNameText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                firstNameTextActionPerformed(evt);
            }
        });
        add(firstNameText, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 150, 144, -1));

        jLabel2.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel2.setText("FIRST NAME :");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, -1, -1));

        phoneTxt.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        phoneTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                phoneTxtActionPerformed(evt);
            }
        });
        add(phoneTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 630, 144, -1));

        registerNowBtn.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        registerNowBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/button_register (2).png"))); // NOI18N
        registerNowBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerNowBtnActionPerformed(evt);
            }
        });
        add(registerNowBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 390, 210, 60));

        jLabel20.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel20.setText("PLEASE SELECT NETWORK CITY:");
        add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 320, -1, -1));

        networkComboBox.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        add(networkComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 320, 150, -1));

        jLabel18.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel18.setText("OCCUPATION:");
        add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 670, -1, -1));

        occupationTxt.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        occupationTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                occupationTxtActionPerformed(evt);
            }
        });
        add(occupationTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 670, 144, 30));

        jLabel21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/blue-and-silver-stetoscope-40568.jpg"))); // NOI18N
        add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void addressLine1TextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addressLine1TextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addressLine1TextActionPerformed

    private void confirmPasswordTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmPasswordTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_confirmPasswordTxtActionPerformed

    private void passswordTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passswordTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passswordTxtActionPerformed

    private void userNameTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userNameTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_userNameTxtActionPerformed

    private void zipCodeTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_zipCodeTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_zipCodeTxtActionPerformed

    private void cityTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cityTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cityTextActionPerformed

    private void addressLine2TextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addressLine2TextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addressLine2TextActionPerformed

    private void confirmaMailTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmaMailTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_confirmaMailTxtActionPerformed

    private void mailTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mailTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mailTxtActionPerformed

    private void DobTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DobTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DobTextActionPerformed

    private void LastNameTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LastNameTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_LastNameTextActionPerformed

    private void firstNameTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_firstNameTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_firstNameTextActionPerformed

    private void phoneTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_phoneTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_phoneTxtActionPerformed

    private void registerNowBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerNowBtnActionPerformed
        // TODO add your handling code here:

        try
        {
            if(countryComboBox.getSelectedIndex()<1 || stateComboBox.getSelectedIndex()<1)
            {
                JOptionPane.showMessageDialog(null, "Please Enter valid data for country and state ","warning", JOptionPane.WARNING_MESSAGE);
                return;
            }
            if(genderComboBox.getSelectedIndex()<1 )
            {
                JOptionPane.showMessageDialog(null, "Please Enter valid gender ","warning", JOptionPane.WARNING_MESSAGE);
                return;
            }

            Date dateOfBirthVal = new SimpleDateFormat("MM/dd/yyyy").parse(DobText.getText()) ;
            //int age = Age.calculateAge(dateOfBirthVal);
            
            String firstName =   firstNameText.getText();
            String lastName = LastNameText.getText();
            String name = firstName+" "+lastName;
            String address1 = addressLine1Text.getText();
            String address2 = addressLine2Text.getText();
            String city = cityText.getText();
            String zipCode = zipCodeTxt.getText();
            String emailId = mailTxt.getText();
            String confirmEmail = confirmaMailTxt.getText();
            String gender = (String)genderComboBox.getSelectedItem();
            String country = (String)countryComboBox.getSelectedItem();
            String state = (String)stateComboBox.getSelectedItem();
            String phoneNumber = phoneTxt.getText();
            String occupation = occupationTxt.getText();
            if(firstName != null && !firstName.isEmpty() &&
                lastName!= null && !lastName.isEmpty() &&
                    occupation!= null && !occupation.isEmpty() &&
                address1!=null && !address1.isEmpty() &&
                address2!=null && !address2.isEmpty() &&
                city!=null && !city.isEmpty() &&
                emailId!=null && !emailId.isEmpty() &&
                confirmEmail!=null && !confirmEmail.isEmpty() &&
                zipCode != null && !zipCode.isEmpty() &&
                gender!=null && !gender.isEmpty() && !phoneNumber.isEmpty()
                &&  country!=null && !country.isEmpty()
                &&  state!=null && !state.isEmpty()
            )

            {
                if(buttonGroup1.getSelection()==null)
                {
                    JOptionPane.showMessageDialog(null, "Please select radio button to know if you are applicant or a doctor ","warning", JOptionPane.WARNING_MESSAGE);
                    return;
                }

                if(!(confirmEmail.equals(emailId)))
                {
                    JOptionPane.showMessageDialog(null, "Email Address does not match, Please Enter valid email Address","warning", JOptionPane.WARNING_MESSAGE);
                    return;
                }
                                Employee employee = null;

                if(doctorRadioBtn.isSelected())
                {
                    
   
                 
                  if(networkComboBox.getSelectedIndex()<1)
                    {
                    JOptionPane.showMessageDialog(null, "Please choose a closest city","warning", JOptionPane.WARNING_MESSAGE);
                    return;     
                    }
                
                String userName = userNameTxt.getText();
                String password = String.valueOf(passswordTxt.getText());
                String confirmPassword =String.valueOf(confirmPasswordTxt.getText());
                
                Network network = (Network)networkComboBox.getSelectedItem();
                if(!(password.equals(confirmPassword)))
                {
                    JOptionPane.showMessageDialog(null, "Password does not match, Please Enter valid Password Address","warning", JOptionPane.WARNING_MESSAGE);
                    organization.getEmployeeDirectory().getEmployeeList().remove(employee);
                    return;
                }
                getEnterprise(network);
                if(enterprise==null)
                    {
                     JOptionPane.showMessageDialog(null, "Enterprise does not exist for the network! "+network.getName(),"warning", JOptionPane.WARNING_MESSAGE);
                     return;      
                    }
                getOrganization("Doctor",enterprise);
                if(organization==null)
                    {
                     JOptionPane.showMessageDialog(null, "Doctor Organization does not exist for the enterprise! "+enterprise.getName(),"warning", JOptionPane.WARNING_MESSAGE);
                     return;      
                    } 
                  employee = organization.getEmployeeDirectory().addEmployee();
                   
                    for(Enterprise e : network.getEnterpriseDirectory().getEnterpriseList())
                    {
                     for(UserAccount account : e.getUserAccountDirectory().getUserAccountList())
                    {
                        if(account.getUsername().equals(userName))
                        {
                         JOptionPane.showMessageDialog(null, "User Name already exists!, Please Enter valid user name","warning", JOptionPane.WARNING_MESSAGE);
                         return;  
                        }
                        else
                        {
                        for(Organization o : e.getOrganizationDirectory().getOrganizationList())
                        {  
                         for(UserAccount ua1 : o.getUserAccountDirectory().getUserAccountList())
                            {  
                            if(ua1.getUsername().equals(userName))
                            {
                             JOptionPane.showMessageDialog(null, "User Name already exists!, Please Enter valid user name","warning", JOptionPane.WARNING_MESSAGE);
                             return;  
                            }   
                            } 
                        }
                        }
                    }
                    }
                    if(!organization.getUserAccountDirectory().checkIfUsernameIsUnique(userName))
                    {
                        JOptionPane.showMessageDialog(null, "User Name already exists!, Please Enter valid user name","warning", JOptionPane.WARNING_MESSAGE);
                        organization.getEmployeeDirectory().getEmployeeList().remove(employee);
                        return;
                    }
                    
                    
                    UserAccount userAccount = organization.getUserAccountDirectory().createUserAccount(userName, password, employee, new DoctorRole());
                    userAccount.setEmployee(employee);
                    userAccount.setNetwork(network);
                }
                
                else if(applicantRadioBtn.isSelected())
                {
                    
   
                 
                  if(networkComboBox.getSelectedIndex()<1)
                    {
                    JOptionPane.showMessageDialog(null, "Please choose a closest city","warning", JOptionPane.WARNING_MESSAGE);
                    return;     
                    }
                
                    
               
                Network network = (Network)networkComboBox.getSelectedItem();
                String userName = userNameTxt.getText();
                String password = String.valueOf(passswordTxt.getText());
                String confirmPassword =String.valueOf(confirmPasswordTxt.getText());
                if(!(password.equals(confirmPassword)))
                {
                    JOptionPane.showMessageDialog(null, "Password does not match, Please Enter valid Password Address","warning", JOptionPane.WARNING_MESSAGE);
                    organization.getEmployeeDirectory().getEmployeeList().remove(employee);
                    return;
                }
                getEnterprise(network);
                if(enterprise==null)
                    {
                     JOptionPane.showMessageDialog(null, "Enterprise does not exist for the network! "+network.getName(),"warning", JOptionPane.WARNING_MESSAGE);
                     return;      
                    }
                
                getOrganization("HelpSeeker",enterprise);
                if(organization==null)
                    {
                     JOptionPane.showMessageDialog(null, "HelpSeeker Organization does not exist for the enterprise! "+enterprise.getName(),"warning", JOptionPane.WARNING_MESSAGE);
                     return;      
                    } 
                  employee = organization.getEmployeeDirectory().addEmployee();
                   
                    for(Enterprise e : network.getEnterpriseDirectory().getEnterpriseList())
                    {
                     for(UserAccount account : e.getUserAccountDirectory().getUserAccountList())
                    {
                        if(account.getUsername().equals(userName))
                        {
                         JOptionPane.showMessageDialog(null, "User Name already exists!, Please Enter valid user name","warning", JOptionPane.WARNING_MESSAGE);
                         return;  
                        }
                        else
                        {
                        for(Organization o : e.getOrganizationDirectory().getOrganizationList())
                        {  
                         for(UserAccount ua1 : o.getUserAccountDirectory().getUserAccountList())
                            {  
                            if(ua1.getUsername().equals(userName))
                            {
                             JOptionPane.showMessageDialog(null, "User Name already exists!, Please Enter valid user name","warning", JOptionPane.WARNING_MESSAGE);
                             return;  
                            }   
                            } 
                        }
                        }
                    }
                    }
                    if(!organization.getUserAccountDirectory().checkIfUsernameIsUnique(userName))
                    {
                        JOptionPane.showMessageDialog(null, "User Name already exists!, Please Enter valid user name","warning", JOptionPane.WARNING_MESSAGE);
                        organization.getEmployeeDirectory().getEmployeeList().remove(employee);
                        return;
                    }
                    
                    
                    UserAccount userAccount1 = organization.getUserAccountDirectory().createUserAccount(userName, password, employee, new ApplicantRole());
                    userAccount1.setEmployee(employee);
                    userAccount1.setNetwork(network);
                    
                   /* if (organization!=null){
                        organization.getWorkQueue().getWorkRequestList().add(request);
                        userAccount.getWorkQueue().getWorkRequestList().add(request);
                        userAccount.setEnabled(false);
                    }*/
                }
            
                employee.setFirstName(firstName);
                employee.setLastname(lastName);
                employee.setAddress2(address2);
                employee.setAddress1(address1);
                employee.setCity(city);
                employee.setZipCode(zipCode);
                employee.setOccupation(occupation);
                employee.setEmailId(emailId);
                employee.setDob(dateOfBirthVal);
                employee.setPhoneNumber(phoneNumber);
                employee.setGender(gender);
                employee.setCountry(country);
                employee.setState(state);
                employee.setName(name);
                JOptionPane.showMessageDialog(null, "Your Profile has been created successfully", "success", JOptionPane.PLAIN_MESSAGE);
                resetFields();
            }
        }
        catch(Exception ex)
        {
            return;
        }

    }//GEN-LAST:event_registerNowBtnActionPerformed

    private void stateComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stateComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_stateComboBoxActionPerformed

    private void countryComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_countryComboBoxActionPerformed
        // TODO add your handling code here:
        
          
        stateComboBox.removeAllItems();
       
        
      if(countryComboBox.getSelectedIndex()>0)
      {
          stateComboBox.addItem("Please select a State");
          stateComboBox.addItem("Massachusatts");
      }
    }//GEN-LAST:event_countryComboBoxActionPerformed

    private void occupationTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_occupationTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_occupationTxtActionPerformed

    private void doctorRadioBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_doctorRadioBtnActionPerformed
        // TODO add your handling code here:
        populateNetworkComboBox();
    }//GEN-LAST:event_doctorRadioBtnActionPerformed

    private void applicantRadioBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_applicantRadioBtnActionPerformed
        // TODO add your handling code here:
        populateNetworkComboBox();
    }//GEN-LAST:event_applicantRadioBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField DobText;
    private javax.swing.JTextField LastNameText;
    private javax.swing.JTextField addressLine1Text;
    private javax.swing.JTextField addressLine2Text;
    private javax.swing.JRadioButton applicantRadioBtn;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JTextField cityText;
    private javax.swing.JTextField confirmPasswordTxt;
    private javax.swing.JTextField confirmaMailTxt;
    private javax.swing.JComboBox countryComboBox;
    private javax.swing.JRadioButton doctorRadioBtn;
    private javax.swing.JTextField firstNameText;
    private javax.swing.JComboBox genderComboBox;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField mailTxt;
    private javax.swing.JComboBox networkComboBox;
    private javax.swing.JTextField occupationTxt;
    private javax.swing.JTextField passswordTxt;
    private javax.swing.JTextField phoneTxt;
    private javax.swing.JButton registerNowBtn;
    private javax.swing.JComboBox stateComboBox;
    private javax.swing.JTextField userNameTxt;
    private javax.swing.JTextField zipCodeTxt;
    // End of variables declaration//GEN-END:variables
}
