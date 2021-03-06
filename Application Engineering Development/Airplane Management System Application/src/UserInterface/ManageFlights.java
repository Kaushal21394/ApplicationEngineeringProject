/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface;

import Business.Airplane;
import Business.AirplaneCatalog;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author kaush
 */
public class ManageFlights extends javax.swing.JPanel {
    private JPanel userControlDisplayPanel;
    private AirplaneCatalog airplaneC;
    
    /**
     * Creates new form ManageFlights
     */
    public ManageFlights() {
       
    }

    ManageFlights(JPanel userControlDisplayPanel, AirplaneCatalog airplaneC) {
        initComponents();
        this.userControlDisplayPanel=userControlDisplayPanel;
        this.airplaneC=airplaneC;
       
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
        tblListAll = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        btnCreateFlights = new javax.swing.JButton();
        btnViewFlights = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        cb = new javax.swing.JComboBox<>();
        btnSubmit = new javax.swing.JButton();

        tblListAll.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Airliner ", "Airline ID", "Flight Number", "Model Number", "Source", "Destination"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblListAll);

        jLabel1.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("MANAGE FLIGHTS");

        btnCreateFlights.setText("Create Flights");
        btnCreateFlights.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateFlightsActionPerformed(evt);
            }
        });

        btnViewFlights.setText("View Flights");
        btnViewFlights.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewFlightsActionPerformed(evt);
            }
        });

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel2.setText("Airliner Name:");

        cb.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        cb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "None", "Emirates", "Qatar", "Etihad", "British Airways", "Lufthansa" }));
        cb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbActionPerformed(evt);
            }
        });

        btnSubmit.setText("Submit");
        btnSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 680, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnCreateFlights, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnViewFlights, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(167, 167, 167))))
            .addGroup(layout.createSequentialGroup()
                .addGap(188, 188, 188)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(cb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnSubmit)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(btnSubmit))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCreateFlights, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnViewFlights, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(117, 117, 117))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitActionPerformed
    String dataEntry= cb.getSelectedItem().toString();
        if(dataEntry.equalsIgnoreCase("None")){
        DefaultTableModel dtm=(DefaultTableModel)tblListAll.getModel();
        dtm.setNumRows(0);
        
        }
         
         if(dataEntry.equalsIgnoreCase("Emirates"))
        {
         String abc=String.valueOf(cb.getSelectedItem());
         String bc;
         DefaultTableModel dtm=(DefaultTableModel)tblListAll.getModel();
         dtm.setNumRows(0);
         
         for(Airplane vs:airplaneC.getAirlineCatalog())
      
         {
           bc=vs.getAirlinerName();
           if(bc.equals(abc)){  
           Object row[]=new Object[10];
           row[0]=vs;
           row[1]=vs.getAirlineID();
           row[2]=vs.getFlightNumber();
           row[3]=vs.getModelNumber();
           row[4]=vs.getFromLocation();
           row[5]=vs.getToLocation();
  //       row[7]=vs.getExpMaintanance();
  //       row[8]=vs.getSeatN();
    
           dtm.addRow(row);
    
          }   
         }
        }
         if(dataEntry.equalsIgnoreCase("Qatar"))
        {
         String abc=String.valueOf(cb.getSelectedItem());
         String bc;
         DefaultTableModel dtm=(DefaultTableModel)tblListAll.getModel();
         dtm.setNumRows(0);
    
         for(Airplane vs:airplaneC.getAirlineCatalog())
      
         {
          bc=vs.getAirlinerName();
           if(bc.equals(abc)){
           Object row[]=new Object[10];
           row[0]=vs;
           row[1]=vs.getAirlineID();
           row[2]=vs.getFlightNumber();
           row[3]=vs.getModelNumber();
 
           row[4]=vs.getFromLocation();
           row[5]=vs.getToLocation();
  //       row[7]=vs.getExpMaintanance();
  //       row[8]=vs.getSeatN();
    
           dtm.addRow(row);
    
          }   }
        }
         
         
         if(dataEntry.equalsIgnoreCase("Etihad"))
        {String abc=String.valueOf(cb.getSelectedItem());
         String bc;
         DefaultTableModel dtm=(DefaultTableModel)tblListAll.getModel();
         dtm.setNumRows(0);
    
         for(Airplane vs:airplaneC.getAirlineCatalog())
      
         {
           bc=vs.getAirlinerName();
           if(bc.equals(abc)){
           Object row[]=new Object[10];
           row[0]=vs;
           row[1]=vs.getAirlineID();
           row[2]=vs.getFlightNumber();
           row[3]=vs.getModelNumber();
           //row[4]=vs.getManufactureName();
           row[4]=vs.getFromLocation();
           row[5]=vs.getToLocation();
  //       row[7]=vs.getExpMaintanance();
  //       row[8]=vs.getSeatN();
    
           dtm.addRow(row);
    
          } }  
        }
         if(dataEntry.equalsIgnoreCase("British Airways"))
        {String abc=String.valueOf(cb.getSelectedItem());
         String bc;
         DefaultTableModel dtm=(DefaultTableModel)tblListAll.getModel();
         dtm.setNumRows(0);
    
         for(Airplane vs:airplaneC.getAirlineCatalog())
      
         {
           bc=vs.getAirlinerName();
           if(bc.equals(abc)){
           Object row[]=new Object[10];
           row[0]=vs;
           row[1]=vs.getAirlineID();
           row[2]=vs.getFlightNumber();
           row[3]=vs.getModelNumber();
           //row[4]=vs.getManufactureName();
           row[4]=vs.getFromLocation();
           row[5]=vs.getToLocation();
  //       row[7]=vs.getExpMaintanance();
  //       row[8]=vs.getSeatN();
    
           dtm.addRow(row);
    
          }   }
        }
         if(dataEntry.equalsIgnoreCase("Lufthansa"))
        {
         String abc=String.valueOf(cb.getSelectedItem());
         String bc;
         DefaultTableModel dtm=(DefaultTableModel)tblListAll.getModel();
         dtm.setNumRows(0);
    
         for(Airplane vs:airplaneC.getAirlineCatalog())
      
         {
           bc=vs.getAirlinerName();
           if(bc.equals(abc)){
           Object row[]=new Object[10];
           row[0]=vs;
           row[1]=vs.getAirlineID();
           row[2]=vs.getFlightNumber();
           row[3]=vs.getModelNumber();
           //row[4]=vs.getManufactureName();
           row[4]=vs.getFromLocation();
           row[5]=vs.getToLocation();
  //       row[7]=vs.getExpMaintanance();
  //       row[8]=vs.getSeatN();
    
           dtm.addRow(row);
    
          }   }
        }
    }//GEN-LAST:event_btnSubmitActionPerformed

    private void btnCreateFlightsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateFlightsActionPerformed
     CreateFlights panel=new CreateFlights(userControlDisplayPanel,airplaneC);
     userControlDisplayPanel.add("CreateFlights",panel);
     CardLayout layout=(CardLayout)userControlDisplayPanel.getLayout();
     layout.next(userControlDisplayPanel);
    }//GEN-LAST:event_btnCreateFlightsActionPerformed

    private void btnViewFlightsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewFlightsActionPerformed
      int selectedRow=tblListAll.getSelectedRow();
      if(selectedRow<0){
            JOptionPane.showMessageDialog(null,"Please select a row from the data first.","Warning!", JOptionPane.WARNING_MESSAGE);
        }
      else{
       Airplane airliner=(Airplane)tblListAll.getValueAt(selectedRow, 0);
       ViewFlights panel=new ViewFlights(userControlDisplayPanel,airliner);
       userControlDisplayPanel.add("ViewAirline",panel);
       CardLayout layout=(CardLayout)userControlDisplayPanel.getLayout();
       layout.next(userControlDisplayPanel);
    }
    }//GEN-LAST:event_btnViewFlightsActionPerformed

    private void cbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCreateFlights;
    private javax.swing.JButton btnSubmit;
    private javax.swing.JButton btnViewFlights;
    private javax.swing.JComboBox<String> cb;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblListAll;
    // End of variables declaration//GEN-END:variables
}

