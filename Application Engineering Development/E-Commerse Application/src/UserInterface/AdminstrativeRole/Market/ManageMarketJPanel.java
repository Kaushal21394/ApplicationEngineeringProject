/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.AdminstrativeRole.Market;

import business.configuration.Business;
import business.market.Market;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author chava
 */
public class ManageMarketJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManageMarketJPanel
     */
    JPanel userProcessContainer;
    Business business;
    public ManageMarketJPanel(JPanel userProcessContainer,Business business) {
        initComponents();
        this.userProcessContainer=userProcessContainer;
        this.business=business;
        populateMarketTable();
    }
    
     public void populateMarketTable(){
         DefaultTableModel dtm= (DefaultTableModel) tblMarket.getModel();
       dtm.setRowCount(0);
       for (Market market : business.getMarketDirectory().getMarketList()) {
        
           Object[] row = new Object[3];
           row[0]= market;
           row[1]=market.getMarketId();
           row[2]=market.getCustomerDirectory().size();
           dtm.addRow(row);
       }  
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
        tblMarket = new javax.swing.JTable();
        btnNew = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        lblwelcome = new javax.swing.JLabel();
        btnDelete = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblMarket.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Market Name", "MarketId", "No Of Customers"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblMarket);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 110, -1, 180));

        btnNew.setText("Create New Market  ");
        btnNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewActionPerformed(evt);
            }
        });
        add(btnNew, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 110, 180, -1));

        btnUpdate.setText("Update Market ");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });
        add(btnUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 150, 180, -1));

        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 310, -1, -1));

        lblwelcome.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        add(lblwelcome, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 20, 240, 20));

        btnDelete.setText("Delete Market");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        add(btnDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 190, 180, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel3.setText("MANAGE MARKET");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 60, 260, 30));
    }// </editor-fold>//GEN-END:initComponents

    private void btnNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewActionPerformed
        // TODO add your handling code here:
        CreateMarketJPanel panel = new CreateMarketJPanel(userProcessContainer, business);
        userProcessContainer.add("CreateMarketJPanel", panel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnNewActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:

        int selectedRow= tblMarket.getSelectedRow();
        if(selectedRow<0){
            JOptionPane.showMessageDialog(null, "Please select the row from table first to update", "Warning", JOptionPane.WARNING_MESSAGE);
        }
        else{

            Market market=(Market) tblMarket.getValueAt(selectedRow, 0);
            UpdateMarketJPanel panel = new UpdateMarketJPanel(userProcessContainer, business,market);
            userProcessContainer.add("UpdatePersonJPanel", panel);
            CardLayout layout = (CardLayout) userProcessContainer.getLayout();
            layout.next(userProcessContainer);

        }
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        int selectedRow= tblMarket.getSelectedRow();
        if(selectedRow<0){
            JOptionPane.showMessageDialog(null, "Please select the row to delete the account", "Warning", JOptionPane.WARNING_MESSAGE);
        }
        else{

           Market market=(Market) tblMarket.getValueAt(selectedRow, 0);
           // int row=(int) tblMarket.getValueAt(selectedRow, 1);
           
                business.getMarketDirectory().removeMarket(market);

                JOptionPane.showMessageDialog(null, "You have successfully deleted the account");
                populateMarketTable();
            
        }
    }//GEN-LAST:event_btnDeleteActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnNew;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblwelcome;
    private javax.swing.JTable tblMarket;
    // End of variables declaration//GEN-END:variables
}
