package com.tix.main;

import com.formdev.flatlaf.FlatLightLaf;
import com.formdev.flatlaf.IntelliJTheme;
import com.tix.home.HomeView;
import com.tix.home.HomeModel;
import com.tix.home.HomeController;
import com.tix.home.staff.StaffController;
import com.tix.home.staff.StaffModel;
import com.tix.home.staff.StaffView;
import com.tix.login.LoginController;
import com.tix.login.LoginModel;
import com.tix.login.LoginView;
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

        StaffView staffView = new StaffView();
        StaffModel staffModel = new StaffModel();
        StaffController staffController = new StaffController(staffView, staffModel);

        HomeView homeView = new HomeView();
        HomeModel homeModel = new HomeModel();
        HomeController homeController = new HomeController(homeView, homeModel, staffView, staffModel, staffController);

        MainModel model = new MainModel();
        MainView view = new MainView();
        MainController controller = new MainController(view, model,
                loginView, homeView, homeModel, homeController);


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
            SwingUtilities.updateComponentTreeUI(staffView);
        });
    }

}
