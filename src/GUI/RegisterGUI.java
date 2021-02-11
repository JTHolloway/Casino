package GUI;


import SignUpOrLogin.SignUp;
import User.AllUsers;

import javax.sound.sampled.Line;
import javax.swing.JFrame;
import java.io.BufferedReader;
import java.io.FileReader;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.Scanner;


public class RegisterGUI extends javax.swing.JFrame {


    private static ArrayList<String> Inputs = new ArrayList<>();

    public static ArrayList<String> getInputs() {
        System.out.println("[Class: RegisterGUI] getInputs() Called");
        return Inputs;
    }

    /**
     * Creates new form Register
     */
    public RegisterGUI() {
        initComponents();
        Inputs.clear();
        this.setVisible(true);
        this.pack();
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {

        Hedder = new javax.swing.JPanel();
        LoginText = new javax.swing.JLabel();
        Minimise = new javax.swing.JLabel();
        Close = new javax.swing.JLabel();
        Body = new javax.swing.JPanel();
        PasswordText = new javax.swing.JLabel();
        UsernameText = new javax.swing.JLabel();
        UsernameFeild = new javax.swing.JTextField();
        Password = new javax.swing.JPasswordField();
        RegisterButton = new javax.swing.JButton();
        RegisterInteadButton = new javax.swing.JLabel();
        FirstNameFeild = new javax.swing.JTextField();
        FirstNameText = new javax.swing.JLabel();
        SurnameFeild = new javax.swing.JTextField();
        SurnameText = new javax.swing.JLabel();
        EmailFeild = new javax.swing.JTextField();
        EmailText = new javax.swing.JLabel();
        BirthdateFeild = new javax.swing.JTextField();
        BirthDateText = new javax.swing.JLabel();
        ErrorMessage = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(400, 500));
        setResizable(false);
        getContentPane().setLayout(null);

        Hedder.setBackground(new java.awt.Color(145, 180, 150));

        LoginText.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        LoginText.setForeground(new java.awt.Color(255, 255, 255));
        LoginText.setText("Register");

        Minimise.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        Minimise.setForeground(new java.awt.Color(255, 255, 255));
        Minimise.setText("-");
        Minimise.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Minimise.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MinimiseMouseClicked(evt);
            }
        });

        Close.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        Close.setForeground(new java.awt.Color(255, 255, 255));
        Close.setText("X");
        Close.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Close.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CloseMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout HedderLayout = new javax.swing.GroupLayout(Hedder);
        Hedder.setLayout(HedderLayout);
        HedderLayout.setHorizontalGroup(
                HedderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(HedderLayout.createSequentialGroup()
                                .addGap(29, 29, 29)
                                .addComponent(LoginText, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 184, Short.MAX_VALUE)
                                .addComponent(Minimise)
                                .addGap(18, 18, 18)
                                .addComponent(Close, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())
        );
        HedderLayout.setVerticalGroup(
                HedderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(HedderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(Minimise, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
                                .addComponent(LoginText)
                                .addComponent(Close, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(Hedder);
        Hedder.setBounds(0, 0, 400, 60);

        Body.setBackground(new java.awt.Color(46, 49, 49));

        PasswordText.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        PasswordText.setForeground(new java.awt.Color(218, 223, 225));
        PasswordText.setText("Password:");

        UsernameText.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        UsernameText.setForeground(new java.awt.Color(218, 223, 225));
        UsernameText.setText("Username: ");

        UsernameFeild.setBackground(new java.awt.Color(149, 165, 166));
        UsernameFeild.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        UsernameFeild.setForeground(new java.awt.Color(238, 238, 238));
        UsernameFeild.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UsernameFeildActionPerformed(evt);
            }
        });

        Password.setBackground(new java.awt.Color(149, 165, 166));
        Password.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Password.setForeground(new java.awt.Color(238, 238, 238));

        RegisterButton.setBackground(new java.awt.Color(148, 124, 176));
        RegisterButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        RegisterButton.setForeground(new java.awt.Color(255, 255, 255));
        RegisterButton.setText("Register");
        RegisterButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegisterButtonActionPerformed(evt);
            }
        });

        RegisterInteadButton.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        RegisterInteadButton.setForeground(new java.awt.Color(218, 223, 225));
        RegisterInteadButton.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        RegisterInteadButton.setText("Already got an account? Log in here!");
        RegisterInteadButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RegisterInteadButtonMouseClicked(evt);
            }
        });

        FirstNameFeild.setBackground(new java.awt.Color(149, 165, 166));
        FirstNameFeild.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        FirstNameFeild.setForeground(new java.awt.Color(238, 238, 238));
        FirstNameFeild.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FirstNameFeildActionPerformed(evt);
            }
        });

        FirstNameText.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        FirstNameText.setForeground(new java.awt.Color(218, 223, 225));
        FirstNameText.setText("First Name:");

        SurnameFeild.setBackground(new java.awt.Color(149, 165, 166));
        SurnameFeild.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        SurnameFeild.setForeground(new java.awt.Color(238, 238, 238));
        SurnameFeild.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SurnameFeildActionPerformed(evt);
            }
        });

        SurnameText.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        SurnameText.setForeground(new java.awt.Color(218, 223, 225));
        SurnameText.setText("Last Name:");

        EmailFeild.setBackground(new java.awt.Color(149, 165, 166));
        EmailFeild.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        EmailFeild.setForeground(new java.awt.Color(238, 238, 238));
        EmailFeild.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EmailFeildActionPerformed(evt);
            }
        });

        EmailText.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        EmailText.setForeground(new java.awt.Color(218, 223, 225));
        EmailText.setText("Email:");

        BirthdateFeild.setBackground(new java.awt.Color(149, 165, 166));
        BirthdateFeild.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        BirthdateFeild.setForeground(new java.awt.Color(238, 238, 238));
        BirthdateFeild.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BirthdateFeildActionPerformed(evt);
            }
        });

        BirthDateText.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        BirthDateText.setForeground(new java.awt.Color(218, 223, 225));
        BirthDateText.setText("BirthDate");

        ErrorMessage.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        ErrorMessage.setForeground(new java.awt.Color(255, 0, 0));
        ErrorMessage.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout BodyLayout = new javax.swing.GroupLayout(Body);
        Body.setLayout(BodyLayout);
        BodyLayout.setHorizontalGroup(
                BodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(BodyLayout.createSequentialGroup()
                                .addGap(50, 50, 50)
                                .addGroup(BodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(BodyLayout.createSequentialGroup()
                                                .addComponent(UsernameText, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(UsernameFeild, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(BodyLayout.createSequentialGroup()
                                                .addComponent(PasswordText, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(Password, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(BodyLayout.createSequentialGroup()
                                                .addComponent(FirstNameText, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(FirstNameFeild, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(BodyLayout.createSequentialGroup()
                                                .addComponent(SurnameText, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(SurnameFeild, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(BodyLayout.createSequentialGroup()
                                                .addComponent(EmailText, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(EmailFeild, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(BodyLayout.createSequentialGroup()
                                                .addComponent(BirthDateText, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(BirthdateFeild, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap(50, Short.MAX_VALUE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BodyLayout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(BodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BodyLayout.createSequentialGroup()
                                                .addComponent(RegisterInteadButton, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(92, 92, 92))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BodyLayout.createSequentialGroup()
                                                .addComponent(RegisterButton, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(149, 149, 149))))
                        .addComponent(ErrorMessage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        BodyLayout.setVerticalGroup(
                BodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(BodyLayout.createSequentialGroup()
                                .addGap(29, 29, 29)
                                .addGroup(BodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(FirstNameText, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(FirstNameFeild, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(BodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(SurnameText, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(SurnameFeild, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(BodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(UsernameText, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(UsernameFeild, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(BodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(EmailText, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(EmailFeild, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(BodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(PasswordText)
                                        .addComponent(Password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(BodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(BirthDateText, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(BirthdateFeild, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(ErrorMessage, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(2, 2, 2)
                                .addComponent(RegisterButton, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(RegisterInteadButton)
                                .addGap(71, 71, 71))
        );

        getContentPane().add(Body);
        Body.setBounds(0, 60, 400, 440);

        pack();
    }// </editor-fold>

    private void MinimiseMouseClicked(java.awt.event.MouseEvent evt) {
        System.out.println("[Class: RegisterGUI] MinimiseMouseClicked() Called");
        this.setState(JFrame.ICONIFIED);

    }

    private void CloseMouseClicked(java.awt.event.MouseEvent evt) {
        System.out.println("[Class: RegisterGUI] CLoseMouseClicked() Called");
        System.exit(0);

    }

    private void UsernameFeildActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private String Encrypt(String Password){
        System.out.println("[Class: RegisterGUI] Encrypt() Called");

        try {
            MessageDigest Encrypt = MessageDigest.getInstance("SHA");

            Encrypt.update(Password.getBytes());
            byte[] Encryption = Encrypt.digest();

            StringBuilder sb = new StringBuilder();
            for (byte b: Encryption){
                sb.append(String.format("%02x",b));
            }

            return sb.toString();

        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }

        return "";
    }

    private void RegisterButtonActionPerformed(java.awt.event.ActionEvent evt) {
        System.out.println("[Class: RegisterGUI] RegisterButtonActionPerformed() Called");

        char[] Passfeild = Password.getPassword();
        String password = String.copyValueOf(Passfeild);

        if (AllFilled(password)){
            String age = getAge();
            String birthdate = BirthdateFeild.getText();
            String firstName = FirstNameFeild.getText();
            String lastName = SurnameFeild.getText();
            String userName = UsernameFeild.getText();
            String email = EmailFeild.getText();
            if(checkEmail(email)){
                if(checkAge(Integer.parseInt(age))){
                    try{
                        Inputs.add(email);
                        Inputs.add(userName);
                        Inputs.add(Encrypt(String.copyValueOf(Passfeild)));
                        Inputs.add(firstName);
                        Inputs.add(lastName);
                        Inputs.add(birthdate);
                        Inputs.add(age);
                        AllUsers AU = new AllUsers();
                        AU.NewUser();
                        LoginGUI g = new LoginGUI();

                        this.dispose();
                    }catch(NullPointerException npe){
                        System.out.println(npe);
                    }
                }else{
                    ErrorMessage.setText("You are too young to use Casino.com");
                }
            }else{
                ErrorMessage.setText("Invalid or Taken Email");
            }
        }else {
            ErrorMessage.setText("Fill in all Fields");
        }

    }

    private boolean checkEmail(String Email) {
        System.out.println("[Class: RegisterGUI] checkEmail() Called");

        String folderDirectory = System.getProperty("user.dir") + "\\UserDetails.txt";
        String lineFromFile;
        boolean TakenEmail = false;
        Scanner s = new Scanner(System.in);

        int LineCount = 0;

        if (Email.contains("@")&&Email.contains(".")){
            try {
                BufferedReader read = new BufferedReader(new FileReader(folderDirectory));
                while ((lineFromFile = read.readLine()) != null) {
                    String[] UserDetails = lineFromFile.split(", ");
                    TakenEmail = UserDetails[0].equalsIgnoreCase(Email);
                    if (TakenEmail) {
                        return false;

                    } else {
                        LineCount++;
                    }
                }
                AllUsers.setCurrentUser(LineCount);
                return true;

            } catch (Exception e) {
                System.out.println("Error: " + e);
            }
        }

        return false;
    }

    private boolean checkAge(int age){
        System.out.println("[Class: RegisterGUI] checkAge() Called");

        if (age < 18){
            return false;
        }else{
            return true;
        }
    }

    private boolean AllFilled(String password){
        System.out.println("[Class: RegisterGUI] AllFilled() Called");
//        System.out.println(BirthdateFeild.getText().isEmpty() + ", "+
//                FirstNameFeild.getText().isEmpty() + ", "+
//                SurnameFeild.getText().isEmpty() + ", "+
//                UsernameFeild.getText().isEmpty() + ", "+
//                EmailFeild.getText().isEmpty() + ", "+
//                password.isEmpty());

        if(BirthdateFeild.getText().isEmpty() ||
                FirstNameFeild.getText().isEmpty() ||
                SurnameFeild.getText().isEmpty() ||
                UsernameFeild.getText().isEmpty() ||
                EmailFeild.getText().isEmpty() ||
                password.isEmpty())
        {
            return false;
        }else{
            return true;
        }
    }

    private String getAge(){
        System.out.println("[Class: RegisterGUI] getAge() Called");

        ArrayList<String> BirthAge = new ArrayList<>();
        Scanner s = new Scanner(System.in);
        LocalDate today = LocalDate.now();

        String BirthDate = BirthdateFeild.getText();

        LocalDate Birth = LocalDate.of(Integer.parseInt(BirthDate.substring(6,10)),Integer.parseInt(BirthDate.substring(3,5)),Integer.parseInt(BirthDate.substring(0,2)));
        int ages = (int) Period.between(Birth,today).getYears();

        return Integer.toString(ages);
    }

    private void RegisterInteadButtonMouseClicked(java.awt.event.MouseEvent evt) {
        System.out.println("[Class: RegisterGUI] RegisterInsteadButtonMouseClicked() Called");

        LoginGUI rg = new LoginGUI();
        rg.setVisible(true);
        rg.pack();
        rg.setLocationRelativeTo(null);
        rg.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();

    }

    private void FirstNameFeildActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void SurnameFeildActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void EmailFeildActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void BirthdateFeildActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(RegisterGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegisterGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegisterGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegisterGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegisterGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify
    private javax.swing.JLabel BirthDateText;
    private javax.swing.JTextField BirthdateFeild;
    private javax.swing.JPanel Body;
    private javax.swing.JLabel Close;
    private javax.swing.JTextField EmailFeild;
    private javax.swing.JLabel EmailText;
    private javax.swing.JLabel ErrorMessage;
    private javax.swing.JTextField FirstNameFeild;
    private javax.swing.JLabel FirstNameText;
    private javax.swing.JPanel Hedder;
    private javax.swing.JLabel LoginText;
    private javax.swing.JLabel Minimise;
    private javax.swing.JPasswordField Password;
    private javax.swing.JLabel PasswordText;
    private javax.swing.JButton RegisterButton;
    private javax.swing.JLabel RegisterInteadButton;
    private javax.swing.JTextField SurnameFeild;
    private javax.swing.JLabel SurnameText;
    private javax.swing.JTextField UsernameFeild;
    private javax.swing.JLabel UsernameText;
    // End of variables declaration


}
