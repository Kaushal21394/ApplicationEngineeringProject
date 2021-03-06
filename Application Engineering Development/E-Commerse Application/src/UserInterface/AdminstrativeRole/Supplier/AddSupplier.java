/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * AddSupplier.java
 *
 * Created on Oct 1, 2011, 11:55:16 AM
 */

package UserInterface.AdminstrativeRole.Supplier;

import business.supplier.Supplier;
import business.supplier.SupplierDirectory;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author chava
 */
public class AddSupplier extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private SupplierDirectory supplierDirectory;
    
    /** Creates new form AddSupplier */
    public AddSupplier(JPanel upc, SupplierDirectory sd) {
        initComponents();
        userProcessContainer = upc;
        supplierDirectory = sd;
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        addjButton1 = new javax.swing.JButton();
        backjButton2 = new javax.swing.JButton();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Name  :");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 110, -1, -1));
        add(txtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 110, 114, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel5.setText("NEW SUPPLIER");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 60, -1, -1));

        addjButton1.setText("Add");
        addjButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addjButton1ActionPerformed(evt);
            }
        });
        add(addjButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 150, -1, -1));

        backjButton2.setText("Back");
        backjButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backjButton2ActionPerformed(evt);
            }
        });
        add(backjButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 150, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void addjButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addjButton1ActionPerformed
        // TODO add your handling code here:
        Supplier supplier = supplierDirectory.addSupplier();
        supplier.setSupplyName(txtName.getText());
        
        JOptionPane.showMessageDialog(null, "Supplier successfully added", "Warning", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_addjButton1ActionPerformed

    private void backjButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backjButton2ActionPerformed
        // TODO add your handling code here:
       backAction();
    }//GEN-LAST:event_backjButton2ActionPerformed

    
      private void backAction() {
        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        ManageSuppliers manageSuppliersJPanel = (ManageSuppliers) component;
        manageSuppliersJPanel.refreshTable();
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addjButton1;
    private javax.swing.JButton backjButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField txtName;
    // End of variables declaration//GEN-END:variables

}
