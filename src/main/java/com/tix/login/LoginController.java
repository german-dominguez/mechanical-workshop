package com.tix.login;

import java.awt.Color;
import java.awt.event.MouseEvent;

public class LoginController {

    private LoginView view;
    private LoginModel model;

    public LoginController(LoginView view, LoginModel model) {
        this.view = view;
        this.model = model;

        /**
         * UserTextField Events
         */
        view.getUserTextField().addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                if (view.getUserTextField().getText().equals(model.getUSER())) {
                    view.getUserTextField().setText("");
                    view.getUserTextField().setForeground(Color.black);
                }
                if (String.valueOf(view.getPasswordField().getPassword()).isEmpty()) {
                    view.getPasswordField().setText(model.getPASSWORD());
                    view.getPasswordField().setForeground(Color.gray);
                }
            }

            private void userTextFieldMousePressed(MouseEvent evt) {
            }
        });

        /**
         * PasswordField Events
         */
        view.getPasswordField().addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                passwordFieldMousePressed(evt);
            }

            private void passwordFieldMousePressed(MouseEvent evt) {
                if (String.valueOf(view.getPasswordField().getPassword()).equals(model.getPASSWORD())) {
                    view.getPasswordField().setText("");
                    view.getPasswordField().setForeground(Color.black);
                }
                if (view.getUserTextField().getText().isEmpty()) {
                    view.getUserTextField().setText(model.getUSER());
                    view.getUserTextField().setForeground(Color.gray);
                }
            }
        });

        /**
         * Login Button Events
         */
        view.getLoginButton().addMouseListener(new java.awt.event.MouseAdapter() {

            public void mouseEntered(java.awt.event.MouseEvent evt) {
                loginButtonMouseEntered(evt);
            }

            public void mouseExited(java.awt.event.MouseEvent evt) {
                loginButtonMouseExited(evt);
            }

            private void loginButtonMouseEntered(MouseEvent evt) {
                view.getLoginButton().setBackground(new Color(45, 158, 219));
            }

            private void loginButtonMouseExited(MouseEvent evt) {
                view.getLoginButton().setBackground(new Color(0, 124, 190));
            }
        });
    }

    public LoginView getView() {
        return view;
    }
}
