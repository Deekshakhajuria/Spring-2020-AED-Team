/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface;

import Business.AirlinerDirectory;
import Business.FlightSchedule;
import UserInterface.ManageAirliners.ManageAirlinersJPanel;
import java.awt.CardLayout;

/**
 *
 * @author niramaykelkar
 */
public class FalconTravelAgencyMainJFrame extends javax.swing.JFrame {

    /**
     * Creates new form FalconTravelAgencyMainJFrame
     */
    private AirlinerDirectory airlineDir=new AirlinerDirectory();
    private FlightSchedule fSched=new FlightSchedule();
    public FalconTravelAgencyMainJFrame() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSplitPane2 = new javax.swing.JSplitPane();
        jPanel1 = new javax.swing.JPanel();
        manageAirlinerBtn = new javax.swing.JButton();
        manageAgencyBtn = new javax.swing.JButton();
        manageCustomerBtn = new javax.swing.JButton();
        CardSequenceJPanel = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        manageAirlinerBtn.setText("Manage Airliners");
        manageAirlinerBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageAirlinerBtnActionPerformed(evt);
            }
        });
        jPanel1.add(manageAirlinerBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 104, 164, -1));

        manageAgencyBtn.setText("Manage Agency");
        manageAgencyBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageAgencyBtnActionPerformed(evt);
            }
        });
        jPanel1.add(manageAgencyBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 151, 164, -1));

        manageCustomerBtn.setText("Manage Customers");
        manageCustomerBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageCustomerBtnActionPerformed(evt);
            }
        });
        jPanel1.add(manageCustomerBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 198, 160, -1));

        jSplitPane2.setLeftComponent(jPanel1);

        CardSequenceJPanel.setLayout(new java.awt.CardLayout());
        jSplitPane2.setRightComponent(CardSequenceJPanel);

        getContentPane().add(jSplitPane2, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void manageAirlinerBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageAirlinerBtnActionPerformed
        // TODO add your handling code here:
       ManageAirlinersJPanel manage = new ManageAirlinersJPanel(CardSequenceJPanel,airlineDir,fSched);
       CardSequenceJPanel.add("ManageAirlineJPanel_1",manage);
       CardLayout layout = (CardLayout)CardSequenceJPanel.getLayout();
       layout.next(CardSequenceJPanel);
    }//GEN-LAST:event_manageAirlinerBtnActionPerformed

    private void manageAgencyBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageAgencyBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_manageAgencyBtnActionPerformed

    private void manageCustomerBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageCustomerBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_manageCustomerBtnActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FalconTravelAgencyMainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FalconTravelAgencyMainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FalconTravelAgencyMainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FalconTravelAgencyMainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FalconTravelAgencyMainJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel CardSequenceJPanel;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSplitPane jSplitPane2;
    private javax.swing.JButton manageAgencyBtn;
    private javax.swing.JButton manageAirlinerBtn;
    private javax.swing.JButton manageCustomerBtn;
    // End of variables declaration//GEN-END:variables
}