/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.tix.home;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author Germanchoo
 */
public class HomeView extends javax.swing.JPanel {

    /**
     * Creates new form Dashboard
     */
    public HomeView() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        formPanel = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        profileLabel = new javax.swing.JLabel();
        dashboardButton = new javax.swing.JButton();
        staffButton = new javax.swing.JButton();
        vehiclesButton = new javax.swing.JButton();
        logoutButton = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        formPanel.setBackground(new java.awt.Color(255, 255, 255));
        formPanel.setLayout(new java.awt.BorderLayout());
        add(formPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 50, 740, 450));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        profileLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        profileLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/tix/images/home/profile.png"))); // NOI18N
        profileLabel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        dashboardButton.setBackground(new java.awt.Color(255, 255, 255));
        dashboardButton.setFont(new java.awt.Font("Roboto", 0, 13)); // NOI18N
        dashboardButton.setForeground(new java.awt.Color(51, 51, 51));
        dashboardButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/tix/images/home/1.png"))); // NOI18N
        dashboardButton.setText("Dashboard");
        dashboardButton.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 20, 1, 1));
        dashboardButton.setBorderPainted(false);
        dashboardButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        dashboardButton.setFocusable(false);
        dashboardButton.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        dashboardButton.setIconTextGap(10);

        staffButton.setBackground(new java.awt.Color(255, 255, 255));
        staffButton.setFont(new java.awt.Font("Roboto", 0, 13)); // NOI18N
        staffButton.setForeground(new java.awt.Color(51, 51, 51));
        staffButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/tix/images/home/2.png"))); // NOI18N
        staffButton.setText("Staff");
        staffButton.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 20, 1, 1));
        staffButton.setBorderPainted(false);
        staffButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        staffButton.setFocusable(false);
        staffButton.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        staffButton.setIconTextGap(10);

        vehiclesButton.setBackground(new java.awt.Color(255, 255, 255));
        vehiclesButton.setFont(new java.awt.Font("Roboto", 0, 13)); // NOI18N
        vehiclesButton.setForeground(new java.awt.Color(51, 51, 51));
        vehiclesButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/tix/images/home/3.png"))); // NOI18N
        vehiclesButton.setText("Vehicles");
        vehiclesButton.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 20, 1, 1));
        vehiclesButton.setBorderPainted(false);
        vehiclesButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        vehiclesButton.setFocusable(false);
        vehiclesButton.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        vehiclesButton.setIconTextGap(10);

        logoutButton.setBackground(new java.awt.Color(255, 255, 255));
        logoutButton.setFont(new java.awt.Font("Roboto", 0, 13)); // NOI18N
        logoutButton.setForeground(new java.awt.Color(51, 51, 51));
        logoutButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/tix/images/home/key.png"))); // NOI18N
        logoutButton.setText("Log out");
        logoutButton.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 20, 1, 1));
        logoutButton.setBorderPainted(false);
        logoutButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        logoutButton.setFocusable(false);
        logoutButton.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        logoutButton.setIconTextGap(10);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 4, Short.MAX_VALUE)
                        .addComponent(profileLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(dashboardButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(vehiclesButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(logoutButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(staffButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(profileLabel)
                .addGap(4, 4, 4)
                .addComponent(dashboardButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(staffButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(vehiclesButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(logoutButton)
                .addContainerGap())
        );

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 140, 440));
    }// </editor-fold>//GEN-END:initComponents

    public void showForm(JPanel panel) {
        formPanel.removeAll();
        formPanel.add(panel);
        formPanel.repaint();
        formPanel.revalidate();
    }

    public JButton getDashboardButton() {
        return dashboardButton;
    }

    public JButton getLogoutButton() {
        return logoutButton;
    }

    public JLabel getProfileLabel() {
        return profileLabel;
    }

    public JButton getStaffButton() {
        return staffButton;
    }

    public JButton getVehiclesButton() {
        return vehiclesButton;
    }

    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton dashboardButton;
    private javax.swing.JPanel formPanel;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton logoutButton;
    private javax.swing.JLabel profileLabel;
    private javax.swing.JButton staffButton;
    private javax.swing.JButton vehiclesButton;
    // End of variables declaration//GEN-END:variables
}