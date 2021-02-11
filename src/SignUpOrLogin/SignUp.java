package SignUpOrLogin;

import GUI.RegisterGUI;
import User.User;
import User.LoginID;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.Date;
import java.util.Random;
import java.util.Scanner;

public class SignUp {


    public User NewUser(){
        System.out.println("[Class: SignUp] NewUser() Called");

        ArrayList<String> EnteredDetails = RegisterGUI.getInputs();

        String Date = getDate();
        int ID = getID();
        int age = Integer.parseInt(EnteredDetails.get(6));
        String BirthDate = EnteredDetails.get(5);


        User newUser = new User(new LoginID(EnteredDetails.get(0),EnteredDetails.get(1),EnteredDetails.get(2),EnteredDetails.get(3),EnteredDetails.get(4)), Date, BirthDate, 10000, ID, age);
        return newUser;
    }

    private String getDate(){
        System.out.println("[Class: SignUp] getDate() Called");

        Date currentDate = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        String Date = sdf.format(currentDate);

        return Date;
    }


    private int getID(){
        System.out.println("[Class: SignUp] getID() Called");

        Random r = new Random();

        int index = -1;
        int ID = r.nextInt(10000-1000)+1000;

        return ID;
    }
}
