package com.tix.home;

import com.tix.home.staff.StaffController;
import com.tix.home.staff.StaffModel;
import com.tix.home.staff.StaffView;
import java.awt.Color;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import javax.swing.JButton;

public class HomeController {

    public HomeController(HomeView view, HomeModel model,
            StaffView staffView, StaffModel staffModel, StaffController staffController) {
        this.view = view;
        this.model = model;
        this.staffView = staffView;
        this.staffModel = staffModel;
        this.staffController = staffController;

        addButtonsEvents();

    }

    private void addButtonsEvents() {
        buttons.add(view.getDashboardButton());
        buttons.add(view.getStaffButton());
        buttons.add(view.getVehiclesButton());
        buttons.add(view.getLogoutButton());

        for (JButton button : buttons) {
            button.addMouseListener(new java.awt.event.MouseAdapter() {
                public void mouseClicked(java.awt.event.MouseEvent evt) {
                    buttonMouseClicked(evt);
                }
            });
        }
    }

    private void buttonMouseClicked(MouseEvent evt) {
        if (evt.getSource().equals(view.getDashboardButton())) {
            view.showForm(staffController.getView());
        }
        if (evt.getSource().equals(view.getStaffButton())) {
            System.out.println("2");
        }
        if (evt.getSource().equals(view.getVehiclesButton())) {
            System.out.println("3");
        }
        if (evt.getSource().equals(view.getLogoutButton())) {
            System.out.println("4");
        }
    }

    private ArrayList<JButton> buttons = new ArrayList<>();
    private HomeView view;
    private HomeModel model;
    private StaffView staffView;
    private StaffModel staffModel;
    private StaffController staffController;
}
