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

    private final LoginView loginView;

    private final HomeView homeView;
    private final HomeModel homeModel;
    private final HomeController homeController;

    private final MainView view;
    private final MainModel model;

    public MainController(MainView view, MainModel model,
            LoginView loginView,
            HomeView homeView, HomeModel homeModel, HomeController homeController) {

        this.view = view;
        this.model = model;
        this.loginView = loginView;
        this.homeView = homeView;
        this.homeModel = homeModel;
        this.homeController = homeController;

        /**
         * Header Events
         */
        view.getHeader().addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                headerMouseDragged(evt);
            }

            private void headerMouseDragged(MouseEvent evt) {
                int x = evt.getXOnScreen();
                int y = evt.getYOnScreen();
                view.setLocation(x - xMouse, y - yMouse);
            }
        });
        view.getHeader().addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                headerMousePressed(evt);
            }

            private void headerMousePressed(MouseEvent evt) {
                xMouse = evt.getX();
                yMouse = evt.getY();
            }
        });

        /**
         * ExitButton Events
         */
        view.getExitButton().addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitButtonMouseClicked(evt);
            }

            @Override
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
        this.loginView.getLoginButton().addMouseListener(new java.awt.event.MouseAdapter() {
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

    private int xMouse, yMouse;
}
