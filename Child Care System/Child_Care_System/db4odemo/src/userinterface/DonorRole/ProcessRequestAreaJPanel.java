/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.DonorRole;

import Business.UserAccount.UserAccount;
import Business.Validation.StringValidation;
import Business.WorkQueue.DonorTestWorkRequest;
import Business.WorkQueue.ManagerWorkRequest;
import Business.WorkQueue.OrgansWorkRequest;
import java.awt.CardLayout;
import java.awt.Component;
import java.util.Date;
import javax.swing.InputVerifier;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author verle
 */
public class ProcessRequestAreaJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private DonorTestWorkRequest donorTestWorkRequest;
    private UserAccount userAccount;
    /**
     * Creates new form ProcessRequestAreaJPanel
     */
    public ProcessRequestAreaJPanel(JPanel userProcessContainer, DonorTestWorkRequest donorTestWorkRequest, UserAccount userAccount) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.donorTestWorkRequest = donorTestWorkRequest;
        this.userAccount = userAccount;
        resultComboBox.removeAllItems();
        resultComboBox.addItem(ManagerWorkRequest.REQUEST_ACCEPT);
        resultComboBox.addItem(ManagerWorkRequest.REQUEST_REJECT);
        inputVerifiers();
    }
    
    private void inputVerifiers() {
          
        InputVerifier strValidation = new StringValidation();
        commentTextField.setInputVerifier(strValidation);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        backJButton = new javax.swing.JButton();
        resultComboBox = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        commentTextField = new javax.swing.JTextField();
        submitJButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setLayout(null);

        backJButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Double Left_100px.png"))); // NOI18N
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });
        add(backJButton);
        backJButton.setBounds(70, 70, 60, 40);

        resultComboBox.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        resultComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        add(resultComboBox);
        resultComboBox.setBounds(490, 160, 163, 27);

        jLabel2.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel2.setText("Add comments: ");
        add(jLabel2);
        jLabel2.setBounds(300, 220, 123, 21);

        commentTextField.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        add(commentTextField);
        commentTextField.setBounds(490, 220, 163, 27);

        submitJButton.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        submitJButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/button_submit.png"))); // NOI18N
        submitJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitJButtonActionPerformed(evt);
            }
        });
        add(submitJButton);
        submitJButton.setBounds(520, 290, 130, 40);

        jLabel1.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel1.setText("Request Result");
        add(jLabel1);
        jLabel1.setBounds(300, 170, 116, 21);

        jLabel7.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        jLabel7.setText("Work Request");
        add(jLabel7);
        jLabel7.setBounds(400, 70, 160, 50);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Background.jpg"))); // NOI18N
        add(jLabel3);
        jLabel3.setBounds(0, 0, 1620, 1080);
    }// </editor-fold>//GEN-END:initComponents

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed

        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        ViewPendingRequest vpr = (ViewPendingRequest) component;
        vpr.populateJTable();
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backJButtonActionPerformed

    private void submitJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitJButtonActionPerformed
        if(resultComboBox.getSelectedIndex()<0 || commentTextField.getText().trim().isEmpty())
        {
            JOptionPane.showMessageDialog(null, "Enter data for all the fields", "warning", JOptionPane.WARNING_MESSAGE);
            return;
        }

        donorTestWorkRequest.setTestResult((String)resultComboBox.getSelectedItem());
        donorTestWorkRequest.setComments(commentTextField.getText());
        donorTestWorkRequest.setMessage(commentTextField.getText());
        donorTestWorkRequest.setStatus(ManagerWorkRequest.REQUEST_COMPLETED);
        donorTestWorkRequest.setResolveDate(new Date());
        userAccount.getWorkQueue().getWorkRequestList().add(donorTestWorkRequest);
        JOptionPane.showMessageDialog(null, "Processed Successfully ", "success", JOptionPane.PLAIN_MESSAGE);
        commentTextField.setText("");
    }//GEN-LAST:event_submitJButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backJButton;
    private javax.swing.JTextField commentTextField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JComboBox resultComboBox;
    private javax.swing.JButton submitJButton;
    // End of variables declaration//GEN-END:variables
}
