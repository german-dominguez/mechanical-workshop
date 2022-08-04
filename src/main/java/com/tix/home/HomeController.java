package com.tix.home;

import java.awt.Color;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import javax.swing.JButton;

public class HomeController {

    public HomeController(HomeView view, HomeModel model) {
        this.view = view;
        this.model = model;

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

                public void mouseEntered(java.awt.event.MouseEvent evt) {
                    buttonMouseEntered(evt);
                }

                public void mouseExited(java.awt.event.MouseEvent evt) {
                    buttonMouseExited(evt);
                }
            });
        }
    }

    private void buttonMouseEntered(MouseEvent evt) {
        for (JButton button : buttons) {
            if (evt.getSource().equals(button)) {
                button.setBackground(new Color(225, 225, 225));
            }
        }
    }

    private void buttonMouseClicked(MouseEvent evt) {
        for (JButton button : buttons) {
            if (evt.getSource().equals(button)) {
                switch (button.getText()) {
                    case "Dashboard" -> System.out.println("1");
                    case "Staff" -> System.out.println("2");
                    case "Vehicles" -> System.out.println("3");
                    case "Log out" -> System.out.println("4");
                }
            }
        }

    }

    private void buttonMouseExited(MouseEvent evt) {
        for (JButton button : buttons) {
            if (evt.getSource().equals(button)) {
                button.setBackground(new Color(255, 255, 255));
            }
        }
    }

    private ArrayList<JButton> buttons = new ArrayList<>();
    private HomeView view;
    private HomeModel model;
}
