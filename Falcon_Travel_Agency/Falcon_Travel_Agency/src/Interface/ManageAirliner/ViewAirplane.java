/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface.ManageAirliner;

import Business.Airplane;
import Business.Flight;
import java.awt.CardLayout;
import java.awt.Component;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author moury
 */
public class ViewAirplane extends javax.swing.JPanel {

    /**
     * Creates new form ViewAirplane
     */
    private Airplane airplane;
    private JPanel displayPanel;
    private String mode;
    private Flight updateInfo;
    
    public ViewAirplane(Airplane airplane, JPanel displayPanel) {
        initComponents();
        this.airplane = airplane;
        this.displayPanel = displayPanel;
        populateTable();
        enableFields(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        backBtn = new javax.swing.JButton();
        searchFlightTxtField = new javax.swing.JTextField();
        searchBtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        flightTbl = new javax.swing.JTable();
        cancelFlightBtn = new javax.swing.JButton();
        newFlightBtn = new javax.swing.JButton();
        confirmBtn = new javax.swing.JButton();
        flightNoTxtField = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        departingFromTxtField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        arrivingToTxtField = new javax.swing.JTextField();
        flightDateTxtField = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        updateBtn = new javax.swing.JButton();
        flightTimeComboBox = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        flightDurationField = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        priceTxtField = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();

        backBtn.setText("Back");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });

