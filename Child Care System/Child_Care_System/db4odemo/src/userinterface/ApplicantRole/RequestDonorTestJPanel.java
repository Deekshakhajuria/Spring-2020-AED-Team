/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.ApplicantRole;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.DonorOrganization;
import Business.Organization.ManagerOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import Business.Validation.MainValidation;
import Business.Validation.StringValidation;
import Business.WorkQueue.DonorTestWorkRequest;
import Business.WorkQueue.ManagerWorkRequest;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.InputVerifier;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author hp
 */
public class RequestDonorTestJPanel extends javax.swing.JPanel {

    /**
     * Creates new form RequestDonorTestJpanel
     */
     private JPanel userProcessContainer;
    private Enterprise enterprise;
    private UserAccount userAccount;
    EcoSystem business;
    private DonorOrganization donorOrganization;
    RequestDonorTestJPanel(JPanel userProcessContainer, UserAccount account, Enterprise enterprise,EcoSystem business) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.enterprise = enterprise;
        this.userAccount = account;
        this.business=business;
        valueLabel1.setText(enterprise.getName());
        inputVerifier();
        populateDoctorComboBx();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        messageJTextField = new javax.swing.JTextField();
        backJButton = new javax.swing.JButton();
        enterpriseLabel = new javax.swing.JLabel();
        valueLabel1 = new javax.swing.JLabel();
        requestTestJButton = new javax.swing.JButton();
        doctorComboBx = new javax.swing.JComboBox();
        enterpriseLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel1.setText("Message");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 220, 80, -1));

        messageJTextField.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        add(messageJTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 220, 180, -1));

        backJButton.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        backJButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Double Left_100px.png"))); // NOI18N
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });
        add(backJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 50, 60, 40));

        enterpriseLabel.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        enterpriseLabel.setText("Donor Name:");
        add(enterpriseLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 150, 110, 30));

        valueLabel1.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        valueLabel1.setText("<value>");
        add(valueLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 70, 158, 26));

        requestTestJButton.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        requestTestJButton.setText("Request Test");
        requestTestJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                requestTestJButtonActionPerformed(evt);
            }
        });
        add(requestTestJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 290, 140, 40));

        doctorComboBx.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        doctorComboBx.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        add(doctorComboBx, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 150, 180, 30));

        enterpriseLabel1.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        enterpriseLabel1.setText("ENTERPRISE:");
        add(enterpriseLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 70, 120, 30));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/blue-and-silver-stetoscope-40568.jpg"))); // NOI18N
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1610, -1));
    }// </editor-fold>//GEN-END:initComponents

    public void inputVerifier()
    {
        InputVerifier strValidation = new StringValidation();
        messageJTextField.setInputVerifier(strValidation);
    }
    
     public void populateDoctorComboBx()
    {
       try
       {
        doctorComboBx.removeAllItems();
        donorOrganization =  MainValidation.getDonorOrganization(business, userAccount);
   //    System.out.println("doctorOrganization"+doctorOrganization.getName());
       if(donorOrganization!=null)
       {
        if(donorOrganization.getUserAccountDirectory().getUserAccountList().isEmpty())
        {
        JOptionPane.showMessageDialog(null, "No doctors exists in our records as of now!","warning", JOptionPane.WARNING_MESSAGE);
         return;    
        }
         doctorComboBx.removeAllItems();
        for(UserAccount userAccount : donorOrganization.getUserAccountDirectory().getUserAccountList())
        {
        doctorComboBx.addItem(userAccount);
        }   
       }
       }
       catch(NullPointerException npe)
       {
       JOptionPane.showMessageDialog(null, "Donor Organization exists in our records as of now!","warning", JOptionPane.WARNING_MESSAGE);
         return;       
       }        
    }
    
    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed

        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        ApplicantWorkAreaJPanel dwjp = (ApplicantWorkAreaJPanel) component;
        dwjp.populateRequestTable();
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backJButtonActionPerformed

    private void requestTestJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_requestTestJButtonActionPerformed

        String message = messageJTextField.getText();
        if( messageJTextField.getText().trim().isEmpty() )
        {
            JOptionPane.showMessageDialog(null, "Please enter all the details");
            return;
        }
        DonorTestWorkRequest request = new DonorTestWorkRequest();
        request.setMessage(message);
        request.setSender(userAccount);
        request.setStatus("Sent");

        UserAccount docAccount = (UserAccount) doctorComboBx.getSelectedItem();
        
        donorOrganization =  MainValidation.getDonorOrganization(business, userAccount);
        donorOrganization.getWorkQueue().getWorkRequestList().add(request);
            docAccount.getWorkQueue().getWorkRequestList().add(request);
        /*Organization org = null;
        for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()){
            if (organization instanceof DonorOrganization){
                org = organization;
                break;
            }
        }

        if (org!=null){
            org.getWorkQueue().getWorkRequestList().add(request);
            userAccount.getWorkQueue().getWorkRequestList().add(request);
        }*/
                    
                JOptionPane.showMessageDialog(null, "Request is sent to Donor","Success", JOptionPane.PLAIN_MESSAGE);
        
    }//GEN-LAST:event_requestTestJButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backJButton;
    private javax.swing.JComboBox doctorComboBx;
    private javax.swing.JLabel enterpriseLabel;
    private javax.swing.JLabel enterpriseLabel1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField messageJTextField;
    private javax.swing.JButton requestTestJButton;
    private javax.swing.JLabel valueLabel1;
    // End of variables declaration//GEN-END:variables
}
