/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.tix.main;

import com.tix.home.HomeView;
import com.tix.home.staff.StaffView;
import com.tix.home.staff.upstaff.UpStaffView;
import com.tix.login.LoginView;
import javax.swing.JButton;
import javax.swing.JPanel;

/**
 *
 * @author Germanchoo
 */
public class MainView extends javax.swing.JFrame {

    /**
     * Creates new form Main
     */
    public MainView() {
        this.home = new HomeView();
        this.login = new LoginView();
        this.staffForm = new StaffView();
        this.registerForm = new UpStaffView();

        initComponents();
        setLayout(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        header = new javax.swing.JPanel();
        exitButton = new javax.swing.JButton();
        mainPanel = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        setSize(new java.awt.Dimension(800, 480));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        header.setOpaque(false);
        header.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                headerMouseDragged(evt);
            }
        });
        header.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                headerMousePressed(evt);
            }
        });
        header.setLayout(null);

        exitButton.setBackground(new java.awt.Color(255, 255, 255));
        exitButton.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        exitButton.setForeground(new java.awt.Color(0, 0, 0));
        exitButton.setText("X");
        exitButton.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        exitButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        exitButton.setFocusPainted(false);
        exitButton.setFocusable(false);
        header.add(exitButton);
        exitButton.setBounds(0, 0, 40, 40);

        getContentPane().add(header, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 40));

        mainPanel.setBackground(new java.awt.Color(255, 255, 255));
        mainPanel.setLayout(new java.awt.BorderLayout());
        getContentPane().add(mainPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 450));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void headerMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_headerMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_headerMousePressed

    private void headerMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_headerMouseDragged
        // TODO add your handling code here:
    }//GEN-LAST:event_headerMouseDragged

    public void showFrame(JPanel panel, int width, int height, int exitButtonAlignment) {
        setSize(width, height);
        header.setSize(width, 40);
        mainPanel.setSize(width, height);
        exitButton.setBounds(exitButtonAlignment, 0, 40, 40);
        mainPanel.removeAll();
        mainPanel.add(panel);
        mainPanel.repaint();
        mainPanel.revalidate();
    }

    public JButton getExitButton() {
        return exitButton;
    }

    public JPanel getHeader() {
        return header;
    }

    private final StaffView staffForm;
    private final UpStaffView registerForm;
    private final LoginView login;
    private final HomeView home;

    private int xMouse, yMouse;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton exitButton;
    private javax.swing.JPanel header;
    private javax.swing.JPanel mainPanel;
    // End of variables declaration//GEN-END:variables
}
