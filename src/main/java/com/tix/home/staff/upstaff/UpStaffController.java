package com.tix.home.staff.upstaff;

public class UpStaffController {

    public UpStaffController(UpStaffView view) {
        this.view = view;
    }
    
    public UpStaffView getView() {
        return view;
    }

    private UpStaffView view;
}
