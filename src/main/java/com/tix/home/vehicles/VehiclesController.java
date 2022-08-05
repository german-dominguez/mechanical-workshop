package com.tix.home.vehicles;

public class VehiclesController {

    public VehiclesController(VehiclesView view) {
        this.view = view;

    }

    public VehiclesView getView() {
        return view;
    }

    private final VehiclesView view;
}
