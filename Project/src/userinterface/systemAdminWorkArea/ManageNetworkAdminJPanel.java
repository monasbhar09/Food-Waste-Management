/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.systemAdminWorkArea;

import business.employee.Employee;
import business.network.Network;
import business.userAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Monas
 */
public class ManageNetworkAdminJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManageNetworkAdminJPanel
     */
    private JPanel userProcessContainer;
    private Network network;

    public ManageNetworkAdminJPanel(JPanel userProcessContainer, Network network) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.network = network;
        selectedNetwork.setText(network.toString());
        populateNetworkAdminTable();
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
        backBtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        networkAdminTable = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        selectedNetwork = new javax.swing.JTextField();
        addNetworkAdminBtn = new javax.swing.JButton();
        removeNetworkAdminBtn = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Yu Gothic", 1, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Manage Network Admin");

        backBtn.setText("<< Back");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });

        networkAdminTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Employee", "User Name"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(networkAdminTable);
        if (networkAdminTable.getColumnModel().getColumnCount() > 0) {
            networkAdminTable.getColumnModel().getColumn(0).setResizable(false);
        }

        jLabel2.setText("Network:");

        selectedNetwork.setEnabled(false);

        addNetworkAdminBtn.setText("Add");
        addNetworkAdminBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addNetworkAdminBtnActionPerformed(evt);
            }
        });

        removeNetworkAdminBtn.setText("Remove");
        removeNetworkAdminBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeNetworkAdminBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 432, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(166, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(selectedNetwork))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(removeNetworkAdminBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(addNetworkAdminBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(174, 174, 174))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(selectedNetwork, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(removeNetworkAdminBtn)
                    .addComponent(addNetworkAdminBtn))
                .addContainerGap(190, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backBtnActionPerformed

    private void addNetworkAdminBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addNetworkAdminBtnActionPerformed
        AddNetworkAdminJPanel addNetworkAdminJPanel = new AddNetworkAdminJPanel(userProcessContainer, network);
        userProcessContainer.add("addNetworkAdminJPanel", addNetworkAdminJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_addNetworkAdminBtnActionPerformed

    private void removeNetworkAdminBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeNetworkAdminBtnActionPerformed
        int selectedRow = networkAdminTable.getSelectedRow();
        if (selectedRow >= 0) {
            int dialogButton = JOptionPane.YES_NO_OPTION;
            int dialogResult = JOptionPane.showConfirmDialog(null, "Would You like to delete the Network Admin?", "WARNING", dialogButton);
            if (dialogResult == JOptionPane.YES_OPTION) {

                UserAccount ua = (UserAccount) networkAdminTable.getValueAt(selectedRow, 1);
                Employee employee = ua.getEmployee();
                network.getEmployeeDirectory().removeEmployee(employee);
                network.getUserAccountDirectory().removeUserAccount(ua);
                populateNetworkAdminTable();
            }
        } else {
            JOptionPane.showMessageDialog(null, "Please select a row", "WARNING", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_removeNetworkAdminBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addNetworkAdminBtn;
    private javax.swing.JButton backBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable networkAdminTable;
    private javax.swing.JButton removeNetworkAdminBtn;
    private javax.swing.JTextField selectedNetwork;
    // End of variables declaration//GEN-END:variables

    public void populateNetworkAdminTable() {
        DefaultTableModel model = (DefaultTableModel) networkAdminTable.getModel();
        model.setRowCount(0);
        for (UserAccount userAccount : network.getUserAccountDirectory().getUserAccountList()) {
            Object[] row = new Object[2];
            row[0] = userAccount.getEmployee().getEmployeeName();
            row[1] = userAccount;
            model.addRow(row);
        }
    }
}