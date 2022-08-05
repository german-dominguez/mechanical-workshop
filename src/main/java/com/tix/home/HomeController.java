package com.tix.home;

import com.tix.home.dashboard.DashboardController;
import com.tix.home.staff.StaffController;
import com.tix.home.vehicles.VehiclesController;
import com.tix.home.staff.upstaff.UpStaffController;
import com.tix.home.vehicles.upvehicles.UpVehicleController;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import javax.swing.JButton;

public class HomeController {

    public HomeController(HomeView view, HomeModel model,
            StaffController staffController,
            UpStaffController upStaffController,
            DashboardController dashboardController,
            VehiclesController vehiclesController,
            UpVehicleController upVehicleController) {

        this.view = view;
        this.model = model;
        this.staffController = staffController;
        this.upStaffController = upStaffController;
        this.dashboardController = dashboardController;
        this.vehiclesController = vehiclesController;
        this.upVehicleController = upVehicleController;

        addButtonsEvents();

    }

    private void addButtonsEvents() {
        buttons.add(view.getDashboardButton());
        buttons.add(view.getStaffButton());
        buttons.add(view.getVehiclesButton());
        buttons.add(view.getLogoutButton());

        for (JButton button : buttons) {
            button.addMouseListener(new java.awt.event.MouseAdapter() {
                @Override
                public void mouseClicked(java.awt.event.MouseEvent evt) {
                    buttonMouseClicked(evt);
                }
            });
        }

        staffController.getView().getNewButton().addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                newButtonMouseClicked(evt);
            }

            private void newButtonMouseClicked(MouseEvent evt) {
                view.showForm(upStaffController.getView());
            }
        });

        vehiclesController.getView().getNewButton().addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                newButtonMouseClicked(evt);
            }

            private void newButtonMouseClicked(MouseEvent evt) {
                view.showForm(upVehicleController.getView());
            }
        });
    }

    private void buttonMouseClicked(MouseEvent evt) {
        if (evt.getSource().equals(view.getDashboardButton())) {
            view.showForm(dashboardController.getView());
        }
        if (evt.getSource().equals(view.getStaffButton())) {
            view.showForm(staffController.getView());
        }
        if (evt.getSource().equals(view.getVehiclesButton())) {
            view.showForm(vehiclesController.getView());
        }
    }

    private final ArrayList<JButton> buttons = new ArrayList<>();
    private final HomeView view;
    private final HomeModel model;
    private final DashboardController dashboardController;
    private final StaffController staffController;
    private final UpStaffController upStaffController;
    private final VehiclesController vehiclesController;
    private final UpVehicleController upVehicleController;
}
