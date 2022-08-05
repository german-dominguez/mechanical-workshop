package com.tix.home.dashboard;

public class DashboardController {

    public DashboardController(DashboardView view) {
        this.view = view;
    }

    public DashboardView getView() {
        return view;
    }

    private DashboardView view;
}
