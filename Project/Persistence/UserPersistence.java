 package Persistence;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import UserInfo.User;

public class UserPersistence implements UserPersistenceInterface{

    @SuppressWarnings("unchecked")
    @Override
    public ArrayList<User> recoverList() {
       File file = new File("UserFile");
       ArrayList<User> tempList = new ArrayList<>();
       try {
        if(file.exists()){
            ObjectInputStream obj = new ObjectInputStream(new FileInputStream(file));
            tempList = (ArrayList<User>)obj.readObject();
            obj.close();

        }
       } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
       }catch(ClassNotFoundException e){
            System.out.println("Error: " + e.getMessage());
       }

       return tempList;
    }

    @Override
    public void saveList(ArrayList<User> userList) {
        File file = new File("UserFile");
        try {
            file.delete();
            file.createNewFile();

            ObjectOutputStream obj = new ObjectOutputStream(new FileOutputStream(file));
            obj.writeObject(userList);
            obj.close();
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

 }