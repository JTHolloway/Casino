package User;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.util.Date;
import java.util.Random;
import java.util.Scanner;

public class User {

    private LoginID login;
    private String MemberSince; //Date Started
    private String BirthDate;
    private int ChipBalance;
    private int MembershipID;
    private int age;

    public User(LoginID login,String memberSince, String birthDate, int chipBalance, int membershipID, int age) {
        this.login = login;
        MemberSince = memberSince;
        BirthDate = birthDate;
        ChipBalance = chipBalance;
        MembershipID = membershipID;
        this.age = age;
    }

    public void setChipBalance(int chipBalance) {
        ChipBalance = chipBalance;
    }

    public LoginID getLogin() {
        System.out.println("[Class: User] getLogin() Called");
        return login;
    }

    public String getMemberSince() {
        System.out.println("[Class: User] getMemberSince() Called");
        return MemberSince;
    }

    public int getChipBalance() {
        System.out.println("[Class: User] getChipBalance() Called");
        return ChipBalance;
    }

    public int getMembershipID() {
        System.out.println("[Class: User] getMembershipID() Called");
        return MembershipID;
    }

    public int getAge() {
        System.out.println("[Class: User] getAge() Called");
        return age;
    }

    @Override
    public String toString() {
        System.out.println("[Class: User] toString() Called");
        return login +
                ", " + MemberSince +
                ", " + BirthDate +
                ", " + ChipBalance +
                ", " + MembershipID +
                ", " + age;
    }

}
