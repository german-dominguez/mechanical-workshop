package com.tix.main;

import com.tix.home.HomeView;
import com.tix.home.HomeModel;
import com.tix.home.HomeController;
import com.tix.login.LoginController;
import com.tix.login.LoginModel;
import com.tix.login.LoginView;

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        LoginView loginView = new LoginView();
        LoginModel loginModel = new LoginModel();
        LoginController loginController = new LoginController(loginView, loginModel);
       
        HomeView homeView = new HomeView();
        HomeModel homeModel = new HomeModel();
        HomeController homeController = new HomeController(homeView, homeModel);
        
        MainModel model = new MainModel();
        MainView view = new MainView();
        MainController controller = new MainController(view, model, 
                loginView, loginModel, loginController,homeView, homeModel, homeController);

        /* Set the Windows look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            controller.run();
        });
    }

}
