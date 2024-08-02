package ScreenInfo.ActionButton;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import Persistence.UserPersistence;
import ScreenInfo.Screen;
import UserInfo.UserManagement;


public class ActionButtonRegisterOnLogin implements ActionListener {
    private UserManagement userManagement;
    private Screen screen;
    private UserPersistence userPersistence;

    public ActionButtonRegisterOnLogin(Screen screen ,UserManagement userManagement,UserPersistence userPersistence){
        this.userManagement = userManagement;
        this.screen = screen;
        this.userPersistence = userPersistence;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        screen.dispose();
        screen = new Screen("Register Screen",userManagement,userPersistence);
        screen.registerScreen();
    }
}