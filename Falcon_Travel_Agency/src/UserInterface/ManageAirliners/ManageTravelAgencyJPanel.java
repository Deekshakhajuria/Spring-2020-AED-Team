/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.ManageAirliners;

import Business.AirlinerDirectory;
import Business.FlightSchedule;
import java.awt.CardLayout;
import java.util.ArrayList;
import javax.swing.JComboBox;
import javax.swing.JPanel;

/**
 *
 * @author deekshakhajuria
 */
public class ManageTravelAgencyJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManageTravelAgencyJPanel
     */
    private JPanel CardSequenceJPanel;
    private FlightSchedule flightSched;
    private AirlinerDirectory airlineDir;
//    public ManageTravelAgencyJPanel(JPanel CardSequenceJPanel, FlightSchedule flightSched) {
//        initComponents();
//        
//        this.CardSequenceJPanel = CardSequenceJPanel;
//        this.flightSched = flightSched;
//
//        //populateButtons();
//    }
    
////     private ArrayList<Flight> searching(JComboBox combobox, ArrayList<Flight> flightschedule)  {
////
////        ArrayList<Flight> flights = new ArrayList<>();
////
////        String comboitem = combobox.getSelectedItem().toString();
////
////        //if(combobox == flightNumberComboBox){
////        for (Flight f : flightschedule) {
////            if (f.getFlightNumber().equals(comboitem)) {
////                flights.add(f);
////            }
////
////        }
////        //}
////
////        // if(combobox == arrivalLocatioComboBox){
////        for (Flight f : flightschedule) {
////            if (f.getArrivalAirport().equals(comboitem)) {
////                flights.add(f);
////            }
////
////        }
////
////        //}
////        //if(combobox == departureLocationComboBox){
////        for (Flight f : flightschedule) {
////            if (f.getDepartAirport().equals(comboitem)) {
////                flights.add(f);
////            }
////
////        }
////
////        //}
////        ///Morning, Night, Afternoon
////        //if(combobox == PrefferedTimeComboBox){
////        if (comboitem.equals("Morning")) {
////            for (Flight f : flightschedule) {
////                int c = f.getDepartTime();
////                if (c < 12) {
////                    flights.add(f);
////                }
////            }
////        }
////        if (comboitem.equals("Night")) {
////            for (Flight f : flightschedule) {
////                int a = f.getDepartTime();
////                if (17 < a && a <= 24) {
////                    flights.add(f);
////                }
////            }
////        }
////        if (comboitem.equals("Afternoon")) {
////            for (Flight f : flightschedule) {
////                int b = f.getDepartTime();
////                if (12 <= b && b <= 17) {
////                    flights.add(f);
////                }
////            }
////
////        }
////        
////        
////        
////        
////        
////
////        return flights;
////     }
////        
////        void populateButtons() {
////
////        for (Flight flight : fsched.getFlightSchedDir()) {
////
////            String flightno = flight.getFlightNumber();
////            String ArrivalAirport = flight.getArrivalAirport();
////            String departureAirport = flight.getDepartAirport();
////            //String arrivalTime =flight.getArrivalTime();
////            //String departureTime =flight.getDepartTime();
////            flightNumberComboBox.addItem(flightno);
////            arrivalLocatioComboBox.addItem(ArrivalAirport);
////            departureLocationComboBox.addItem(departureAirport);
////        }
////
////    }
////
////    /**
////     * This method is called from within the constructor to initialize the form.
////     * WARNING: Do NOT modify this code. The content of this method is always
////     * regenerated by the Form Editor.
////     */

    public ManageTravelAgencyJPanel(JPanel CardSequenceJPanel, AirlinerDirectory airlineDir, FlightSchedule flightSched) {
        initComponents();
        this.CardSequenceJPanel = CardSequenceJPanel;
        this.airlineDir = airlineDir;
        this.flightSched = flightSched;
    }
////    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        AirlineComboBox = new javax.swing.JComboBox<>();
        DepartureComboBox = new javax.swing.JComboBox<>();
        PreferredTimeComboBox = new javax.swing.JComboBox<>();
        SearchButton = new javax.swing.JButton();
        ArrivalComboBox = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("   Search Flights");

        AirlineComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "None" }));
        AirlineComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AirlineComboBoxActionPerformed(evt);
            }
        });

        DepartureComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "None" }));
        DepartureComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DepartureComboBoxActionPerformed(evt);
            }
        });

        PreferredTimeComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Morning", "Night", "Afternoon", "None" }));
        PreferredTimeComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PreferredTimeComboBoxActionPerformed(evt);
            }
        });

        SearchButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        SearchButton.setText("Search-->");
        SearchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchButtonActionPerformed(evt);
            }
        });

        ArrivalComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "None" }));
        ArrivalComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ArrivalComboBoxActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Lucida Grande", 1, 16)); // NOI18N
        jLabel2.setText("Airline:");

        jLabel3.setFont(new java.awt.Font("Lucida Grande", 1, 16)); // NOI18N
        jLabel3.setText("Departure Location:");

        jLabel4.setFont(new java.awt.Font("Lucida Grande", 1, 16)); // NOI18N
        jLabel4.setText("Arrival Location:");

        jLabel5.setFont(new java.awt.Font("Lucida Grande", 1, 16)); // NOI18N
        jLabel5.setText("Preferred time of day:");

        jLabel6.setFont(new java.awt.Font("Lucida Grande", 1, 16)); // NOI18N
        jLabel6.setText("Date:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(75, 75, 75)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6))
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(ArrivalComboBox, 0, 151, Short.MAX_VALUE)
                            .addComponent(DepartureComboBox, 0, 151, Short.MAX_VALUE)
                            .addComponent(PreferredTimeComboBox, 0, 151, Short.MAX_VALUE)
                            .addComponent(AirlineComboBox, 0, 151, Short.MAX_VALUE)
                            .addComponent(jDateChooser1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(287, 287, 287)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(235, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(307, 307, 307)
                    .addComponent(SearchButton, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(305, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(AirlineComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(DepartureComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(ArrivalComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(PreferredTimeComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(206, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(345, 345, 345)
                    .addComponent(SearchButton)
                    .addContainerGap(132, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void AirlineComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AirlineComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AirlineComboBoxActionPerformed

    private void SearchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchButtonActionPerformed

        // searching()
    

       

    }//GEN-LAST:event_SearchButtonActionPerformed

    private void ArrivalComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ArrivalComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ArrivalComboBoxActionPerformed

    private void PreferredTimeComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PreferredTimeComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PreferredTimeComboBoxActionPerformed

    private void DepartureComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DepartureComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DepartureComboBoxActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> AirlineComboBox;
    private javax.swing.JComboBox<String> ArrivalComboBox;
    private javax.swing.JComboBox<String> DepartureComboBox;
    private javax.swing.JComboBox<String> PreferredTimeComboBox;
    private javax.swing.JButton SearchButton;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    // End of variables declaration//GEN-END:variables
}
