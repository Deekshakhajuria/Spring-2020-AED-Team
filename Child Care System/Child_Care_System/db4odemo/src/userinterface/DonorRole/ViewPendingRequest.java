/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.DonorRole;

import Business.EcoSystem;
import Business.Organization.DonorOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import Business.UserAccount.UserAccountDirectory;
import Business.WorkQueue.DonorTestWorkRequest;
import Business.WorkQueue.OrgansWorkRequest;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import userinterface.ApplicantRole.ApplicantUpdateJPanel;

/**
 *
 * @author niramaykelkar
 */
public class ViewPendingRequest extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private EcoSystem ecoSystem;
    private UserAccount userAccount;
    private DonorOrganization donorOrganization;
    private Organization organization;
    private UserAccountDirectory userAccountDirectory;
    /**
     * Creates new form ViewPendingRequest
     */
    public ViewPendingRequest(JPanel userProcessContainer, UserAccount userAccount, Organization organization, EcoSystem ecoSystem) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.ecoSystem = ecoSystem;
        this.userAccount = userAccount;
        //this.donorOrganization = (DonorOrganization)organization;
        this.organization=organization;
        populateJTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        populateJTable = new javax.swing.JTable();
        refreshJButton = new javax.swing.JButton();
        processJButton = new javax.swing.JButton();
        assignJButton = new javax.swing.JButton();
        donationREq = new javax.swing.JLabel();
        backJButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setLayout(null);

        populateJTable.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        populateJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Message", "Sender", "Receiver", "Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(populateJTable);
        if (populateJTable.getColumnModel().getColumnCount() > 0) {
            populateJTable.getColumnModel().getColumn(0).setResizable(false);
            populateJTable.getColumnModel().getColumn(1).setResizable(false);
            populateJTable.getColumnModel().getColumn(2).setResizable(false);
            populateJTable.getColumnModel().getColumn(3).setResizable(false);
        }

        add(jScrollPane1);
        jScrollPane1.setBounds(40, 150, 600, 169);

        refreshJButton.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        refreshJButton.setText("Refresh");
        refreshJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshJButtonActionPerformed(evt);
            }
        });
        add(refreshJButton);
        refreshJButton.setBounds(650, 150, 140, 30);

        processJButton.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        processJButton.setText("Process");
        processJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                processJButtonActionPerformed(evt);
            }
        });
        add(processJButton);
        processJButton.setBounds(650, 250, 140, 30);

        assignJButton.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        assignJButton.setText("Assign to me");
        assignJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                assignJButtonActionPerformed(evt);
            }
        });
        add(assignJButton);
        assignJButton.setBounds(650, 200, 140, 30);

        donationREq.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        donationREq.setText("Process Donation Requests:");
        add(donationREq);
        donationREq.setBounds(280, 60, 430, 50);

        backJButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Double Left_100px.png"))); // NOI18N
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });
        add(backJButton);
        backJButton.setBounds(30, 20, 60, 40);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/blue-and-silver-stetoscope-40568.jpg"))); // NOI18N
        add(jLabel1);
        jLabel1.setBounds(0, 0, 1610, 2000);
    }// </editor-fold>//GEN-END:initComponents

    public void populateJTable()
    {
        {
        DefaultTableModel model = (DefaultTableModel)populateJTable.getModel();
        model.setRowCount(0);
        for(WorkRequest request : organization.getWorkQueue().getWorkRequestList())
        {
            Object[] row = new Object[4];
            row[0] = request;
            row[1] = request.getSender().getEmployee().getName();
            row[2] = request.getReceiver() == null ? null : request.getReceiver().getEmployee().getName();
            row[3] = request.getStatus();
            
            model.addRow(row);
        }
    }
    }
    private void refreshJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshJButtonActionPerformed
        populateJTable();
    }//GEN-LAST:event_refreshJButtonActionPerformed

    private void processJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_processJButtonActionPerformed

        int selectedRow = populateJTable.getSelectedRow();
        if (selectedRow < 0){
            JOptionPane.showMessageDialog(null, "Please select a row fromt the table", "warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        DonorTestWorkRequest request = (DonorTestWorkRequest)populateJTable.getValueAt(selectedRow, 0);
        if(request.getReceiver() == null)
        {
            JOptionPane.showMessageDialog(null, "Need to assign the request first", "warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        if(request.getStatus().equalsIgnoreCase("Completed"))
        {
            JOptionPane.showMessageDialog(null, "It has already been completed", "warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        if(request.getStatus().equalsIgnoreCase("Processing") ||  request.getStatus().equalsIgnoreCase("Pending"))
        {
            if(request.getReceiver()!=userAccount)
            {
                JOptionPane.showMessageDialog(null, "It is under process currently!", "warning", JOptionPane.WARNING_MESSAGE);
                return;
            }
        }
        request.setStatus("Processing");
        ProcessRequestAreaJPanel pwrjp = new ProcessRequestAreaJPanel(userProcessContainer, request, userAccount);
        userProcessContainer.add("ProcessWorkRequestJPanel", pwrjp);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_processJButtonActionPerformed

    private void assignJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_assignJButtonActionPerformed

        int selectedRow = populateJTable.getSelectedRow();
        if (selectedRow < 0){
            JOptionPane.showMessageDialog(null, "Please select a row from the table", "warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        try{
        DonorTestWorkRequest request = (DonorTestWorkRequest)populateJTable.getValueAt(selectedRow, 0);
        if(request.getReceiver()!=null)
        {
            JOptionPane.showMessageDialog(null, "It has already being processed by someone else", "warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        request.setReceiver(userAccount);
        request.setStatus("Pending");
        populateJTable();
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, "Please assign request to Manager","Success", JOptionPane.PLAIN_MESSAGE);
        }
    }//GEN-LAST:event_assignJButtonActionPerformed

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed

        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backJButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton assignJButton;
    private javax.swing.JButton backJButton;
    private javax.swing.JLabel donationREq;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable populateJTable;
    private javax.swing.JButton processJButton;
    private javax.swing.JButton refreshJButton;
    // End of variables declaration//GEN-END:variables
}
