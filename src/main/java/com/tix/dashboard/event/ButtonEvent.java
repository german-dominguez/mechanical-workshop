/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tix.dashboard.event;

import com.tix.dashboard.DashboardFrame;
import com.tix.dashboard.forms.Form1;
import com.tix.dashboard.forms.Form2;
import com.tix.dashboard.forms.Form3;
import com.tix.dashboard.forms.Form4;
import com.tix.main.MechanicalWorkshop;
import javax.swing.JButton;

/**
 *
 * @author Germanchoo
 */
public class ButtonEvent {

    public void showDashboard() {
        MechanicalWorkshop.getLoginUI().setVisible(true);
        MechanicalWorkshop.getLoginUI().getDashboardFrame().setVisible(false);
    }

    public void showForm(JButton button) {
        switch (button.getText()) {
            case "Dashboard" ->
                dashboard().showForm(new Form1());
            case "Stuff" ->
                dashboard().showForm(new Form2());
            case "Vehicles" ->
                dashboard().showForm(new Form3());
            case "Statistics" ->
                dashboard().showForm(new Form4());
        }
    }

    private DashboardFrame dashboard() {
        return MechanicalWorkshop.getLoginUI().getDashboardFrame();
    }
}
