package com.tix.main;

import com.tix.home.HomeView;
import com.tix.home.HomeModel;
import com.tix.home.HomeController;
import com.tix.login.LoginController;
import com.tix.login.LoginModel;
import com.tix.login.LoginView;
import java.awt.Color;
import java.awt.event.MouseEvent;

public class MainController {

    private LoginView loginView;
    private LoginModel loginModel;
    private LoginController loginController;

    private HomeView homeView;
    private HomeModel homeModel;
    private HomeController homeController;

    private MainView view;
    private MainModel model;

    public MainController(MainView view, MainModel model,
            LoginView loginView, LoginModel loginModel, LoginController loginController,
            HomeView homeView, HomeModel homeModel, HomeController homeController) {

        this.view = view;
        this.model = model;
        this.loginView = loginView;
        this.loginModel = loginModel;
        this.loginController = loginController;
        this.homeView = homeView;
        this.homeModel = homeModel;
        this.homeController = homeController;

        /**
         * ExitButton Events
         */
        view.getExitButton().addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitButtonMouseClicked(evt);
            }

            public void mouseEntered(java.awt.event.MouseEvent evt) {
                exitButtonMouseEntered(evt);
            }

            public void mouseExited(java.awt.event.MouseEvent evt) {
                exitButtonMouseExited(evt);
            }

            private void exitButtonMouseClicked(MouseEvent evt) {
                System.exit(0);
            }

            private void exitButtonMouseEntered(MouseEvent evt) {
                view.getExitButton().setBackground(Color.red);
                view.getExitButton().setForeground(Color.white);
            }

            private void exitButtonMouseExited(MouseEvent evt) {
                view.getExitButton().setBackground(Color.white);
                view.getExitButton().setForeground(Color.black);
            }
        });

        /**
         * LoginButton Click Event
         */
        loginController.getView().getLoginButton().addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                loginButtonMouseClicked(evt);
            }

            private void loginButtonMouseClicked(MouseEvent evt) {
                view.showFrame(homeView, 900, 500, 860);
            }
        });
    }

    public void run() {
        view.showFrame(loginView, 800, 450, 0);
        view.setVisible(true);
    }

}
