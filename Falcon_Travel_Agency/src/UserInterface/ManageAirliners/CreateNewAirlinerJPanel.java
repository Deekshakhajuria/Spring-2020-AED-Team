/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.ManageAirliners;

import Business.AirlinerDirectory;
import Business.Airplane;
import Business.Fleet;
import Business.FlightSchedule;
import java.awt.CardLayout;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author niramaykelkar
 */
public class CreateNewAirlinerJPanel extends javax.swing.JPanel {

    /**
     * Creates new form CreateNewAirlinerJPanel
     */
    private JPanel CardSequenceJPanel;
    private AirlinerDirectory airlineDir;
    private FlightSchedule flightSched;
    private Fleet fleetlist = new Fleet();
    public CreateNewAirlinerJPanel(JPanel CardSequenceJPanel, AirlinerDirectory airlineDir,FlightSchedule flightSched) {
        initComponents();
        this.CardSequenceJPanel = CardSequenceJPanel;
        this.airlineDir = airlineDir;
        this.flightSched = flightSched;
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtAirlineName = new javax.swing.JTextField();
        txtAirlineBase = new javax.swing.JTextField();
        btnBack = new javax.swing.JButton();
        crtAirlinerBtn = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 24)); // NOI18N
        jLabel1.setText("Create Airliner");

        jLabel2.setFont(new java.awt.Font("Lucida Grande", 1, 16)); // NOI18N
        jLabel2.setText("Airline Name:");

        jLabel3.setFont(new java.awt.Font("Lucida Grande", 1, 16)); // NOI18N
        jLabel3.setText("Airline Base:");

        btnBack.setText("< Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        crtAirlinerBtn.setText("Create");
        crtAirlinerBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                crtAirlinerBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(289, 289, 289)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(194, 194, 194)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(btnBack, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtAirlineBase, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                            .addComponent(txtAirlineName)
                            .addComponent(crtAirlinerBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(302, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtAirlineName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addComponent(txtAirlineBase, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBack)
                    .addComponent(crtAirlinerBtn))
                .addContainerGap(304, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        CardLayout layout = (CardLayout)CardSequenceJPanel.getLayout();
        CardSequenceJPanel.remove(this);
        layout.previous(CardSequenceJPanel);
    }//GEN-LAST:event_btnBackActionPerformed

    private boolean inputValid()
    {
        if (txtAirlineName.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please enter Name.");
            return false;
        }
        if (txtAirlineName.getText().length() > 25) {
            JOptionPane.showMessageDialog(null, "Limit Charatcter  Reached!!");
            return false;
        }
         if (txtAirlineBase.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please enter Name.");
            return false;
        }
        if (txtAirlineBase.getText().length() > 25) {
            JOptionPane.showMessageDialog(null, "Limit Charatcter  Reached!!");
            return false;
        }
        return true;
    }
    
    private boolean airLinerPatternCorrect() {
       Pattern p = Pattern.compile("^[a-zA-Z\\s]*$");
       Matcher m = p.matcher(txtAirlineName.getText());
       boolean b = m.matches();
       System.out.println(b);
       return b;

    }
    
    private void crtAirlinerBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crtAirlinerBtnActionPerformed
        // TODO add your handling code here:
        if (inputValid() == true) {
            if(!airLinerPatternCorrect())
            {
                JOptionPane.showMessageDialog(null, "Do Not Enter Special Characters in Airliner Name!!");
                return;
            
            }
            ArrayList<Airplane> airplaneList3 = new ArrayList<Airplane>();
            Airplane airplane5 = new Airplane("5", "XX", "BeeachCraft", 100);
            Airplane airplane6 = new Airplane("6", "A320", "Airbus", 100);
            airplaneList3.add(airplane5);
            airplaneList3.add(airplane6);
            fleetlist.setAirplaneList(airplaneList3);
            airlineDir.addAirLiner(txtAirlineName.getText(),txtAirlineBase.getText(),fleetlist);
            JOptionPane.showMessageDialog(null, "New Airliner Added!!");
            crtAirlinerBtn.setEnabled(true);
            clearFields();
        }
    }//GEN-LAST:event_crtAirlinerBtnActionPerformed

    private void clearFields() {
        txtAirlineName.setText("");
        txtAirlineBase.setText("");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton crtAirlinerBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField txtAirlineBase;
    private javax.swing.JTextField txtAirlineName;
    // End of variables declaration//GEN-END:variables
}
