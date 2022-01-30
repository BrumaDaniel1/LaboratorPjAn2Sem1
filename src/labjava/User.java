package labjava;

import java.util.Objects;

enum UserAccountType{
    STUDENT, TEACHER
}

public class User {
    public String userName;
    public String password;
    public UserAccountType accountType;


    public User() {

    }

    public User(String userName, String password){
        this.userName = userName;
        this.password = password;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof User)) return false;
        User user = (User) o;
        return Objects.equals(userName, user.userName) && Objects.equals(password, user.password);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userName, password);
    }

    @Override
    public String toString() {
        return "User{" +
                "userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    public User(String userName, String password, UserAccountType accountType){
        this.userName = userName;
        this.password = password;
        this.accountType = accountType;
    }
}