        searchBtn.setText("Search by Number");
        searchBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchBtnActionPerformed(evt);
            }
        });

        flightTbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Flight No", "Departure", "Arrival", "Date", "Time", "Duration (hours)", "Flight Status", "Price (USD)"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(flightTbl);
        if (flightTbl.getColumnModel().getColumnCount() > 0) {
            flightTbl.getColumnModel().getColumn(0).setResizable(false);
            flightTbl.getColumnModel().getColumn(1).setResizable(false);
            flightTbl.getColumnModel().getColumn(2).setResizable(false);
            flightTbl.getColumnModel().getColumn(3).setResizable(false);
            flightTbl.getColumnModel().getColumn(4).setResizable(false);
            flightTbl.getColumnModel().getColumn(5).setResizable(false);
            flightTbl.getColumnModel().getColumn(6).setResizable(false);
            flightTbl.getColumnModel().getColumn(7).setResizable(false);
        }

        cancelFlightBtn.setText("Cancel Flight");
        cancelFlightBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelFlightBtnActionPerformed(evt);
            }
        });

        newFlightBtn.setText("New Flight");
        newFlightBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newFlightBtnActionPerformed(evt);
            }
        });

        confirmBtn.setText("Confirm");
        confirmBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmBtnActionPerformed(evt);
            }
        });

        jLabel1.setText("Flight Number:");

        jLabel2.setText("Departing From:");

        jLabel3.setText("Arriving To:");

        jLabel7.setText("Date:");

        jLabel8.setText("Flight Time:");

        jLabel9.setText("(Format: mm/dd/yyyy)");

        updateBtn.setText("Update Flight");
        updateBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateBtnActionPerformed(evt);
            }
        });

        flightTimeComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Morning", "Day Time", "Evening" }));

        jLabel10.setText("Flight Duration:");

        jLabel11.setText("hours");

        jLabel6.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("FLEET SCHEDULE");
        jLabel6.setToolTipText("");

        jLabel4.setText("Price:");

        jLabel12.setText("(USD)");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(150, 150, 150)
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 365, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(42, 42, 42)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel1)
                                            .addComponent(jLabel2)
                                            .addComponent(jLabel3)))
                                    .addComponent(searchBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(searchFlightTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                .addComponent(arrivingToTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jLabel7))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(departingFromTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(36, 36, 36)
                                                .addComponent(jLabel8))
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                .addComponent(flightNoTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jLabel10)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(flightTimeComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(flightDateTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel9))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(flightDurationField, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel11)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jLabel4)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(priceTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel12))))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 708, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(cancelFlightBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(updateBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(newFlightBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(373, 373, 373)
                        .addComponent(confirmBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(newFlightBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(updateBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cancelFlightBtn)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(searchBtn)
                    .addComponent(searchFlightTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(flightNoTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(flightDurationField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11)
                    .addComponent(jLabel4)
                    .addComponent(priceTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(departingFromTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8)
                            .addComponent(flightTimeComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(arrivingToTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel3))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel7)
                                .addComponent(flightDateTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel9))))
                    .addComponent(jLabel2))
                .addGap(44, 44, 44)
                .addComponent(confirmBtn)
                .addContainerGap(99, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    public void enableFields(boolean bool) {
        flightNoTxtField.setEnabled(bool);
        departingFromTxtField.setEnabled(bool);
        arrivingToTxtField.setEnabled(bool);
        flightDateTxtField.setEnabled(bool);
        flightTimeComboBox.setEnabled(bool);
        flightDurationField.setEnabled(bool);
        priceTxtField.setEnabled(bool);
        confirmBtn.setEnabled(bool);
    }
    
    public void populateTable() {
        DefaultTableModel dtm = (DefaultTableModel) flightTbl.getModel();
        dtm.setRowCount(0);
        if (airplane.getFlightDirectory() != null) {
            for (Flight e : airplane.getFlightDirectory()) {
                System.out.println(e.isIsAvailable());
                Object row[] = new Object[8];
                row[0] = e;
                row[1] = e.getDepartureLocation();
                row[2] = e.getArrivalLocation();
                row[3] = e.getDate();
                row[4] = e.getFlightTime();
                row[5] = e.getFlightDuration();
                row[6] = e.isIsAvailable() ? "On Time" : "Cancelled";
                row[7] = e.getPrice();
                dtm.addRow(row);
            }
        }
        
    }

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        // TODO add your handling code here:
        displayPanel.remove(this);
        CardLayout layout = (CardLayout) displayPanel.getLayout();
        Component[] comps = displayPanel.getComponents();
        for (Component comp : comps) {
            if (comp instanceof ViewAirliner) {
                ViewAirliner al = (ViewAirliner) comp;
                al.populateTable();
            }
        }
        layout.previous(displayPanel);
    }//GEN-LAST:event_backBtnActionPerformed

    private void searchBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchBtnActionPerformed
        // TODO add your handling code here:
        enableFields(false);
        clearFields();
        String searchTerm = searchFlightTxtField.getText();
        if (searchTerm == null || searchTerm.equals("")) {
            JOptionPane.showMessageDialog(null, "Please enter a flight number to search");
            populateTable();
        } else {
            Flight found = airplane.searchFlight(searchTerm);
            if (found == null) {
                JOptionPane.showMessageDialog(null, "No flight found with provided flight number");
            } else {
                DefaultTableModel dtm = (DefaultTableModel) flightTbl.getModel();
                dtm.setRowCount(0);
                
                Object row[] = new Object[8];
                row[0] = found;
                row[1] = found.getDepartureLocation();
                row[2] = found.getArrivalLocation();
                row[3] = found.getDate();
                row[4] = found.getFlightTime();
                row[5] = found.getFlightDuration();
                row[6] = found.isIsAvailable() ? "On Time" : "Cancelled";
                row[7] = found.getPrice();
                dtm.addRow(row);
            }
        }
    }//GEN-LAST:event_searchBtnActionPerformed

    private void cancelFlightBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelFlightBtnActionPerformed
        // TODO add your handling code here:
        enableFields(false);
        clearFields();
        int selectedRow = flightTbl.getSelectedRow();
        if (selectedRow >= 0) {
            Flight f = (Flight) flightTbl.getValueAt(selectedRow, 0);
            if (!f.isIsAvailable()) {
                JOptionPane.showMessageDialog(null, "Flight is already cancelled");
                return;
            }
            f.setIsAvailable(false);
            populateTable();
            JOptionPane.showMessageDialog(null, "The flight has been cancelled");
        } else {
            JOptionPane.showMessageDialog(null, "Please select a flight to cancel");
        }
    }//GEN-LAST:event_cancelFlightBtnActionPerformed

    private void newFlightBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newFlightBtnActionPerformed
        // TODO add your handling code here:
        enableFields(true);
        clearFields();
        mode = "new";
    }//GEN-LAST:event_newFlightBtnActionPerformed
    
    private boolean isValidString(String pattern, String str) {
        Pattern p = Pattern.compile(pattern);
        Matcher m = p.matcher(str);
        return m.matches();
    }

    private void confirmBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmBtnActionPerformed
        // TODO add your handling code here:
        String flightNo = flightNoTxtField.getText();
        if (flightNo == null || flightNo.equals("") || !isValidString("^[a-zA-Z0-9]+$", flightNo)) {
            JOptionPane.showMessageDialog(null, "Please enter valid flight number");
            return;
        }
        
        String departingFrom = departingFromTxtField.getText();
        if (departingFrom == null || departingFrom.equals("") || !isValidString("^[a-zA-Z ]+$", departingFrom)) {
            JOptionPane.showMessageDialog(null, "Please enter valid departing location");
            return;
        }
        
        String arrivingTo = arrivingToTxtField.getText();
        if (arrivingTo == null || arrivingTo.equals("") || !isValidString("^[a-zA-Z ]+$", arrivingTo)) {
            JOptionPane.showMessageDialog(null, "Please enter valid arriving location");
            return;
        }
        
        String flightDate = flightDateTxtField.getText();
        if (flightDate == null || flightDate.equals("") || !isValidString("^(((11|12)[/](0[1-9]|1[0-9]|2[0-9]|3[0-1])[/]20(19|20))|((0[1-9]|1[0-2])[/](0[1-9]|1[0-9]|2[0-9]|3[0-1])[/]2020))", flightDate)) {
            JOptionPane.showMessageDialog(null, "Please enter valid date in format dd/mm/yyyy");
            return;
        }
        
        try {
            Double.parseDouble(flightDurationField.getText());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Please enter valid flight duration");
            return;
        }
        try {
            Double.parseDouble(priceTxtField.getText());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Please enter valid price");
            return;
        }
        
        String flightTime = flightTimeComboBox.getSelectedItem() + "";
        
        if (mode == "new") {
            if (airplane.getFlightDirectory() != null) {
                for (Flight e : airplane.getFlightDirectory()) {
                    if (e.getFlightNumber().equalsIgnoreCase(flightNoTxtField.getText())) {
                        JOptionPane.showMessageDialog(null, "Flight with given flight number already exists");
                        return;
                    }
                }
            }
            Flight flight = new Flight(flightNo, departingFrom, arrivingTo, Double.parseDouble(flightDurationField.getText()), flightDate, flightTime, true, Double.parseDouble(priceTxtField.getText()));
//            Flight flight = airplane.addFlight(airplane);
//            flight.setFlightNumber(flightNo);
//            flight.setDepartureLocation(departingFrom);
//            flight.setArrivalLocation(arrivingTo);
//            flight.setDate(flightDate);
//            flight.setFlightTime(flightTime);
//            flight.setFlightDuration(Double.parseDouble(flightDurationField.getText()));
//            flight.setIsAvailable(true);
            airplane.getFlightDirectory().add(flight);
            
            JOptionPane.showMessageDialog(null, "Flight added to the airplane");
            
        } else {
            updateInfo.setFlightNumber(flightNo);
            updateInfo.setDepartureLocation(departingFrom);
            updateInfo.setArrivalLocation(arrivingTo);
            updateInfo.setDate(flightDate);
            updateInfo.setFlightTime(flightTime);
            updateInfo.setFlightDuration(Double.parseDouble(flightDurationField.getText()));
            updateInfo.setPrice(Double.parseDouble(priceTxtField.getText()));
            JOptionPane.showMessageDialog(null, "Flight information updated in directory");
            
        }
        populateTable();
        enableFields(false);
        clearFields();
    }//GEN-LAST:event_confirmBtnActionPerformed
    
    private void clearFields() {
        flightNoTxtField.setText("");
        departingFromTxtField.setText("");
        arrivingToTxtField.setText("");
        flightDateTxtField.setText("");
        flightDurationField.setText("");
        flightTimeComboBox.setSelectedIndex(0);
        priceTxtField.setText("");
    }

    private void updateBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateBtnActionPerformed
        // TODO add your handling code here:
        int selectedRow = flightTbl.getSelectedRow();
        if (selectedRow >= 0) {
            enableFields(true);
            mode = "update";
            Flight flight = (Flight) flightTbl.getValueAt(selectedRow, 0);
            updateInfo = flight;
            flightNoTxtField.setText(flight.getFlightNumber() + "");
            departingFromTxtField.setText(flight.getDepartureLocation() + "");
            arrivingToTxtField.setText(flight.getArrivalLocation() + "");
            flightDurationField.setText(flight.getFlightDuration() + "");
            flightDateTxtField.setText(flight.getDate() + "");
            priceTxtField.setText(flight.getPrice() + "");
            String time = flight.getFlightTime();
            if (time.equalsIgnoreCase("morning")) {
                flightTimeComboBox.setSelectedIndex(0);
                
            } else if (time.equalsIgnoreCase("evening")) {
                flightTimeComboBox.setSelectedIndex(2);
                
            } else {
                flightTimeComboBox.setSelectedIndex(1);
                
            }
        } else {
            JOptionPane.showMessageDialog(null, "Please select a flight to update");
            enableFields(false);
            clearFields();
        }
    }//GEN-LAST:event_updateBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField arrivingToTxtField;
    private javax.swing.JButton backBtn;
    private javax.swing.JButton cancelFlightBtn;
    private javax.swing.JButton confirmBtn;
    private javax.swing.JTextField departingFromTxtField;
    private javax.swing.JTextField flightDateTxtField;
    private javax.swing.JTextField flightDurationField;
    private javax.swing.JTextField flightNoTxtField;
    private javax.swing.JTable flightTbl;
    private javax.swing.JComboBox<String> flightTimeComboBox;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton newFlightBtn;
    private javax.swing.JTextField priceTxtField;
    private javax.swing.JButton searchBtn;
    private javax.swing.JTextField searchFlightTxtField;
    private javax.swing.JButton updateBtn;
    // End of variables declaration//GEN-END:variables
}
