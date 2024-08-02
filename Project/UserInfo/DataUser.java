package UserInfo;

import java.io.Serializable;
import java.util.ArrayList;

public class DataUser implements Serializable{
    private ArrayList<User> userList = new ArrayList<>();

    public ArrayList<User> getUserList() {
        return userList;
    }

    public void setUserList(ArrayList<User> userList) {
        this.userList = userList;
    }

}
