package User;

import SignUpOrLogin.SignUp;

import java.io.*;
import java.lang.reflect.Array;
import java.util.ArrayList;


public class AllUsers {

    private static int CurrentUser;
    private static String folderDirectory = System.getProperty("user.dir") + "\\UserDetails.txt";
    private static ArrayList<User> Members;

    public static ArrayList<User> readFile() {
        System.out.println("[Class: AllUsers] readFile() Called");

        ArrayList<User> AllUsers = new ArrayList<>();
        String lineFromFile;
        try {
            BufferedReader read = new BufferedReader(new FileReader(folderDirectory));
            while ((lineFromFile = read.readLine()) != null) {
                String[] UserDetails = lineFromFile.split(", ");
                User user = new User(new LoginID(UserDetails[0],UserDetails[1],UserDetails[2],UserDetails[3],UserDetails[4]), UserDetails[5],UserDetails[6] ,Integer.parseInt(UserDetails[7]), Integer.parseInt(UserDetails[8]),
                        Integer.parseInt(UserDetails[9]));
                AllUsers.add(user);
            }
            read.close();

        } catch (Exception e) {
            System.out.println("Error: " + e);
        }

        Members = AllUsers;
        return AllUsers;
    }

    public static void writeToFile(ArrayList<User> Users){
        System.out.println("[Class: AllUsers] writeToFile() Called");

        try{
            FileWriter write = new FileWriter(folderDirectory);
            PrintWriter print = new PrintWriter(write);

            for (int i = 0; i<Users.size(); i++){
                print.println(Users.get(i).toString());
            }

            print.close();

        }catch (Exception e){
            System.out.println("Error: "+e);
        }

    }

    public static void clearFile() {
        System.out.println("[Class: AllUsers] clearFile() Called");

        try {
            FileOutputStream writer = new FileOutputStream(folderDirectory);
            writer.write(("").getBytes());
            writer.close();
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
    }

    public void NewUser(){
        System.out.println("[Class: AllUsers] NewUser() Called");

        ArrayList<User> Users = readFile();
        SignUp su = new SignUp();
        User NewUser = su.NewUser();
        Users.add(NewUser);
        clearFile();
        writeToFile(Users);
    }


    public static int getCurrentUser() {
        System.out.println("[Class: AllUsers] getCurrentUser() Called");
        return CurrentUser;
    }

    public static void setCurrentUser(int currentUser) {
        System.out.println("[Class: AllUsers] setCurrentUser() Called");
        CurrentUser = currentUser;
    }

    public static void UpdateFile(User u){
        Members.set(CurrentUser, u);
        clearFile();
        writeToFile(Members);
    }
}
