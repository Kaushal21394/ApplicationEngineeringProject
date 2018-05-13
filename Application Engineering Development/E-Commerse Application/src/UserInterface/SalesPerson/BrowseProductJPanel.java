/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.SalesPerson;

import business.configuration.Business;
import business.market.Customer;
import business.market.MarketOffer;
import business.market.MarketOfferCatalog;
import business.sales.Order;
import business.sales.OrderItem;
import business.sales.Person;
import business.supplier.Product;
import business.supplier.Supplier;
import business.supplier.SupplierDirectory;
import java.awt.CardLayout;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author chava
 */
public class BrowseProductJPanel extends javax.swing.JPanel {

    /**
     * Creates new form BrowseProductJPanel1
     */
    private JPanel userProcessContainer;
    private Business business;
    private SupplierDirectory supplierDirectory;
    // private ProductCatalog productList;
    private MarketOfferCatalog marketOfferCatalog;
    private Customer customer;
    private Person person;
    private Order order;
    private double commission = 0;

    public BrowseProductJPanel(JPanel userProcessContainer, Business business, Customer customer, Person person) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.business = business;
        this.marketOfferCatalog = business.getMarketOfferCatalog();
        this.supplierDirectory = business.getSupplierDirectory();
        this.customer = customer;
        this.person = person;
        lblUser.setText(person.getName());

