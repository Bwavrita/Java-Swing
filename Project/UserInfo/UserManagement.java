package UserInfo;

import java.util.ArrayList;

public class UserManagement implements UserManagementInterface {
    private DataUser data;

    public UserManagement(DataUser data) {
        this.data = data;
    }

    @Override
    public boolean userLogin(User user) {
        ArrayList<User> userList = data.getUserList();
        for (User u : userList) {
            if (u.equals(user)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean userRegister(User user) {
        ArrayList<User> userList = data.getUserList();
        for (User u : userList) {
            if (u.getGmail().equals(user.getGmail())) {
                return false;
            }
        }
        data.getUserList().add(user);
        return true;
    }

    @Override
    public boolean removeUser(User user) {
        return data.getUserList().remove(user);
    }

    public void setUser(ArrayList<User> userList){
        data.setUserList(userList);
    }

    public ArrayList<User> getUser(){
        return data.getUserList();
    }
}
