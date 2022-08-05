package com.tix.main;

import com.tix.home.HomeView;
import com.tix.login.LoginView;
import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

public class MainController {

    public MainController(MainView view, MainModel model,
            LoginView loginView,
            HomeView homeView) {

        this.view = view;
        this.model = model;
        this.loginView = loginView;
        this.homeView = homeView;

        /**
         * Header Events
         */
        view.getHeader().addMouseMotionListener(new MouseMotionAdapter() {
            public void mouseDragged(MouseEvent evt) {
                headerMouseDragged(evt);
            }

            private void headerMouseDragged(MouseEvent evt) {
                int x = evt.getXOnScreen();
                int y = evt.getYOnScreen();
                view.setLocation(x - xMouse, y - yMouse);
            }
        });
        view.getHeader().addMouseListener(new MouseAdapter() {
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
        view.getExitButton().addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent evt) {
                exitButtonMouseClicked(evt);
            }

            @Override
            public void mouseEntered(MouseEvent evt) {
                exitButtonMouseEntered(evt);
            }

            public void mouseExited(MouseEvent evt) {
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
        this.loginView.getLoginButton().addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent evt) {
                loginButtonMouseClicked(evt);
            }

            private void loginButtonMouseClicked(MouseEvent evt) {
                view.showFrame(homeView, 900, 500, 860);
            }
        });

        /**
         * LogoutButton Click Event
         */
        this.homeView.getLogoutButton().addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent evt) {
                logoutButtonMouseClicked(evt);
            }

            private void logoutButtonMouseClicked(MouseEvent evt) {
                view.showFrame(loginView, 800, 450, 0);
            }
        });
    }

    public void run() {
        view.showFrame(loginView, 800, 450, 0);
        view.setVisible(true);
    }

    private int xMouse, yMouse;

    private final LoginView loginView;
    private final HomeView homeView;
    private final MainView view;
    private final MainModel model;
}
