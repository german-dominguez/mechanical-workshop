package com.tix.login;

public class LoginController {

    private final LoginView view;
    private final LoginModel model;

    public LoginController(LoginView view, LoginModel model) {
        this.view = view;
        this.model = model;

        /**
         * UserTextField Events
         */
       //TextPrompt textPrompt = new TextPrompt("Enter your username", view.getUserTextField());
        //textPrompt.setShow(TextPrompt.Show.FOCUS_LOST);
        /*
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
        });*/

        /**
         * PasswordField Events
         */
        /*
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
        });}/*

        /**
         * Login Button Events
         */
        view.getLoginButton().addMouseListener(new java.awt.event.MouseAdapter() {
        });
    }

    public LoginView getView() {
        return view;
    }
}
