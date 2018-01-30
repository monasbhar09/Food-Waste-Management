/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.organization.groceryManagerWorkArea;

import business.enterprise.Enterprise;
import business.network.Network;
import business.organization.GroceryOrganization;
import business.userAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author LENOVO
 */
public class GroceryManagerWorkAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form GroceryManagerWorkAreaJPanel
     */
    private JPanel userProcessContainer;
    private GroceryOrganization groceryOrganization;
    private UserAccount userAccount;
    private Enterprise enterprise;
    private Network network;

    public GroceryManagerWorkAreaJPanel(JPanel userProcessContainer, UserAccount userAccount, GroceryOrganization groceryOrganization, Enterprise enterprise, Network network) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.groceryOrganization = groceryOrganization;
        this.userAccount = userAccount;
        this.enterprise = enterprise;
        this.network = network;
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
        manageProductCatalogBtn = new javax.swing.JButton();
        placeGroceryRequestBtn = new javax.swing.JButton();
        donateGroceryRequestBtn = new javax.swing.JButton();
        viewReportBtn = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Yu Gothic", 1, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Grocery Manager Work Area");

        manageProductCatalogBtn.setText("Manage Product Catalog");
        manageProductCatalogBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageProductCatalogBtnActionPerformed(evt);
            }
        });

        placeGroceryRequestBtn.setText("Place Grocery Request");
        placeGroceryRequestBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                placeGroceryRequestBtnActionPerformed(evt);
            }
        });

        donateGroceryRequestBtn.setText("Donate Grocery");
        donateGroceryRequestBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                donateGroceryRequestBtnActionPerformed(evt);
            }
        });

        viewReportBtn.setText("View Report");
        viewReportBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewReportBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(144, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 539, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(135, 135, 135))
            .addGroup(layout.createSequentialGroup()
                .addGap(211, 211, 211)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(manageProductCatalogBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(placeGroceryRequestBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(donateGroceryRequestBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(viewReportBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 372, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(69, 69, 69)
                .addComponent(manageProductCatalogBtn)
                .addGap(44, 44, 44)
                .addComponent(placeGroceryRequestBtn)
                .addGap(45, 45, 45)
                .addComponent(donateGroceryRequestBtn)
                .addGap(44, 44, 44)
                .addComponent(viewReportBtn)
                .addContainerGap(146, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void manageProductCatalogBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageProductCatalogBtnActionPerformed
        // TODO add your handling code here:
        GroceryManagerProductCatalogJPanel groceryManageProductCatalogJPanel = new GroceryManagerProductCatalogJPanel(userProcessContainer, groceryOrganization);
        userProcessContainer.add("groceryManageProductCatalogJPanel", groceryManageProductCatalogJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_manageProductCatalogBtnActionPerformed

    private void placeGroceryRequestBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_placeGroceryRequestBtnActionPerformed
        // TODO add your handling code here:
        GroceryManagerPlaceRequestJPanel groceryManagerPlaceRequestJPanel = new GroceryManagerPlaceRequestJPanel(userProcessContainer, userAccount, groceryOrganization, enterprise);
        userProcessContainer.add("groceryManagerPlaceRequestJPanel", groceryManagerPlaceRequestJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_placeGroceryRequestBtnActionPerformed

    private void viewReportBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewReportBtnActionPerformed
        // TODO add your handling code here:
        GroceryManagerViewReportJPanel groceryManagerViewReportJPanel = new GroceryManagerViewReportJPanel(userProcessContainer, groceryOrganization);
        userProcessContainer.add("groceryManagerViewReportJPanel", groceryManagerViewReportJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_viewReportBtnActionPerformed

    private void donateGroceryRequestBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_donateGroceryRequestBtnActionPerformed
        // TODO add your handling code here:
        GroceryManagerDonateRequestJPanel groceryManagerDonateRequestJPanel = new GroceryManagerDonateRequestJPanel(userProcessContainer, userAccount, network, groceryOrganization);
        userProcessContainer.add("groceryManagerDonateRequestJPanel", groceryManagerDonateRequestJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_donateGroceryRequestBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton donateGroceryRequestBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton manageProductCatalogBtn;
    private javax.swing.JButton placeGroceryRequestBtn;
    private javax.swing.JButton viewReportBtn;
    // End of variables declaration//GEN-END:variables
}
