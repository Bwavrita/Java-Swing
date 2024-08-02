import Persistence.UserPersistence;
import ScreenInfo.Screen;
import UserInfo.DataUser;
import UserInfo.UserManagement;

public class Main {
     public static void main(String[] args) {
        UserPersistence userPersistence = new UserPersistence();
        DataUser dataUser = new DataUser();
        UserManagement userManagement = new UserManagement(dataUser);
        Screen screen = new Screen("Login Screen", userManagement,userPersistence);
        screen.loginScreen();
    }
}


