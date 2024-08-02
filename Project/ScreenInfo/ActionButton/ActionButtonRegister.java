package ScreenInfo.ActionButton;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import Persistence.UserPersistence;
import ScreenInfo.Screen;
import UserInfo.User;
import UserInfo.UserManagement;

public class ActionButtonRegister implements ActionListener {
    private UserManagement userManagement;
    private JTextField user;
    private JTextField email;
    private JPasswordField password;
    private JPasswordField secPassword;
    private Screen screen;
    private UserPersistence userPersistence;

    public ActionButtonRegister(UserManagement userManagement, JTextField user, JTextField email, JPasswordField password, JPasswordField secPassword, Screen screen , UserPersistence userPersistence) {
        this.userManagement = userManagement;
        this.user = user;
        this.email = email;
        this.password = password;
        this.secPassword = secPassword;
        this.screen = screen;
        this.userPersistence = userPersistence;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String userText = user.getText();
        String emailText = email.getText();
        String passwordText = new String(password.getPassword());
        String secPasswordText = new String(secPassword.getPassword());
        userManagement.setUser(userPersistence.recoverList());
        if (userText.isEmpty() && passwordText.isEmpty() && emailText.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Username, email and password are empty", "Error", JOptionPane.WARNING_MESSAGE);
        } else if (userText.isEmpty() && passwordText.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Username and password are empty", "Error", JOptionPane.WARNING_MESSAGE);
        } else if (passwordText.isEmpty() && emailText.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Password and email are empty", "Error", JOptionPane.WARNING_MESSAGE);
        } else if (userText.isEmpty() && emailText.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Username and email are empty", "Error", JOptionPane.WARNING_MESSAGE);
        } else if (userText.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Username is empty", "Error", JOptionPane.WARNING_MESSAGE);
        } else if (emailText.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Email is empty", "Error", JOptionPane.WARNING_MESSAGE);
        } else if (passwordText.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Password is empty", "Error", JOptionPane.WARNING_MESSAGE);
        } else if (!secPasswordText.equals(passwordText)) {
            JOptionPane.showMessageDialog(null, "The passwords are different", "Error", JOptionPane.WARNING_MESSAGE);
        } else {
            if (userManagement.userRegister(new User(emailText, passwordText, userText))) {
                JOptionPane.showMessageDialog(null, "Registration successful!", "Success", JOptionPane.INFORMATION_MESSAGE);
                screen.dispose();
                Screen newScreen = new Screen("Smile", userManagement,userPersistence);
                newScreen.smileScreen();
                userPersistence.saveList(userManagement.getUser());
            } else {
                JOptionPane.showMessageDialog(null, "Email has already been registered", "Error", JOptionPane.WARNING_MESSAGE);
            }
        }
    }
}
