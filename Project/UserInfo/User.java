package UserInfo;

import java.io.Serializable;

public class User implements Serializable{
    private String gmail;
    private String password;
    private String user;
    
    public User(String password, String user) {
        this.password = password;
        this.user = user;
    }

    public User(String gmail, String password, String user) {
        this.gmail = gmail;
        this.password = password;
        this.user = user;
    }
    
    public String getGmail() {
        return gmail;
    }
    public void setGmail(String gmail) {
        this.gmail = gmail;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public String getUser() {
        return user;
    }
    public void setUser(String user) {
        this.user = user;
    }

    public boolean equals(User user){
        if(this.user.equals(user.getUser()) && this.password.equals(user.getPassword())){
            return true;
        }
        return false;
    }

    public String toString(){
        return "User:" + getUser();
    }
}