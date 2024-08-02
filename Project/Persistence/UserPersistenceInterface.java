package Persistence;

import java.util.ArrayList;

import UserInfo.User;

public interface UserPersistenceInterface {

    public ArrayList<User> recoverList();
    public void saveList(ArrayList<User> userList);
    
}