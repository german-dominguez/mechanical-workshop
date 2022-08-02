/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.tix.login;

import com.tix.dashboard.event.MenuEvent;
import java.awt.Color;

/**
 *
 * @author Germanchoo
 */
public class Login extends javax.swing.JPanel {

    /**
     * Creates new form Login
     *
     * @param main
     */
    public Login() {
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

        backgroundLabel = new javax.swing.JLabel();
        titleLabel = new javax.swing.JLabel();
        userLabel = new javax.swing.JLabel();
        userSeparator = new javax.swing.JSeparator();
        userTextField = new javax.swing.JTextField();
        passwordLabel = new javax.swing.JLabel();
        passwordSeparator = new javax.swing.JSeparator();
        passwordField = new javax.swing.JPasswordField();
        loginButton = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(800, 450));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        backgroundLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/tix/images/login/wallpaper.png"))); // NOI18N
        add(backgroundLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 0, 300, 510));

        titleLabel.setFont(new java.awt.Font("Roboto Black", 1, 24)); // NOI18N
        titleLabel.setText("SIGN IN");
        add(titleLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, 190, 30));

        userLabel.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        userLabel.setText("USER");
        add(userLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, 70, -1));

        userSeparator.setForeground(new java.awt.Color(0, 0, 0));
        add(userSeparator, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, 390, 10));

        userTextField.setFont(new java.awt.Font("Roboto", 0, 13)); // NOI18N
        userTextField.setForeground(new java.awt.Color(204, 204, 204));
        userTextField.setText("Enter your username");
        userTextField.setBorder(null);
        userTextField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                userTextFieldMousePressed(evt);
            }
        });
        add(userTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, 390, 30));

        passwordLabel.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        passwordLabel.setText("PASSWORD");
        add(passwordLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, 100, -1));

        passwordSeparator.setForeground(new java.awt.Color(0, 0, 0));
        add(passwordSeparator, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 280, 390, 10));

        passwordField.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        passwordField.setForeground(new java.awt.Color(204, 204, 204));
        passwordField.setText("*************");
        passwordField.setBorder(null);
        passwordField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                passwordFieldMousePressed(evt);
            }
        });
        add(passwordField, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 250, 390, 30));

        loginButton.setBackground(new java.awt.Color(0, 134, 190));
        loginButton.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        loginButton.setForeground(new java.awt.Color(255, 255, 255));
        loginButton.setText("NEXT");
        loginButton.setBorder(null);
        loginButton.setBorderPainted(false);
        loginButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        loginButton.setFocusable(false);
        loginButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                loginButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                loginButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                loginButtonMouseExited(evt);
            }
        });
        add(loginButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 330, 140, 40));
    }// </editor-fold>//GEN-END:initComponents

    private void userTextFieldMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_userTextFieldMousePressed
        if (userTextField.getText().equals("Enter your username")) {
            userTextField.setText("");
            userTextField.setForeground(Color.black);
        }
        if (String.valueOf(passwordField.getPassword()).isEmpty()) {
            passwordField.setText("*************");
            passwordField.setForeground(Color.gray);
        }
    }//GEN-LAST:event_userTextFieldMousePressed

    private void passwordFieldMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_passwordFieldMousePressed
        if (String.valueOf(passwordField.getPassword()).equals("*************")) {
            passwordField.setText("");
            passwordField.setForeground(Color.black);
        }
        if (userTextField.getText().isEmpty()) {
            userTextField.setText("Enter your username");
            userTextField.setForeground(Color.gray);
        }
    }//GEN-LAST:event_passwordFieldMousePressed

    private void loginButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginButtonMouseEntered
        loginButton.setBackground(new Color(45, 158, 219));
    }//GEN-LAST:event_loginButtonMouseEntered

    private void loginButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginButtonMouseExited
        loginButton.setBackground(new Color(0, 124, 190));
    }//GEN-LAST:event_loginButtonMouseExited

    private void loginButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginButtonMouseClicked
        event.menuSelected(3);
    }//GEN-LAST:event_loginButtonMouseClicked

    public void addEventMenuSelected(MenuEvent event) {
        this.event = event;
    }

    private MenuEvent event;
    private int xMouse, yMouse;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel backgroundLabel;
    private javax.swing.JButton loginButton;
    private javax.swing.JPasswordField passwordField;
    private javax.swing.JLabel passwordLabel;
    private javax.swing.JSeparator passwordSeparator;
    private javax.swing.JLabel titleLabel;
    private javax.swing.JLabel userLabel;
    private javax.swing.JSeparator userSeparator;
    private javax.swing.JTextField userTextField;
    // End of variables declaration//GEN-END:variables
}
