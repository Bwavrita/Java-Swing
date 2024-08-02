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

public class ActionButtonLogin implements ActionListener {
    private UserManagement userManagement;
    private JTextField user;
    private JPasswordField password;
    private Screen screen;
    private UserPersistence userPersistence;

    public ActionButtonLogin(UserManagement userManagement, JTextField user, JPasswordField password, Screen screen,UserPersistence userPersistence) {
        this.userManagement = userManagement;
        this.user = user;
        this.password = password;
        this.screen = screen;
        this.userPersistence = userPersistence;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String userText = user.getText();
        String passText = new String(password.getPassword());
        userManagement.setUser(userPersistence.recoverList());
        if (userText.isEmpty() && passText.isEmpty()) {
            JOptionPane.showMessageDialog(null, "User and password are empty", "Error", JOptionPane.WARNING_MESSAGE);
        } else if (userText.isEmpty()) {
            JOptionPane.showMessageDialog(null, "User is empty", "Error", JOptionPane.WARNING_MESSAGE);
        } else if (passText.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Password is empty", "Error", JOptionPane.WARNING_MESSAGE);
        } else {
            User userr = new User(passText, userText);
            if (userManagement.userLogin(userr)) {
                JOptionPane.showMessageDialog(null, "Login successful!", "Success", JOptionPane.INFORMATION_MESSAGE);
                screen.dispose();
                Screen newScreen = new Screen("Smile", userManagement,userPersistence);
                newScreen.smileScreen();
            } else {
                JOptionPane.showMessageDialog(null, "User or password incorrect", "Error", JOptionPane.WARNING_MESSAGE);
            }
        }
    }
}
