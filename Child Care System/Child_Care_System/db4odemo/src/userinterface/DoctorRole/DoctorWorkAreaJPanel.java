/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.DoctorRole;

import Business.EcoSystem;
import Business.Employee.Applicant;
import Business.Employee.Employee;
import Business.Employee.VitalSign;
import Business.Enterprise.Enterprise;
import Business.Organization.DoctorOrganization;
import Business.Organization.Organization;
import static Business.Organization.Organization.Type.HelpSeeker;
import Business.UserAccount.UserAccount;
import Business.Validation.StringValidation;
import Business.WorkQueue.DoctorTestWorkRequest;
import Business.WorkQueue.DonorTestWorkRequest;
import Business.WorkQueue.LabTestWorkRequest;
import Business.WorkQueue.ManagerWorkRequest;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import java.util.HashSet;
import javax.swing.InputVerifier;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author raunak
 */
public class DoctorWorkAreaJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private DoctorOrganization organization;
    private Enterprise enterprise;
    private UserAccount userAccount;
    private DoctorTestWorkRequest dtwr;
    private Applicant applicant;
    /**
     * Creates new form DoctorWorkAreaJPanel
     */
    public DoctorWorkAreaJPanel(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise) {
        initComponents();
        inputVerifier();
        this.userProcessContainer = userProcessContainer;
        this.organization = (DoctorOrganization)organization;
        this.enterprise = enterprise;
        this.userAccount = account;
        applicant = new Applicant(userAccount.getEmployee());
       // valueLabel.setText(enterprise.getName());
        populateApplicantComboBox();
        populateRequestTable();
        
    }
    
    public void inputVerifier()
    {
        InputVerifier strValidation = new StringValidation();
        //labTestTxtField.setInputVerifier(strValidation);
        //doctormedicationTxtarea.setInputVerifier(strValidation);
        //appliantTxtArea.setInputVerifier(strValidation);
    }
   

            
    
    
    public void populateTable()
    {
        DefaultTableModel dtm =(DefaultTableModel) vitalTable.getModel();
        dtm.setRowCount(0);
        for(WorkRequest request : userAccount.getWorkQueue().getWorkRequestList())
        {
            if (!(request instanceof LabTestWorkRequest) && !(request instanceof DonorTestWorkRequest) && !(request instanceof ManagerWorkRequest))
           {
        dtwr = (DoctorTestWorkRequest)request;
        
        
        appliantTxtArea.setText(dtwr.getMessage());
        for (VitalSign vs : dtwr.getVitalSignList())
        {
            Object row[]= new Object[2];
            row[0]=vs;
            row[1]=vs.getTimeStamp();
            dtm.addRow(row);
        }
           }
        }
        
                
        
    }
        public void populateRequestTable(){
        DefaultTableModel model = (DefaultTableModel) workRequestJTable.getModel();
        
        model.setRowCount(0);
        for (WorkRequest request : userAccount.getWorkQueue().getWorkRequestList()){
            if (!(request instanceof LabTestWorkRequest) && !(request instanceof DonorTestWorkRequest) && !(request instanceof ManagerWorkRequest))
           {
            Object[] row = new Object[4];
            row[0] = request;
            row[1] = request.getSender();
            row[2] = request.getReceiver() == null ? null : request.getReceiver().getEmployee().getName();
            row[3] = request.getStatus();
            
            //String result = ((DoctorTestWorkRequest) request).getTestResult();
            //row[3] = result == null ? "Waiting" : result;
            model.addRow(row);
           }
        }
    }
    
    public void populateApplicantComboBox()
    {
        helpSeekerComboBx.removeAllItems();
        if(userAccount.getWorkQueue().getWorkRequestList().isEmpty())
        {
          JOptionPane.showMessageDialog(null, "Patients did not choose to send data yet!","warning", JOptionPane.WARNING_MESSAGE);
         return;    
        }
      HashSet<String> hsstateVal = new HashSet<>();  
     for(WorkRequest request : userAccount.getWorkQueue().getWorkRequestList())
        {
        
         String customer = (String)request.getSender().getUsername();
        hsstateVal.add(customer);
        
        }
       for(String s1 : hsstateVal)
        {
         for(WorkRequest request : userAccount.getWorkQueue().getWorkRequestList())
        {
         String userName = (String)request.getSender().getUsername();
       if(userName.equals(s1))
       {
        //Applicant customer = (Applicant)request.getSender().getEmployee();
        helpSeekerComboBx.addItem(applicant);
       }
       }    
        
        }
      
       }
    
    
    
    
    /*public void populateVitalSignsJTable(Applicant customer)
    {   
        try
        {
       /* if(customer.getVitalSignList().isEmpty())
        {
        JOptionPane.showMessageDialog(this, "Please update vital sign information first", "warning", JOptionPane.WARNING_MESSAGE);
        return;    
        }
        DefaultTableModel defaultTableModel = (DefaultTableModel)vitalSignTable.getModel();
        defaultTableModel.setRowCount(0);
        
        
        for(VitalSign vitalSign : customer.getVitalSignList())
        {
        String patientCondition = customer.patientCondition(vitalSign);
        Object [] rowData = new Object[2];
        rowData[0] = vitalSign;
        rowData[1] = patientCondition;
       
        defaultTableModel.addRow(rowData);
        }
        }
        catch(NullPointerException npe)
        {
            JOptionPane.showMessageDialog(this, "No records for the person", "error", JOptionPane.ERROR_MESSAGE);
        }
    }*/
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        requestTestJButton = new javax.swing.JButton();
        helpSeekerComboBx = new javax.swing.JComboBox();
        getDataForPatient = new javax.swing.JButton();
        weightTextField = new javax.swing.JTextField();
        weight = new javax.swing.JLabel();
        pulseTextField = new javax.swing.JTextField();
        systollicBloodPressure = new javax.swing.JLabel();
        bloodPRessureTextField = new javax.swing.JTextField();
        heartRate = new javax.swing.JLabel();
        heartRateTextField = new javax.swing.JTextField();
        respiratoryRate = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        medications1 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        appliantTxtArea = new javax.swing.JTextArea();
        medications2 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        doctormedicationTxtarea = new javax.swing.JTextArea();
        sendBtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        vitalTable = new javax.swing.JTable();
        viewBtn = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        workRequestJTable = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        labTestTxtField = new javax.swing.JTextField();
        resultTabBtn = new javax.swing.JButton();
        backJButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        requestTestJButton.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        requestTestJButton.setText("Request Lab Test");
        requestTestJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                requestTestJButtonActionPerformed(evt);
            }
        });
        add(requestTestJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 570, 190, 40));

        helpSeekerComboBx.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        helpSeekerComboBx.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        add(helpSeekerComboBx, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, 179, -1));

        getDataForPatient.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        getDataForPatient.setText("Get Vital Signs Data");
        getDataForPatient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                getDataForPatientActionPerformed(evt);
            }
        });
        add(getDataForPatient, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 100, 190, 30));

        weightTextField.setEditable(false);
        weightTextField.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        add(weightTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 190, 90, -1));

        weight.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        weight.setText("WEIGHTS(POUNDS):");
        add(weight, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 190, -1, -1));

        pulseTextField.setEditable(false);
        pulseTextField.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        add(pulseTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 160, 90, -1));

        systollicBloodPressure.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        systollicBloodPressure.setText("PULSE:");
        add(systollicBloodPressure, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 160, -1, -1));

        bloodPRessureTextField.setEditable(false);
        bloodPRessureTextField.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        add(bloodPRessureTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 130, 90, -1));

        heartRate.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        heartRate.setText("BLOOD PRESURE:");
        add(heartRate, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 130, -1, -1));

        heartRateTextField.setEditable(false);
        heartRateTextField.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        add(heartRateTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 100, 90, -1));

        respiratoryRate.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        respiratoryRate.setText("HEART RATE:");
        add(respiratoryRate, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 100, -1, -1));

        jLabel3.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        jLabel3.setText("Vital Signs");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 60, -1, -1));

        medications1.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        medications1.setText("PROBLEMS OF APPLICANT:");
        add(medications1, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 360, -1, 38));

        appliantTxtArea.setColumns(20);
        appliantTxtArea.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        appliantTxtArea.setRows(5);
        jScrollPane3.setViewportView(appliantTxtArea);

        add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 340, 180, 90));

        medications2.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        medications2.setText("DOCTOR MEDICATIONS :");
        add(medications2, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 480, -1, 38));

        doctormedicationTxtarea.setColumns(20);
        doctormedicationTxtarea.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        doctormedicationTxtarea.setRows(5);
        jScrollPane4.setViewportView(doctormedicationTxtarea);

        add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 460, 180, 80));

        sendBtn.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        sendBtn.setText("Send Review to Applicant");
        sendBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sendBtnActionPerformed(evt);
            }
        });
        add(sendBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 570, 230, 40));

        vitalTable.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        vitalTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "BLOOD PRESSURE", "DATE"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(vitalTable);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, -1, 151));

        viewBtn.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        viewBtn.setText("View Vital Signs");
        viewBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewBtnActionPerformed(evt);
            }
        });
        add(viewBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 310, 190, 30));

        workRequestJTable.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        workRequestJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "MESSAGE", "SENDER", "RECEIVER", "STATUS"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class
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
        jScrollPane2.setViewportView(workRequestJTable);
        if (workRequestJTable.getColumnModel().getColumnCount() > 0) {
            workRequestJTable.getColumnModel().getColumn(0).setResizable(false);
            workRequestJTable.getColumnModel().getColumn(1).setResizable(false);
            workRequestJTable.getColumnModel().getColumn(2).setResizable(false);
            workRequestJTable.getColumnModel().getColumn(3).setResizable(false);
        }

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 370, 450, 130));

        jLabel1.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel1.setText("RESULT FROM LAB :");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 590, 170, 30));

        labTestTxtField.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        labTestTxtField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                labTestTxtFieldActionPerformed(evt);
            }
        });
        add(labTestTxtField, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 570, 180, 80));

        resultTabBtn.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        resultTabBtn.setText("Lab Result");
        resultTabBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resultTabBtnActionPerformed(evt);
            }
        });
        add(resultTabBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 510, 130, 30));

        backJButton.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        backJButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Double Left_100px.png"))); // NOI18N
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });
        add(backJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 60, 40));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Background.jpg"))); // NOI18N
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void requestTestJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_requestTestJButtonActionPerformed

        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        userProcessContainer.add("RequestLabTestJPanel", new RequestLabTestJPanel(userProcessContainer, userAccount, organization,enterprise));
        layout.next(userProcessContainer);
    }//GEN-LAST:event_requestTestJButtonActionPerformed

    private void getDataForPatientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_getDataForPatientActionPerformed
        if(helpSeekerComboBx.getSelectedIndex()<0)
        {
            JOptionPane.showMessageDialog(null, "Please Select a Patient to view Data!","warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        Applicant customer = (Applicant)helpSeekerComboBx.getSelectedItem();
        //populateVitalSignsJTable(customer);
        populateTable();
        /*for(WorkRequest request : userAccount.getWorkQueue().getWorkRequestList())
        {
           
                //Applicant cust = (Applicant)request.getSender().getEmployee();
                if(applicant.equals(customer))
                {
                    dtwr = (DoctorTestWorkRequest)request;
                    appliantTxtArea.setText(dtwr.getMessage());
                }
            
        }*/

        

    }//GEN-LAST:event_getDataForPatientActionPerformed

    private void sendBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sendBtnActionPerformed
        // TODO add your handling code here:
        try{
      dtwr.setTestResult(doctormedicationTxtarea.getText());
      dtwr.setReceiver(userAccount);
        dtwr.setStatus("Completed");
        JOptionPane.showMessageDialog(null, "Doctor Medication is Send to Applicant","Success", JOptionPane.PLAIN_MESSAGE);
         doctormedicationTxtarea.setText("");
        }catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, "Please right proper medication","Success", JOptionPane.PLAIN_MESSAGE);
        }
        populateRequestTable();
    }//GEN-LAST:event_sendBtnActionPerformed

    private void viewBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewBtnActionPerformed
        // TODO add your handling code here:
        
        int selectedrow = vitalTable.getSelectedRow();

        if (selectedrow>=0)
        {
            VitalSign vs=(VitalSign)vitalTable.getValueAt(selectedrow, 0);
            
            
            heartRateTextField.setText(String.valueOf(vs.getHeartRate()));
            bloodPRessureTextField.setText(String.valueOf(vs.getBloodPressure()));
            pulseTextField.setText(String.valueOf(vs.getPulse()));
            weightTextField.setText(String.valueOf(vs.getWeightInPounds()));
        }
        else
        {
            JOptionPane.showMessageDialog(null,"Please select any row");
        }
    }//GEN-LAST:event_viewBtnActionPerformed

    private void labTestTxtFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_labTestTxtFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_labTestTxtFieldActionPerformed

    private void resultTabBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resultTabBtnActionPerformed
        // TODO add your handling code here:
        
        
        for (WorkRequest request : userAccount.getWorkQueue().getWorkRequestList()){
            if (!(request instanceof DoctorTestWorkRequest) && !(request instanceof DonorTestWorkRequest) && !(request instanceof ManagerWorkRequest))
           {
               String result = ((LabTestWorkRequest) request).getTestResult();
               if(result==null)
        {
        labTestTxtField.setText("Waiting fo Lab to respond");
        }
        else
        {
            labTestTxtField.setText(result);
        }
           }
            
        }
        /*int selectedRow = workRequestJTable.getSelectedRow();
        
        if (selectedRow < 0){
            return;
        }
        
        DoctorTestWorkRequest request = (DoctorTestWorkRequest)workRequestJTable.getValueAt(selectedRow, 0);
        
        
        String result = ( request).getTestResult();
        
        if(result==null)
        {
        labTestTxtField.setText("Waiting fo Lab to respond");
        }
        else
        {
            labTestTxtField.setText(result);
        }*/
    }//GEN-LAST:event_resultTabBtnActionPerformed

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed

        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backJButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea appliantTxtArea;
    private javax.swing.JButton backJButton;
    private javax.swing.JTextField bloodPRessureTextField;
    private javax.swing.JTextArea doctormedicationTxtarea;
    private javax.swing.JButton getDataForPatient;
    private javax.swing.JLabel heartRate;
    private javax.swing.JTextField heartRateTextField;
    private javax.swing.JComboBox helpSeekerComboBx;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTextField labTestTxtField;
    private javax.swing.JLabel medications1;
    private javax.swing.JLabel medications2;
    private javax.swing.JTextField pulseTextField;
    private javax.swing.JButton requestTestJButton;
    private javax.swing.JLabel respiratoryRate;
    private javax.swing.JButton resultTabBtn;
    private javax.swing.JButton sendBtn;
    private javax.swing.JLabel systollicBloodPressure;
    private javax.swing.JButton viewBtn;
    private javax.swing.JTable vitalTable;
    private javax.swing.JLabel weight;
    private javax.swing.JTextField weightTextField;
    private javax.swing.JTable workRequestJTable;
    // End of variables declaration//GEN-END:variables
}
