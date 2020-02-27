/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.ManageAirliners;

import Business.Airliner;
import Business.AirlinerDirectory;
import Business.FlightSchedule;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author niramaykelkar
 */
public class ManageAirlinersJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManageAirlinersJPanel
     */
    private JPanel CardSequenceJPanel;
    private AirlinerDirectory airlineDir;
    private FlightSchedule fSched;
    public ManageAirlinersJPanel(JPanel CardSequenceJPanel, AirlinerDirectory airlineDir, FlightSchedule fSched) {
      initComponents();
      this.CardSequenceJPanel=CardSequenceJPanel;
      this.airlineDir=airlineDir;
      this.fSched=fSched;
      populateTable();
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
        jScrollPane1 = new javax.swing.JScrollPane();
        tblAirliner = new javax.swing.JTable();
        createAirlinerBtn = new javax.swing.JButton();
        viewUpdateAirlinerBtn = new javax.swing.JButton();
        updateFleetBtn = new javax.swing.JButton();
        deleteAirlineBtn = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        jLabel1.setText("Airliner Details");

        tblAirliner.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Airliner Name", "Base"
            }
        ));
        jScrollPane1.setViewportView(tblAirliner);

        createAirlinerBtn.setText("Create Airliner");
        createAirlinerBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createAirlinerBtnActionPerformed(evt);
            }
        });

        viewUpdateAirlinerBtn.setText("Update Airliner");
        viewUpdateAirlinerBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewUpdateAirlinerBtnActionPerformed(evt);
            }
        });

        updateFleetBtn.setText("Update Fleet");
        updateFleetBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateFleetBtnActionPerformed(evt);
            }
        });

        deleteAirlineBtn.setText("Delete Airliner");
        deleteAirlineBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteAirlineBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(286, 286, 286)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(147, 147, 147)
                                .addComponent(createAirlinerBtn)
                                .addGap(27, 27, 27)
                                .addComponent(viewUpdateAirlinerBtn)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(deleteAirlineBtn))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(153, 153, 153)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addComponent(updateFleetBtn)))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(createAirlinerBtn)
                            .addComponent(viewUpdateAirlinerBtn)
                            .addComponent(deleteAirlineBtn)))
                    .addComponent(updateFleetBtn))
                .addContainerGap(161, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    public void populateTable()
    {
       DefaultTableModel dtm=(DefaultTableModel)tblAirliner.getModel();
       dtm.setRowCount(0);
       for(Airliner airline:airlineDir.getAirLinerList())
       {
           Object[] row=new Object[2];
           row[0]=airline;
           row[1]=airline.getAddress();
           dtm.addRow(row);
       }
    }
    
    private void createAirlinerBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createAirlinerBtnActionPerformed
        // TODO add your handling code here:
       CreateNewAirlinerJPanel create = new  CreateNewAirlinerJPanel(CardSequenceJPanel,airlineDir,fSched);
       CardSequenceJPanel.add("CreateNewAirlineJPanel",create);
       CardLayout layout = (CardLayout)CardSequenceJPanel.getLayout();
       layout.next(CardSequenceJPanel);
    }//GEN-LAST:event_createAirlinerBtnActionPerformed

    private void updateFleetBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateFleetBtnActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblAirliner.getSelectedRow();
        if(selectedRow>=0){ 
            Airliner airliner = (Airliner)tblAirliner.getValueAt(selectedRow, 0);
            UpdateFleetJPanel create = new  UpdateFleetJPanel(CardSequenceJPanel,airliner,fSched);
            CardSequenceJPanel.add("UpdateFleetJPanel",create);
            CardLayout layout = (CardLayout)CardSequenceJPanel.getLayout();
            layout.next(CardSequenceJPanel);
        }
        else{
            JOptionPane.showMessageDialog(null, "Please select a Row!!");
        }
        
    }//GEN-LAST:event_updateFleetBtnActionPerformed

    private void viewUpdateAirlinerBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewUpdateAirlinerBtnActionPerformed
        // TODO add your handling code here:
       int selectedRow = tblAirliner.getSelectedRow();
       if(selectedRow>=0){
            Airliner airliner = (Airliner)tblAirliner.getValueAt(selectedRow, 0);
            ViewAirlinerJPanel view = new  ViewAirlinerJPanel(CardSequenceJPanel,airliner);
       CardSequenceJPanel.add("ViewAirlinerJPanel",view);
       CardLayout layout = (CardLayout)CardSequenceJPanel.getLayout();
       layout.next(CardSequenceJPanel);
            }
        else{
            JOptionPane.showMessageDialog(null, "Please select a Row!!");
        }
    }//GEN-LAST:event_viewUpdateAirlinerBtnActionPerformed

    private void deleteAirlineBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteAirlineBtnActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblAirliner.getSelectedRow();
        if(selectedRow>=0){
            int selectionButton = JOptionPane.YES_NO_OPTION;
            int selectionResult = JOptionPane.showConfirmDialog(null, "Are you sure to delete??","Warning",selectionButton);
            if(selectionResult == JOptionPane.YES_OPTION){
                Airliner airliner = (Airliner)tblAirliner.getValueAt(selectedRow, 0);
                airlineDir.removeAirLiner(airliner);
                populateTable();
            }
        }else{
            JOptionPane.showMessageDialog(null, "Please select a Row!!");
        }
    }//GEN-LAST:event_deleteAirlineBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton createAirlinerBtn;
    private javax.swing.JButton deleteAirlineBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblAirliner;
    private javax.swing.JButton updateFleetBtn;
    private javax.swing.JButton viewUpdateAirlinerBtn;
    // End of variables declaration//GEN-END:variables
}
