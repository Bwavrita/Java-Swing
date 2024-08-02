package UserInfo;

import java.util.ArrayList;

public interface UserManagementInterface {
    public boolean userLogin(User user);
    public boolean userRegister(User user);
    public boolean removeUser(User user);
    public void setUser(ArrayList<User> userList);
    public ArrayList<User> getUser();
    
}
