package labjava;

enum UserAccountType{
    STUDENT, TEACHER
}

public class User {
    public String userName;
    public String password;
    public UserAccountType accountType;


    public User() {

    }

    public User(String userName, String password, UserAccountType accountType){
        this.userName = userName;
        this.password = password;
    }
}
