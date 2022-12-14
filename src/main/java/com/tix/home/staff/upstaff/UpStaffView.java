/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.tix.home.staff.upstaff;

import java.awt.Color;

/**
 *
 * @author Germanchoo
 */
public class UpStaffView extends javax.swing.JPanel {

    /**
     * Creates new form RegisterForm
     */
    public UpStaffView() {
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

        titleLabel = new javax.swing.JLabel();
        idLabel = new javax.swing.JLabel();
        idTxtField = new javax.swing.JTextField();
        idSeparator = new javax.swing.JSeparator();
        nameLabel = new javax.swing.JLabel();
        nameTxtField = new javax.swing.JTextField();
        nameSeparator = new javax.swing.JSeparator();
        lastNameLabel = new javax.swing.JLabel();
        lastNameTxtField = new javax.swing.JTextField();
        lastNameSeparator = new javax.swing.JSeparator();
        verticalSeparator = new javax.swing.JSeparator();
        emailLabel = new javax.swing.JLabel();
        emailTxtField = new javax.swing.JTextField();
        emailSeparator = new javax.swing.JSeparator();
        phoneLabel = new javax.swing.JLabel();
        phoneTxtField = new javax.swing.JTextField();
        phoneSeparator = new javax.swing.JSeparator();
        ageLabel = new javax.swing.JLabel();
        ageTxtField = new javax.swing.JTextField();
        ageSeparator = new javax.swing.JSeparator();
        newButton = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        titleLabel.setFont(new java.awt.Font("Roboto Black", 0, 24)); // NOI18N
        titleLabel.setText("REGISTER NEW USER");
        add(titleLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        idLabel.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        idLabel.setText("ID");
        add(idLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, -1, -1));

        idTxtField.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        idTxtField.setForeground(new java.awt.Color(102, 102, 102));
        idTxtField.setText("1234567890");
        idTxtField.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        add(idTxtField, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 260, 30));

        idSeparator.setForeground(new java.awt.Color(0, 153, 255));
        idSeparator.setPreferredSize(new java.awt.Dimension(200, 10));
        add(idSeparator, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, 260, 10));

        nameLabel.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        nameLabel.setText("Name");
        add(nameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, -1, -1));

        nameTxtField.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        nameTxtField.setForeground(new java.awt.Color(102, 102, 102));
        nameTxtField.setText("Enter your name");
        nameTxtField.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        add(nameTxtField, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, 260, 30));

        nameSeparator.setForeground(new java.awt.Color(0, 153, 255));
        nameSeparator.setPreferredSize(new java.awt.Dimension(200, 10));
        add(nameSeparator, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, 260, 10));

        lastNameLabel.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        lastNameLabel.setText("Last Name");
        add(lastNameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, 80, -1));

        lastNameTxtField.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        lastNameTxtField.setForeground(new java.awt.Color(102, 102, 102));
        lastNameTxtField.setText("Enter your last name");
        lastNameTxtField.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        add(lastNameTxtField, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 290, 260, 30));

        lastNameSeparator.setForeground(new java.awt.Color(0, 153, 255));
        lastNameSeparator.setPreferredSize(new java.awt.Dimension(200, 10));
        add(lastNameSeparator, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 320, 260, 10));

        verticalSeparator.setForeground(new java.awt.Color(204, 204, 204));
        verticalSeparator.setOrientation(javax.swing.SwingConstants.VERTICAL);
        verticalSeparator.setPreferredSize(new java.awt.Dimension(200, 10));
        add(verticalSeparator, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 20, 10, 360));

        emailLabel.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        emailLabel.setText("Email");
        add(emailLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 50, 50, -1));

        emailTxtField.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        emailTxtField.setForeground(new java.awt.Color(102, 102, 102));
        emailTxtField.setText("Enter your email");
        emailTxtField.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        add(emailTxtField, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 80, 260, 30));

        emailSeparator.setForeground(new java.awt.Color(0, 153, 255));
        emailSeparator.setPreferredSize(new java.awt.Dimension(200, 10));
        add(emailSeparator, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 110, 260, 10));

        phoneLabel.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        phoneLabel.setText("Phone");
        add(phoneLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 150, 50, -1));

        phoneTxtField.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        phoneTxtField.setForeground(new java.awt.Color(102, 102, 102));
        phoneTxtField.setText("Enter your phone");
        phoneTxtField.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        add(phoneTxtField, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 180, 260, 30));

        phoneSeparator.setForeground(new java.awt.Color(0, 153, 255));
        phoneSeparator.setPreferredSize(new java.awt.Dimension(200, 10));
        add(phoneSeparator, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 210, 260, 10));

        ageLabel.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        ageLabel.setText("Age");
        add(ageLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 260, 50, -1));

        ageTxtField.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        ageTxtField.setForeground(new java.awt.Color(102, 102, 102));
        ageTxtField.setText("20");
        ageTxtField.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        add(ageTxtField, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 290, 40, 30));

        ageSeparator.setForeground(new java.awt.Color(0, 153, 255));
        ageSeparator.setPreferredSize(new java.awt.Dimension(200, 10));
        add(ageSeparator, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 320, 40, 10));

        newButton.setBackground(new java.awt.Color(0, 134, 190));
        newButton.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        newButton.setForeground(new java.awt.Color(255, 255, 255));
        newButton.setText("NEW");
        newButton.setBorder(null);
        newButton.setBorderPainted(false);
        newButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        newButton.setFocusable(false);
        newButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                newButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                newButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                newButtonMouseExited(evt);
            }
        });
        add(newButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 360, 260, 50));
    }// </editor-fold>//GEN-END:initComponents

    private void newButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_newButtonMouseClicked
        //event.menuSelected(3);
    }//GEN-LAST:event_newButtonMouseClicked

    private void newButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_newButtonMouseEntered
        newButton.setBackground(new Color(45, 158, 219));
    }//GEN-LAST:event_newButtonMouseEntered

    private void newButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_newButtonMouseExited
        newButton.setBackground(new Color(0, 124, 190));
    }//GEN-LAST:event_newButtonMouseExited

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ageLabel;
    private javax.swing.JSeparator ageSeparator;
    private javax.swing.JTextField ageTxtField;
    private javax.swing.JLabel emailLabel;
    private javax.swing.JSeparator emailSeparator;
    private javax.swing.JTextField emailTxtField;
    private javax.swing.JLabel idLabel;
    private javax.swing.JSeparator idSeparator;
    private javax.swing.JTextField idTxtField;
    private javax.swing.JLabel lastNameLabel;
    private javax.swing.JSeparator lastNameSeparator;
    private javax.swing.JTextField lastNameTxtField;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JSeparator nameSeparator;
    private javax.swing.JTextField nameTxtField;
    private javax.swing.JButton newButton;
    private javax.swing.JLabel phoneLabel;
    private javax.swing.JSeparator phoneSeparator;
    private javax.swing.JTextField phoneTxtField;
    private javax.swing.JLabel titleLabel;
    private javax.swing.JSeparator verticalSeparator;
    // End of variables declaration//GEN-END:variables
}
