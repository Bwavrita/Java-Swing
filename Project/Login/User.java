package Login;

public class User {
    private String gmail;
    private String password;
    private String user;
    
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
}