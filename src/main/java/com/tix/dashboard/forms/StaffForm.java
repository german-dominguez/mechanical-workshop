package com.tix.dashboard.forms;

import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.table.DefaultTableCellRenderer;

public class StaffForm extends javax.swing.JPanel {

    public StaffForm() {
        initComponents();
        tableHeaderRenderer();
        customTableCellRenderer();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        scroll = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        scroll.setBackground(new java.awt.Color(255, 255, 255));
        scroll.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        scroll.setForeground(new java.awt.Color(255, 255, 255));

        table.setAutoCreateRowSorter(true);
        table.setBackground(new java.awt.Color(255, 255, 255));
        table.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        table.setForeground(new java.awt.Color(102, 102, 102));
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
                "ID", "Name", "Last Name", "Age", "Email", "Phone Number"
            }
        ));
        table.setFocusable(false);
        table.setGridColor(new java.awt.Color(204, 204, 204));
        table.setOpaque(false);
        table.setRowHeight(30);
        table.setRowMargin(2);
        table.setSelectionBackground(new java.awt.Color(102, 153, 255));
        table.setShowGrid(false);
        table.setShowHorizontalLines(false);
        table.getTableHeader().setResizingAllowed(false);
        table.getTableHeader().setReorderingAllowed(false);
        scroll.setViewportView(table);

        add(scroll, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 27, 820, 390));
    }// </editor-fold>//GEN-END:initComponents

    private void tableHeaderRenderer() {
        DefaultTableCellRenderer tableCellRenderer = (DefaultTableCellRenderer) table.getTableHeader().getDefaultRenderer();
        tableCellRenderer.setHorizontalAlignment(JLabel.CENTER);
        
        table.getTableHeader().setFont(new Font("Roboto", 1, 12));
        table.getColumnModel().getColumn(3).setPreferredWidth(3);
        table.getColumnModel().getColumn(4).setPreferredWidth(150);
    }

    private void customTableCellRenderer() {
        DefaultTableCellRenderer renderer = new DefaultTableCellRenderer();

        renderer.setHorizontalAlignment(JLabel.CENTER);
        for (int i = 0; i < table.getColumnCount(); i++) {
            table.getColumnModel().getColumn(i).setCellRenderer(renderer);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane scroll;
    private javax.swing.JTable table;
    // End of variables declaration//GEN-END:variables
}
