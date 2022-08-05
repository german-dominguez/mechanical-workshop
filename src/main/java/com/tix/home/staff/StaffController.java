package com.tix.home.staff;

import java.util.ArrayList;
import javax.swing.JButton;

public class StaffController {

    public StaffController(StaffView view, StaffModel model) {
        this.view = view;
        this.model = model;

    }

    private void addButtonsEvents() {
    }

    public StaffView getView() {
        return view;
    }

    private ArrayList<JButton> buttons = new ArrayList<>();
    private StaffView view;
    private StaffModel model;
}
