package com.tix.home;

import com.tix.event.ButtonEvent;

public final class Menu extends javax.swing.JPanel {
    
    public Menu() {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        profileLabel = new javax.swing.JLabel();
        menuButton = new com.tix.home.MenuButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(150, 500));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        profileLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        profileLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/tix/images/home/profile.png"))); // NOI18N
        profileLabel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        add(profileLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 59, 130, -1));
        add(menuButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 180, 130, -1));
    }// </editor-fold>//GEN-END:initComponents

    public void addButtonSelectedEvent(ButtonEvent event) {
        this.event = event;
        menuButton.addButtonSelectedEvent(event);
    }
    private ButtonEvent event;

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.tix.home.MenuButton menuButton;
    private javax.swing.JLabel profileLabel;
    // End of variables declaration//GEN-END:variables

}