        comboBoxSupplier.removeAllItems();
        for (Supplier supplier : supplierDirectory.getSupplierDict()) {
            comboBoxSupplier.addItem(supplier);
        }
        order = new Order();
    }

    public void populateTable() {
        Supplier supp = (Supplier) comboBoxSupplier.getSelectedItem();
        String supplierId = supp.getSupplierId();
        DefaultTableModel dtm = (DefaultTableModel) tblProduct.getModel();
        dtm.setRowCount(0);
        String marketName = "";
        for (Supplier supplier : supplierDirectory.getSupplierDict()) {
            if (supplier.getSupplierId().equalsIgnoreCase(supplierId)) {
                for (Product p : supplier.getProductCatalog().getProductCatalog()) {

                    for (MarketOffer marketOffer : marketOfferCatalog.getMarketOfferList()) {
                        marketName = marketOffer.getMarket().getMarketName();
                        // for(Customer customer : marketOffer.getMarket().getCustomerDirectory()){

                        if (marketOffer.getProduct().getProductId().equalsIgnoreCase(p.getProductId()) && marketName.equalsIgnoreCase(customer.getMarketName())) {

                            Object row[] = new Object[7];
                            row[0] = p;
                            row[1] = p.getProductId();
                            row[2] = (p.getPrice() * marketOffer.getFloorRatio());
                            row[3] = (p.getPrice() * marketOffer.getTargetRatio());
                            row[4] = (p.getPrice() * marketOffer.getCeilingRatio());
                            row[5] = p.getAvailQuantity();
                            row[6] = marketOffer;
                            dtm.addRow(row);

                        }
                        //}
                    }
                }
            }
        }
    }

    public void refreshTable() {

        String productId = txtFieldSearchProduct.getText();
        if (productId.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please enter product Id to search for product");
        } else {
            DefaultTableModel dtm = (DefaultTableModel) tblProduct.getModel();
            dtm.setRowCount(0);
            String marketName = "";

            for (Supplier supplier : supplierDirectory.getSupplierDict()) {
                for (Product product : supplier.getProductCatalog().getProductCatalog()) {

                    if (product.getProductId().equalsIgnoreCase(productId)) {
                        for (MarketOffer marketOffer : marketOfferCatalog.getMarketOfferList()) {
                            marketName = marketOffer.getMarket().getMarketName();
                            // for(Customer customer : marketOffer.getMarket().getCustomerDirectory()){

                            if (marketOffer.getProduct().getProductId().equalsIgnoreCase(product.getProductId()) && marketName.equalsIgnoreCase(customer.getMarketName())) {

                                Object row[] = new Object[7];
                                row[0] = product;
                                row[1] = product.getProductId();
                                row[2] = (product.getPrice() * marketOffer.getFloorRatio());
                                row[3] = (product.getPrice() * marketOffer.getTargetRatio());
                                row[4] = (product.getPrice() * marketOffer.getCeilingRatio());
                                row[5] = product.getAvailQuantity();
                                row[6] = marketOffer;
                                dtm.addRow(row);

                            }
                        }
                    }
                }
            }
        }
    }

    public void refreshOrderTable() {

        DefaultTableModel dtm = (DefaultTableModel) tblOrder.getModel();
        dtm.setRowCount(0);
        for (OrderItem oi : order.getOrderItemList()) {

            Object row[] = new Object[4];
            row[0] = oi;
            row[1] = oi.getPaidPrice();
            row[2] = oi.getQuantity();
            row[3] = oi.getQuantity() * oi.getPaidPrice();
            dtm.addRow(row);

        }
        lblTotalPrice.setText("TOTAL PRICE: " + ((order.orderTotal())));
        commission = ((order.orderTotal() - order.orderTargetTotal()) * 0.01);
        lblCommission.setText("SALES COMMISSION:" + commission);
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
        tblProduct = new javax.swing.JTable();
        comboBoxSupplier = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        btnViewProduct = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        btnAddtoCart = new javax.swing.JButton();
        quantitySpinner = new javax.swing.JSpinner();
        jLabel5 = new javax.swing.JLabel();
        btnSearchProduct = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        txtFieldSalesPrice = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblOrder = new javax.swing.JTable();
        btnViewOrderItem = new javax.swing.JButton();
        btnModifyQuantity = new javax.swing.JButton();
        btnRemoveOrderItem = new javax.swing.JButton();
        btnCheckOut = new javax.swing.JButton();
        txtFieldSearchProduct = new javax.swing.JTextField();
        txtNewQuantity = new javax.swing.JTextField();
        lblUser = new javax.swing.JLabel();
        lblTotalPrice = new javax.swing.JLabel();
        lblCommission = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblProduct.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        tblProduct.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Product Id", "Floor price", "Target Price", "Ceiling Price", "Available", "Market Id"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblProduct);
        if (tblProduct.getColumnModel().getColumnCount() > 0) {
            tblProduct.getColumnModel().getColumn(1).setResizable(false);
            tblProduct.getColumnModel().getColumn(3).setResizable(false);
        }

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, 680, 100));

        comboBoxSupplier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBoxSupplierActionPerformed(evt);
            }
        });
        add(comboBoxSupplier, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, 250, -1));

        jLabel1.setText("Supplier");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 110, 30));

        jLabel2.setText("Supplier Product Catalog");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, 240, -1));

        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, 110, -1));

        btnViewProduct.setText("View Product Detail");
        btnViewProduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewProductActionPerformed(evt);
            }
        });
        add(btnViewProduct, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 320, 190, -1));

        jLabel4.setBackground(new java.awt.Color(0, 0, 0));
        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel4.setText("BROWSE PRODUCTS");
        jLabel4.setIconTextGap(7);
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, -1, -1));

        btnAddtoCart.setText("ADD TO CART");
        btnAddtoCart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddtoCartActionPerformed(evt);
            }
        });
        add(btnAddtoCart, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 320, 170, -1));

        quantitySpinner.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));
        add(quantitySpinner, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 320, 50, 30));

        jLabel5.setText("Quantity:");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 330, -1, -1));

        btnSearchProduct.setText("Search Product");
        btnSearchProduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchProductActionPerformed(evt);
            }
        });
        add(btnSearchProduct, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 140, 180, -1));

        jLabel6.setText("Sales Price");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 330, -1, -1));
        add(txtFieldSalesPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 320, 50, 30));

        jLabel7.setText("Item in cart");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 370, -1, -1));

        tblOrder.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Item Name", "Price", "Quantity", "Total Amount"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tblOrder);
        if (tblOrder.getColumnModel().getColumnCount() > 0) {
            tblOrder.getColumnModel().getColumn(0).setResizable(false);
            tblOrder.getColumnModel().getColumn(1).setResizable(false);
            tblOrder.getColumnModel().getColumn(2).setResizable(false);
            tblOrder.getColumnModel().getColumn(3).setResizable(false);
        }

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 400, 670, 110));

        btnViewOrderItem.setText("View Item");
        btnViewOrderItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewOrderItemActionPerformed(evt);
            }
        });
        add(btnViewOrderItem, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 530, -1, -1));

        btnModifyQuantity.setText("Modify Quantity");
        btnModifyQuantity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModifyQuantityActionPerformed(evt);
            }
        });
        add(btnModifyQuantity, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 530, -1, -1));

        btnRemoveOrderItem.setText("Remove");
        btnRemoveOrderItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoveOrderItemActionPerformed(evt);
            }
        });
        add(btnRemoveOrderItem, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 530, -1, -1));

        btnCheckOut.setText("Check out");
        btnCheckOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCheckOutActionPerformed(evt);
            }
        });
        add(btnCheckOut, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 530, -1, -1));
        add(txtFieldSearchProduct, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 140, 110, 30));
        add(txtNewQuantity, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 530, 70, 30));

        lblUser.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblUser.setText("jLabel3");
        add(lblUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 30, -1, -1));

        lblTotalPrice.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblTotalPrice.setText("             ");
        add(lblTotalPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 530, 190, 30));

        lblCommission.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        add(lblCommission, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 380, 180, 20));
    }// </editor-fold>//GEN-END:initComponents

    private void comboBoxSupplierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBoxSupplierActionPerformed
        // TODO add your handling code here:

        populateTable();

    }//GEN-LAST:event_comboBoxSupplierActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:

        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);

    }//GEN-LAST:event_btnBackActionPerformed

    private void btnViewProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewProductActionPerformed
        // TODO add your handling code here:

        int row = tblProduct.getSelectedRow();
        if (row < 0) {
            JOptionPane.showMessageDialog(null, "Pls select a row!!", "Warning", JOptionPane.WARNING_MESSAGE);
        }
        Product p = (Product) tblProduct.getValueAt(row, 0);
        ViewProductDetailJPanel panel = new ViewProductDetailJPanel(userProcessContainer, p);
        userProcessContainer.add("ViewProductDetailJPanel", panel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);

    }//GEN-LAST:event_btnViewProductActionPerformed

    private void btnAddtoCartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddtoCartActionPerformed
        // TODO add your handling code here:
        try {
            int row = tblProduct.getSelectedRow();

            if (row < 0) {
                JOptionPane.showMessageDialog(null, "Pls select a row!!", "Warning", JOptionPane.WARNING_MESSAGE);
                return;
            }

            Product p = (Product) tblProduct.getValueAt(row, 0);
            MarketOffer mo = (MarketOffer) tblProduct.getValueAt(row, 6);

            int fetchQty = (Integer) quantitySpinner.getValue();
            if (fetchQty <= 0) {
                JOptionPane.showMessageDialog(null, "Quantity cannot be 0");
                return;

            }

            int salesPrice = Integer.parseInt(txtFieldSalesPrice.getText());
            double floorPrice = 0;
            double targetPrice = 0;
            double ceilPrice = 0;

            for (MarketOffer marketoffer : marketOfferCatalog.getMarketOfferList()) {
                if (marketoffer.getProduct().getProductId().equalsIgnoreCase(p.getProductId()) && marketoffer.getMarket().getMarketName().equalsIgnoreCase(customer.getMarketName())) {

                    floorPrice = p.getPrice() * marketoffer.getFloorRatio();
                    targetPrice = p.getPrice() * marketoffer.getTargetRatio();
                    ceilPrice = p.getPrice() * marketoffer.getCeilingRatio();
                }
            }

            if (fetchQty <= p.getAvailQuantity()) {
                if (salesPrice < floorPrice || salesPrice > ceilPrice) {
                    JOptionPane.showMessageDialog(null, "Sales Price should be between Floor Price and Ceil Price", "Warning", JOptionPane.WARNING_MESSAGE);
                    return;
                } else {
                    boolean alreadyPresent = false;
                    for (OrderItem oi : order.getOrderItemList()) {

                        if (oi.getMarketOffer().getProduct() == p) {

                            int oldAvail = p.getAvailQuantity();
                            int newAvail = oldAvail - fetchQty;
                            p.setAvailQuantity(newAvail);
                            oi.setQuantity(fetchQty + oi.getQuantity());
                            alreadyPresent = true;

                            populateTable();
                            refreshOrderTable();

                            break;

                        }
                    }
                    if (!alreadyPresent) {

                        int oldAvail = p.getAvailQuantity();
                        int newAvail = oldAvail - fetchQty;
                        p.setAvailQuantity(newAvail);
                        OrderItem orderItem = order.addOrderItem();
                        orderItem.setMarketOffer(mo);
                        orderItem.setQuantity(fetchQty);
                        orderItem.setPaidPrice(salesPrice);

                        populateTable();

                        refreshOrderTable();
//                commission= ((order.orderTotal()-order.orderTargetTotal())*0.01);
//               lblCommission.setText("SALES COMMISSION:"+commission);
                    }

                }
            } else {

                JOptionPane.showMessageDialog(null, "Quantity is greater than availability", "Warning", JOptionPane.WARNING_MESSAGE);
                return;
            }
        } catch (NumberFormatException ex) {

            JOptionPane.showMessageDialog(null, "Invalid Sales Price");
            return;
        }

    }//GEN-LAST:event_btnAddtoCartActionPerformed

    private void btnSearchProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchProductActionPerformed

        refreshTable();

    }//GEN-LAST:event_btnSearchProductActionPerformed

    private void btnViewOrderItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewOrderItemActionPerformed

        int row = tblOrder.getSelectedRow();

        if (row < 0) {
            JOptionPane.showMessageDialog(null, "Pls select a row!!", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        OrderItem oi = (OrderItem) tblOrder.getValueAt(row, 0);
        ViewOrderItemDetailJPanel panel = new ViewOrderItemDetailJPanel(userProcessContainer, oi);
        userProcessContainer.add("ViewOrderItemDetailJPanel", panel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);


    }//GEN-LAST:event_btnViewOrderItemActionPerformed

    private void btnModifyQuantityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModifyQuantityActionPerformed
        // TODO add your handling code here:
        int row = tblOrder.getSelectedRow();

        if (row < 0) {
            JOptionPane.showMessageDialog(null, "Pls select a row!!", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        OrderItem oi = (OrderItem) tblOrder.getValueAt(row, 0);
        Product p = oi.getMarketOffer().getProduct();
        int fetchQty = Integer.parseInt(txtNewQuantity.getText());
        int oldAvail = p.getAvailQuantity();
        int newAvail = oldAvail - fetchQty;
        p.setAvailQuantity(newAvail);
        oi.setQuantity(fetchQty + oi.getQuantity());
        //alreadyPresent=true;
        populateTable();
        refreshOrderTable();
        //break;


    }//GEN-LAST:event_btnModifyQuantityActionPerformed

    private void btnRemoveOrderItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoveOrderItemActionPerformed
        int row = tblOrder.getSelectedRow();

        if (row < 0) {
            JOptionPane.showMessageDialog(null, "Pls select a row!!", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        OrderItem oi = (OrderItem) tblOrder.getValueAt(row, 0);
        Product p = oi.getMarketOffer().getProduct();
        int fetchQty = oi.getQuantity();
        int oldAvail = p.getAvailQuantity();
        int newAvail = oldAvail + fetchQty;
        p.setAvailQuantity(newAvail);
        order.removeOrderItem(oi);
        populateTable();
        refreshOrderTable();


    }//GEN-LAST:event_btnRemoveOrderItemActionPerformed

    private void btnCheckOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCheckOutActionPerformed
        // TODO add your handling code here:

        if (order.getOrderItemList().size() > 0) {
            Date date = new Date();
            Calendar curdate2 = Calendar.getInstance();
            curdate2.set(Calendar.MILLISECOND, 0);
            curdate2.set(Calendar.SECOND, 0);
            curdate2.set(Calendar.MINUTE, 0);
            curdate2.set(Calendar.HOUR, 0);
            curdate2.add(Calendar.DATE, 5);
            Order order1 = business.getOrderDirectory().addOrder();
            order1.setCustomer(customer);
            order1.setPerson(person);
            order1.setOrderItemList(order.getOrderItemList());
            order1.setOrderDate(date);
            order1.setExpectedDeliveryDate(curdate2.getTime());
            order1.setStatus("Processing");
            order1.setSalesCommission(commission);
            double totalPriceOrder = 0;
            for (OrderItem orderItem : order.getOrderItemList()) {

                totalPriceOrder = totalPriceOrder + orderItem.orderItemTotal();
            }
            //double totalPrice = order.orderTotal();
            person.addOrder(order1);

            JOptionPane.showMessageDialog(null, "Order Is Placed \n Total price is " + totalPriceOrder);
            order = new Order();
            refreshOrderTable();

        }


    }//GEN-LAST:event_btnCheckOutActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddtoCart;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnCheckOut;
    private javax.swing.JButton btnModifyQuantity;
    private javax.swing.JButton btnRemoveOrderItem;
    private javax.swing.JButton btnSearchProduct;
    private javax.swing.JButton btnViewOrderItem;
    private javax.swing.JButton btnViewProduct;
    private javax.swing.JComboBox comboBoxSupplier;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblCommission;
    private javax.swing.JLabel lblTotalPrice;
    private javax.swing.JLabel lblUser;
    private javax.swing.JSpinner quantitySpinner;
    private javax.swing.JTable tblOrder;
    private javax.swing.JTable tblProduct;
    private javax.swing.JTextField txtFieldSalesPrice;
    private javax.swing.JTextField txtFieldSearchProduct;
    private javax.swing.JTextField txtNewQuantity;
    // End of variables declaration//GEN-END:variables
}
