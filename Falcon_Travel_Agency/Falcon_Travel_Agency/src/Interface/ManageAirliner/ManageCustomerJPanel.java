/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface.ManageAirliner;

import Business.Customer;
import Business.TravelAgency;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author niramaykelkar
 */
public class ManageCustomerJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManageCustomerJPanel
     */
    private JPanel cardSequenceJPanel;
    private TravelAgency travelAgency;
    private Customer customer;
    
    public ManageCustomerJPanel(TravelAgency travelAgency, JPanel cardSequenceJPanel) {
        initComponents();
        this.cardSequenceJPanel = cardSequenceJPanel;
        this.travelAgency = travelAgency;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnAdd = new javax.swing.JButton();
        btnFlightView = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        btnViewTicket = new javax.swing.JButton();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnAdd.setText("Add Customer");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });
        add(btnAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(366, 85, 150, 40));

        btnFlightView.setText("View Flight Schedule");
        btnFlightView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFlightViewActionPerformed(evt);
            }
        });
        add(btnFlightView, new org.netbeans.lib.awtextra.AbsoluteConstraints(366, 175, 150, 40));

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("ADD CUSTOMER / BOOK A SEAT");
        jLabel1.setToolTipText("");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 13, 365, 54));

        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 13, 85, 35));

        btnViewTicket.setText("View Ticket");
        btnViewTicket.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewTicketActionPerformed(evt);
            }
        });
        add(btnViewTicket, new org.netbeans.lib.awtextra.AbsoluteConstraints(366, 265, 150, 40));
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        // TODO add your handling code here:
        CustomerSignupJPanel customerSignupJPanel = new CustomerSignupJPanel(travelAgency, cardSequenceJPanel);
        CardLayout layout = (CardLayout) cardSequenceJPanel.getLayout();
        cardSequenceJPanel.add("CustomerSignupJPanel", customerSignupJPanel);
        layout.next(cardSequenceJPanel);
                        
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnFlightViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFlightViewActionPerformed
        // TODO add your handling code here:
        FlightScheduleJPanel flightScheduleJPanel = new FlightScheduleJPanel(travelAgency,cardSequenceJPanel,"Customer");
        cardSequenceJPanel.add("FlightScheduleJPanel", flightScheduleJPanel);
        CardLayout cardLayout = (CardLayout) cardSequenceJPanel.getLayout();
        cardLayout.next(cardSequenceJPanel);
    }//GEN-LAST:event_btnFlightViewActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        cardSequenceJPanel.remove(this);
        CardLayout cardLayout = (CardLayout)cardSequenceJPanel.getLayout();
        cardLayout.previous(cardSequenceJPanel);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnViewTicketActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewTicketActionPerformed
        // TODO add your handling code here
        TicketIdCheckJPanel ticketIdCheckJPanel = new TicketIdCheckJPanel(travelAgency, cardSequenceJPanel);
        cardSequenceJPanel.add("TicketIdCheckJPanel", ticketIdCheckJPanel);
        CardLayout cardLayout = (CardLayout) cardSequenceJPanel.getLayout();
        cardLayout.next(cardSequenceJPanel);
    }//GEN-LAST:event_btnViewTicketActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnFlightView;
    private javax.swing.JButton btnViewTicket;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
