/*
 * AdminWorkAreaJPanel.java
 *
 * Created on October 10, 2008, 8:50 AM
 */

package userinterface.Distributor.Provider;

import userinterface.Distributor.Supplier.*;
import Business.Clinic.Pharmacy;
import userinterface.Hospital.Clinic.*;
import Business.EcoSystem;
import userinterface.Hospital.*;
import Business.Enterprise.Enterprise;
import Business.Organization.ClinicOrganization;
import Business.Organization.Organization;

import Business.Organization.ProviderOrganization;
import Business.Organization.SupplierOrganization;
import Business.Supplier.Provider;
import Business.Supplier.Supplier;
import Business.Supplier.Vaccine;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.PharmacyWorkRequest;
import Business.WorkQueue.SupplierWorkRequest;
import Business.WorkQueue.WorkQueue;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author  kaush
 */
public class ProviderAdminWorkAreaJPanel extends javax.swing.JPanel {
    
    JPanel userProcessContainer;
    UserAccount account; 
    ProviderOrganization organization; 
    Enterprise enterprise; 
    EcoSystem business;
     //Supplier s;
     Provider provider;
    /** Creates new form AdminWorkAreaJPanel */
    public ProviderAdminWorkAreaJPanel(JPanel userProcessContainer, UserAccount account, ProviderOrganization organization, Enterprise enterprise, EcoSystem business) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.enterprise = enterprise;
        this.account=account;
        this.business=business;
        this.organization= organization;
//        for (Supplier supplier : organization.getSupplierList().getSupplierList()) {
//            if(account.getEmployee().getName().equals(supplier.getSupplierName())){
//                s=supplier;
//                System.out.println("supplier name"+s.getSupplierName());
//            }
//        }
        //s=organization.getProvider();
        provider=organization.getProvider();
        System.out.println("busi"+business.getWorkQueue().getWorkRequestList().size());
        if(provider.getWorkQueue()== null){
        WorkQueue w= new WorkQueue();
        provider.setWorkQueue(w);
        }
        populateCombo();
        populateSupCombo();
        populateWorkQueueTable();
        populateWorkQueueTable2();
        populateQuantity();
        populateAvailable();
    }
     public void populateCombo(){
        for (Vaccine vaccine : business.getVaccineList().getVaccineList()) {
            comboVaccine.addItem(vaccine);
        }
        
    }
     public void populateSupCombo(){
         for (Organization organization1 : enterprise.getOrganizationDirectory().getOrganizationList()) {
             if(organization1 instanceof SupplierOrganization){
                 SupplierOrganization s= (SupplierOrganization) organization1;
                 for (Supplier supplier : s.getSupplierList().getSupplierList()) {
                     comboSup.addItem(supplier);
                 }
                 
             }
         }
     }
     
    public void populateWorkQueueTable(){
         DefaultTableModel model = (DefaultTableModel) requestTable.getModel();
        
        model.setRowCount(0);
        
        
        
        for (WorkRequest work : business.getWorkQueue().getWorkRequestList()){
           if(work instanceof PharmacyWorkRequest){ 
            Object[] row = new Object[5];
            row[0] = work.getVaccine().getVaccineName();
            row[1] = ((PharmacyWorkRequest) work).getQuantity();
            row[2] = work;
            row[3] = work.getReceiver();
            row[4] = work.getSender();
            model.addRow(row);
           }
        }
    }
     public void populateWorkQueueTable2(){
         DefaultTableModel model = (DefaultTableModel) requestTable1.getModel();
        
        model.setRowCount(0);
        
        
        
        for (WorkRequest work : provider.getWorkQueue().getWorkRequestList()){
           if(work instanceof SupplierWorkRequest){ 
            Object[] row = new Object[6];
            row[0] = work.getVaccine().getVaccineName();
            row[1] = ((SupplierWorkRequest) work).getQuantity();
            row[2] = work;
            row[3] = work.getReceiver();
            row[4] = work.getSender();
            row[5] = ((SupplierWorkRequest) work).getSupplier();
            model.addRow(row);
           }
        }
    }
     
     public void populateAvailable(){
         DefaultTableModel model = (DefaultTableModel) availableTable.getModel();
        
        model.setRowCount(0);
        
        for (Vaccine vaccine : provider.getVaccineList().getVaccineList()){
          
            Object[] row = new Object[2];
            row[0] = vaccine.getVaccineName();
            row[1] = vaccine.getQuantity();
            model.addRow(row);
           
        }
    }
     
      public void populateQuantity(){
         
         for ( WorkRequest workRequest : provider.getWorkQueue().getWorkRequestList()) {
            // HashMap<WorkRequest,Integer> map = new HashMap<WorkRequest,Integer>();
             int temp=0;
             SupplierWorkRequest p= (SupplierWorkRequest) workRequest;
             if(workRequest.getStatus().equals("Complete") && !p.isAdd() ){ //&& add == false
                 Vaccine v = workRequest.getVaccine();
                
                 
                
                  for (Vaccine vaccine : provider.getVaccineList().getVaccineList()) {
                     if(v.getVaccineName().equals(vaccine.getVaccineName())){
                         temp=1;
                          vaccine.setQuantity(p.getQuantity()+vaccine.getQuantity());
                     }
                     
                 }
                  if(temp==0){
                       Vaccine vac= provider.getVaccineList().addVaccine();
                 vac.setDisease(v.getDisease());
                 vac.setVaccineName(v.getVaccineName());
                      vac.setQuantity(p.getQuantity());
                    //  organization.getP().getVaccine().getVaccineList().add(v);
                  }
                 p.setAdd(true);
                  
             }
           //  account.getWorkQueue().getWorkRequestList().remove(workRequest);
         }
        
     }
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        valueLabel = new javax.swing.JLabel();
        btnComplete = new javax.swing.JButton();
        reqBtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        availableTable = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        requestTable = new javax.swing.JTable();
        comboVaccine = new javax.swing.JComboBox();
        txtquant = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        backJButton = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        requestTable1 = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        reqBtn2 = new javax.swing.JButton();
        btnDelete2 = new javax.swing.JButton();
        comboSup = new javax.swing.JComboBox();

        jLabel1.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Provider Work Area -Adminstrative Role");

        btnComplete.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        btnComplete.setText("Complete");
        btnComplete.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        btnComplete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCompleteActionPerformed(evt);
            }
        });

        reqBtn.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        reqBtn.setText("Assign To Me");
        reqBtn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        reqBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reqBtnActionPerformed(evt);
            }
        });

        availableTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Vaccine Name", "Quantity"
            }
        ));
        jScrollPane1.setViewportView(availableTable);

        jLabel4.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel4.setText("Vaccines Requested from Pharma");

        jLabel5.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel5.setText("Vaccines Available");

        requestTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Vaccine Name", "Quantity", "Status", "Receiver", "Sender"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(requestTable);

        jLabel2.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        jLabel2.setText("Vaccine Name:");

        backJButton.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        backJButton.setText("Refresh");
        backJButton.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });

        btnDelete.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        btnDelete.setText("Delete request");
        btnDelete.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        requestTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Vaccine Name", "Quantity", "Status", "Receiver", "Sender", "Supplier"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(requestTable1);

        jLabel6.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel6.setText("Vaccines Requested to Supplier");

        reqBtn2.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        reqBtn2.setText("Request Vaccine");
        reqBtn2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        reqBtn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reqBtn2ActionPerformed(evt);
            }
        });

        btnDelete2.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        btnDelete2.setText("Delete request");
        btnDelete2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        btnDelete2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDelete2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(170, 170, 170)
                        .addComponent(valueLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 580, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 570, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(reqBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(41, 41, 41)
                                .addComponent(btnComplete, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(comboVaccine, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(txtquant, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(comboSup, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnDelete2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(backJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(reqBtn2, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addGap(32, 32, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(30, 30, 30)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(valueLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(reqBtn)
                    .addComponent(btnDelete)
                    .addComponent(btnComplete))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jLabel6)
                        .addGap(8, 8, 8)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(comboVaccine, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtquant, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnDelete2)
                            .addComponent(comboSup, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(reqBtn2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(backJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(125, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnCompleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCompleteActionPerformed
        // TODO add your handling code here:
   int selectedRow= requestTable.getSelectedRow();
         if(selectedRow<0){
             JOptionPane.showMessageDialog(null, "Please select the row to assign the account", "Warning", JOptionPane.WARNING_MESSAGE);
      }
        else{
             
         PharmacyWorkRequest p=(PharmacyWorkRequest) requestTable.getValueAt(selectedRow, 2);
           
        if(p.getReceiver()!= null){
         if (p.getStatus().equals("Pending")) {
         UserAccount a =p.getSender();
         if(provider.getVaccineList().getVaccineList().size()<= 0){
             JOptionPane.showMessageDialog(null, "No Stock available. Request from Supplier");
            return;
         }
        for (Vaccine v : provider.getVaccineList().getVaccineList()) {
        if(p.getVaccine().getVaccineName().equals(v.getVaccineName())){
            if(v.getQuantity()- p.getQuantity()<0){
                JOptionPane.showMessageDialog(null, "No enough Vaccines for supply. Wait for sometime");
            return;
            }
            v.setQuantity(v.getQuantity()- p.getQuantity());
        
        }
        else{
            //JOptionPane.showMessageDialog(null, "No Stock available. Request from Supplier.");
        }
    }
         p.setStatus("Complete");
          JOptionPane.showMessageDialog(null, "You have successfully completed the request");
          populateAvailable();
          populateWorkQueueTable();
     } else {
                JOptionPane.showMessageDialog(null, "You cannot complete it two times.");
            }
        }
        else{
        JOptionPane.showMessageDialog(null, "Please assign first");
        }
        
         }
    }//GEN-LAST:event_btnCompleteActionPerformed

    private void reqBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reqBtnActionPerformed
         int selectedRow= requestTable.getSelectedRow();
         if(selectedRow<0){
             JOptionPane.showMessageDialog(null, "Please select the row to assign the account", "Warning", JOptionPane.WARNING_MESSAGE);
      }
        else{
             
         PharmacyWorkRequest p=(PharmacyWorkRequest) requestTable.getValueAt(selectedRow, 2);

         p.setStatus("Pending");
         p.setReceiver(account);
         
         populateWorkQueueTable();
       
         }
//        SupplierWorkRequest request= new SupplierWorkRequest();
//        request.setVaccine((Vaccine)comboVaccine.getSelectedItem());
//        request.setQuantity(Integer.parseInt(txtquant.getText()));
//        request.setStatus("Requested");
//        request.setSender(account);
//        //organization.getWorkQueue().getWorkRequestList().add(request);
//        s.getWorkQueue().getWorkRequestList().add(request);
//        populateWorkQueueTable();

    }//GEN-LAST:event_reqBtnActionPerformed

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed

        new ProviderAdminWorkAreaJPanel(userProcessContainer, account, organization, enterprise, business);
    }//GEN-LAST:event_backJButtonActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        int selectedRow= requestTable.getSelectedRow();
         if(selectedRow<0){
             JOptionPane.showMessageDialog(null, "Please select the row to delete the account", "Warning", JOptionPane.WARNING_MESSAGE);
      }
        else{
             
         PharmacyWorkRequest p=(PharmacyWorkRequest) requestTable.getValueAt(selectedRow, 2);

         business.getWorkQueue().getWorkRequestList().remove(p);
         
       //  business.getWorkQueue().getWorkRequestList().remove(p);
         
          JOptionPane.showMessageDialog(null, "You have successfully deleted the account");
        populateWorkQueueTable();
         }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void reqBtn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reqBtn2ActionPerformed

        SupplierWorkRequest request= new SupplierWorkRequest();
        Supplier sup= (Supplier) comboSup.getSelectedItem();
        request.setVaccine((Vaccine)comboVaccine.getSelectedItem());
        request.setQuantity(Integer.parseInt(txtquant.getText()));
        request.setStatus("Requested");
        request.setSender(account);
        request.setSupplier(sup);
        sup.getWorkQueue().getWorkRequestList().add(request);
       // organization.getWorkQueue().getWorkRequestList().add(request);
        provider.getWorkQueue().getWorkRequestList().add(request);
        //account.getWorkQueue().getWorkRequestList().add(request);
       // business.getWorkQueue().getWorkRequestList().add(request);
        populateWorkQueueTable2();

    }//GEN-LAST:event_reqBtn2ActionPerformed

    private void btnDelete2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDelete2ActionPerformed
        // TODO add your handling code here:
        int selectedRow= requestTable1.getSelectedRow();
        if(selectedRow<0){
            JOptionPane.showMessageDialog(null, "Please select the row to delete the account", "Warning", JOptionPane.WARNING_MESSAGE);
        }
        else{

            WorkRequest p=(WorkRequest) requestTable1.getValueAt(selectedRow, 2);

            // s.getWorkQueue().getWorkRequestList().remove(p);
            provider.getWorkQueue().getWorkRequestList().remove(p);
            account.getWorkQueue().getWorkRequestList().remove(p);
            business.getWorkQueue().getWorkRequestList().remove(p);
            JOptionPane.showMessageDialog(null, "You have successfully deleted the account");
            populateWorkQueueTable2();
        }
    }//GEN-LAST:event_btnDelete2ActionPerformed
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable availableTable;
    private javax.swing.JButton backJButton;
    private javax.swing.JButton btnComplete;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnDelete2;
    private javax.swing.JComboBox comboSup;
    private javax.swing.JComboBox comboVaccine;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JButton reqBtn;
    private javax.swing.JButton reqBtn2;
    private javax.swing.JTable requestTable;
    private javax.swing.JTable requestTable1;
    private javax.swing.JTextField txtquant;
    private javax.swing.JLabel valueLabel;
    // End of variables declaration//GEN-END:variables
    
}
