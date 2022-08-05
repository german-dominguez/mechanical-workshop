package com.tix.main;

import com.formdev.flatlaf.FlatLightLaf;
import com.tix.home.HomeView;
import com.tix.home.HomeModel;
import com.tix.home.HomeController;
import com.tix.home.dashboard.DashboardController;
import com.tix.home.dashboard.DashboardView;
import com.tix.home.staff.StaffController;
import com.tix.home.staff.StaffModel;
import com.tix.home.staff.StaffView;
import com.tix.home.vehicles.VehiclesController;
import com.tix.home.vehicles.VehiclesView;
import com.tix.login.LoginController;
import com.tix.login.LoginModel;
import com.tix.login.LoginView;
import com.tix.home.staff.upstaff.UpStaffController;
import com.tix.home.staff.upstaff.UpStaffView;
import com.tix.home.vehicles.upvehicles.UpVehicleController;
import com.tix.home.vehicles.upvehicles.UpVehicleView;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        LoginView loginView = new LoginView();
        LoginModel loginModel = new LoginModel();
        LoginController loginController = new LoginController(loginView, loginModel);

        DashboardView dashboardView = new DashboardView();
        DashboardController dashboardController = new DashboardController(dashboardView);

        StaffView staffView = new StaffView();
        StaffModel staffModel = new StaffModel();
        StaffController staffController = new StaffController(staffView, staffModel);

        UpStaffView upStaffView = new UpStaffView();
        UpStaffController upStaffController = new UpStaffController(upStaffView);

        VehiclesView vehiclesView = new VehiclesView();
        VehiclesController vehiclesController = new VehiclesController(vehiclesView);

        UpVehicleView upVehicleView = new UpVehicleView();
        UpVehicleController upVehicleController = new UpVehicleController(upVehicleView);

        HomeView homeView = new HomeView();
        HomeModel homeModel = new HomeModel();
        HomeController homeController = new HomeController(homeView, homeModel,
                staffController, upStaffController,
                dashboardController,
                vehiclesController, upVehicleController);

        MainModel model = new MainModel();
        MainView view = new MainView();
        MainController controller = new MainController(view, model,
                loginView, homeView);

        /* Set Look And Feel Theme */
        try {
            UIManager.setLookAndFeel(new FlatLightLaf());
        } catch (UnsupportedLookAndFeelException e) {
        }

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            controller.run();
            SwingUtilities.updateComponentTreeUI(view);
            SwingUtilities.updateComponentTreeUI(homeView);
            SwingUtilities.updateComponentTreeUI(dashboardView);
            SwingUtilities.updateComponentTreeUI(staffView);
            SwingUtilities.updateComponentTreeUI(upStaffView);
            SwingUtilities.updateComponentTreeUI(vehiclesView);
            SwingUtilities.updateComponentTreeUI(upVehicleView);
        });
    }

}
