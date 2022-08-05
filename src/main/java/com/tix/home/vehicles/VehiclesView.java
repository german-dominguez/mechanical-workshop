package com.tix.home.vehicles;

import com.tix.home.staff.*;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.JTableHeader;

public class VehiclesView extends javax.swing.JPanel {

    public VehiclesView() {
        initComponents();
        tableDefaultRenderer();
    }

    private void tableDefaultRenderer() {
        JTableHeader header = table.getTableHeader();
        header.setFont(new Font("Roboto", 1, 12));

        final DefaultTableCellRenderer renderer = new DefaultTableCellRenderer();

        renderer.setHorizontalAlignment(JLabel.CENTER);
        renderer.setBorder(null);

        header.setDefaultRenderer(renderer);
        table.setDefaultRenderer(Object.class, renderer);

        table.getColumnModel().getColumn(3).setPreferredWidth(3);
        table.getColumnModel().getColumn(5).setPreferredWidth(150);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        newButton = new javax.swing.JButton();
        editButton = new javax.swing.JButton();
        deleteButton = new javax.swing.JButton();
        scroll = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();

        setBackground(new java.awt.Color(255, 255, 255));
        setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        newButton.setBackground(new java.awt.Color(0, 134, 190));
        newButton.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        newButton.setForeground(new java.awt.Color(255, 255, 255));
        newButton.setText("NEW");
        newButton.setBorder(null);
        newButton.setBorderPainted(false);
        newButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        newButton.setFocusable(false);
        add(newButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 400, 110, 30));

        editButton.setBackground(new java.awt.Color(0, 134, 190));
        editButton.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        editButton.setForeground(new java.awt.Color(255, 255, 255));
        editButton.setText("EDIT");
        editButton.setBorder(null);
        editButton.setBorderPainted(false);
        editButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        editButton.setFocusable(false);
        add(editButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 400, 110, 30));

        deleteButton.setBackground(new java.awt.Color(0, 134, 190));
        deleteButton.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        deleteButton.setForeground(new java.awt.Color(255, 255, 255));
        deleteButton.setText("DELETE");
        deleteButton.setBorder(null);
        deleteButton.setBorderPainted(false);
        deleteButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        deleteButton.setFocusable(false);
        add(deleteButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 400, 110, 30));

        scroll.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        scroll.setViewportBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        table.setBackground(new java.awt.Color(255, 255, 255));
        table.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Name", "Last Name", "Age", "Phone", "Email"
            }
        ));
        table.setSelectionBackground(new java.awt.Color(147, 201, 255));
        scroll.setViewportView(table);

        add(scroll, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 700, 360));
    }// </editor-fold>//GEN-END:initComponents

    public JButton getDeleteButton() {
        return deleteButton;
    }

    public JButton getEditButton() {
        return editButton;
    }

    public JButton getNewButton() {
        return newButton;
    }

    public JTable getTable() {
        return table;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton deleteButton;
    private javax.swing.JButton editButton;
    private javax.swing.JButton newButton;
    private javax.swing.JScrollPane scroll;
    private javax.swing.JTable table;
    // End of variables declaration//GEN-END:variables

}
