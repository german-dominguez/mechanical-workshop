package com.tix.home.staff;

import com.tix.event.ButtonEvent;

public class StaffForm extends javax.swing.JPanel {

    public StaffForm() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttons = new com.tix.home.staff.Buttons();
        table = new com.tix.home.staff.Table();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        add(buttons, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 400, -1, -1));
        add(table, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 720, 360));
    }// </editor-fold>//GEN-END:initComponents

    public void addButtonSelectedEvent(ButtonEvent event) {
        this.event = event;
        buttons.addButtonSelectedEvent(event);
    }
    private ButtonEvent event;

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.tix.home.staff.Buttons buttons;
    private com.tix.home.staff.Table table;
    // End of variables declaration//GEN-END:variables

}
