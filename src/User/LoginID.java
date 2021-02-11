package User;

import java.util.Scanner;

public class LoginID {

    private String Email;
    private String UserName;
    private String Password;
    private String FirstName;
    private String Surname;

    public LoginID(String email, String userName, String password, String firstName, String surname) {
        Email = email;
        UserName = userName;
        Password = password;
        FirstName = firstName;
        Surname = surname;
    }

    @Override
    public String toString() {
        System.out.println("[Class: LoginID] toString() Called");
        return Email + ", " + UserName + ", " + Password + ", " + FirstName + ", " + Surname;
    }

    public String getEmail() {
        System.out.println("[Class: LoginID] getEmail() Called");
        return Email;
    }

    public String getUserName() {
        System.out.println("[Class: LoginID] getUserName() Called");
        return UserName;
    }

    public String getPassword() {
        System.out.println("[Class: LoginID] getPassword() Called");
        return Password;
    }

    public String getFirstName() {
        System.out.println("[Class: LoginID] getFirstName() Called");
        return FirstName;
    }

    public String getSurname() {
        System.out.println("[Class: LoginID] getSurname() Called");
        return Surname;
    }
}
