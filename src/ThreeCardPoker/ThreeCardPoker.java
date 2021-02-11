package ThreeCardPoker;

import GUI.GameMenu;
import GUI.LoginGUI;
import Game.Dealer;
import Game.Player;
import User.AllUsers;

import javax.sound.sampled.*;
import javax.swing.*;
import java.io.File;
import java.io.IOException;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Random;


public class ThreeCardPoker extends javax.swing.JFrame {

    private Dealer dealer ;
    private Player player ;
    private boolean Fold = false;
    private static String folderDirectory = System.getProperty("user.dir") + "\\src\\images\\";
    private Clip FlipSound;
    private Clip WinChipSound;
    private Clip SelectChipSound;
    private Clip PlaceButtonSound;
    private Clip ChipClear;
    private ArrayList<Clip> PlaceChipSounds = new ArrayList<>();
    private ThreeCardPokerRULES rules = new ThreeCardPokerRULES();

    /**
     * Creates new form LoginForm
     */
    public ThreeCardPoker() {
        initComponents();

        this.setVisible(true);
        this.pack();
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setSounds();

        dealer = new Dealer();
        player = new Player();

        BalanceText.setText("  Balance: £" + FormatNumber(player.getUser().getChipBalance()));

        Enable();
        newHands();
        resetCards();

    }

    private void setSounds(){
        setFlipSound();
        setWinChipSound();
        setPlaceChipSounds();
        setSelectChipSound();
        setPlaceButtonChipSound();
        setClearChipSound();
    }

    private void resetCards(){
        ImageIcon Pback = player.getHand().getHand().get(1).getBackImage();
        ImageIcon Dback = dealer.getHand().getHand().get(1).getBackImage();
        dealerCard1.setIcon(Dback);
        dealerCard2.setIcon(Dback);
        dealerCard3.setIcon(Dback);
        playerCard1.setIcon(Pback);
        playerCard2.setIcon(Pback);
        playerCard3.setIcon(Pback);
    }

    private void newHands(){
        dealer.getHand().dealNewHand();
        player.getHand().dealNewHand();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        Hedder = new javax.swing.JPanel();
        BalanceText = new javax.swing.JLabel();
        Minimise = new javax.swing.JLabel();
        Close = new javax.swing.JLabel();
        Rules = new javax.swing.JLabel();
        MainMenu = new javax.swing.JLabel();
        Body = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        dealerCard1 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        dealerCard2 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        playerCard1 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        playerCard2 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        dealerCard3 = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        playerCard3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        DealerText = new javax.swing.JLabel();
        PlayerText = new javax.swing.JLabel();
        AntePlusBetText3 = new javax.swing.JLabel();
        AntePlusBetText4 = new javax.swing.JLabel();
        AntePlusBetText5 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        Replay = new javax.swing.JButton();
        Result = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        £50Text = new javax.swing.JLabel();
        BetText = new javax.swing.JLabel();
        £100Text = new javax.swing.JLabel();
        £500Text = new javax.swing.JLabel();
        £1000Text = new javax.swing.JLabel();
        PairPlusBetText = new javax.swing.JLabel();
        AntePlusBetText = new javax.swing.JLabel();
        WinningsText = new javax.swing.JLabel();
        PlayButton = new javax.swing.JButton();
        PlaceBetButton = new javax.swing.JButton();
        FoldButton = new javax.swing.JButton();
        ClearBetButton = new javax.swing.JButton();
        CurrentWinText = new javax.swing.JLabel();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        Hedder.setBackground(new java.awt.Color(171, 183, 183));

        BalanceText.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        BalanceText.setForeground(new java.awt.Color(255, 255, 255));
        BalanceText.setText("  Balance: £10000");

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

        Rules.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        Rules.setForeground(new java.awt.Color(102, 102, 0));
        Rules.setText("RULES");
        Rules.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Rules.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RulesMouseClicked(evt);
            }
        });

        MainMenu.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        MainMenu.setForeground(new java.awt.Color(255, 255, 255));
        MainMenu.setText("< Main Menu");
        MainMenu.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        MainMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MainMenuMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout HedderLayout = new javax.swing.GroupLayout(Hedder);
        Hedder.setLayout(HedderLayout);
        HedderLayout.setHorizontalGroup(
                HedderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(HedderLayout.createSequentialGroup()
                                .addComponent(BalanceText, javax.swing.GroupLayout.PREFERRED_SIZE, 534, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(MainMenu)
                                .addGap(18, 18, 18)
                                .addComponent(Rules)
                                .addGap(26, 26, 26)
                                .addComponent(Minimise)
                                .addGap(18, 18, 18)
                                .addComponent(Close, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())
        );
        HedderLayout.setVerticalGroup(
                HedderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(HedderLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(HedderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(Close, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
                                        .addComponent(Minimise)
                                        .addComponent(BalanceText)
                                        .addComponent(MainMenu)
                                        .addComponent(Rules))
                                .addContainerGap())
        );

        Body.setBackground(new java.awt.Color(38, 166, 91));

        jPanel4.setMaximumSize(new java.awt.Dimension(125, 182));
        jPanel4.setMinimumSize(new java.awt.Dimension(125, 182));
        jPanel4.setPreferredSize(new java.awt.Dimension(125, 182));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
                jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(dealerCard1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
                jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(dealerCard1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 182, Short.MAX_VALUE)
        );

        jPanel6.setMaximumSize(new java.awt.Dimension(125, 182));
        jPanel6.setMinimumSize(new java.awt.Dimension(125, 182));

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
                jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(dealerCard2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
                jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(dealerCard2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 182, Short.MAX_VALUE)
        );

        jPanel7.setMaximumSize(new java.awt.Dimension(125, 182));
        jPanel7.setMinimumSize(new java.awt.Dimension(125, 182));

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
                jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(playerCard1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
                jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(playerCard1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 182, Short.MAX_VALUE)
        );

        jPanel8.setMaximumSize(new java.awt.Dimension(125, 182));
        jPanel8.setMinimumSize(new java.awt.Dimension(125, 182));

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
                jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(playerCard2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE)
        );
        jPanel8Layout.setVerticalGroup(
                jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(playerCard2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 182, Short.MAX_VALUE)
        );

        jPanel9.setMaximumSize(new java.awt.Dimension(125, 182));
        jPanel9.setMinimumSize(new java.awt.Dimension(125, 182));

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
                jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(dealerCard3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE)
        );
        jPanel9Layout.setVerticalGroup(
                jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(dealerCard3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 182, Short.MAX_VALUE)
        );

        jPanel10.setMaximumSize(new java.awt.Dimension(125, 182));
        jPanel10.setMinimumSize(new java.awt.Dimension(125, 182));

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
                jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(playerCard3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE)
        );
        jPanel10Layout.setVerticalGroup(
                jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(playerCard3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 182, Short.MAX_VALUE)
        );

        jLabel2.setFont(new java.awt.Font("Leelawadee UI", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 204, 0));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Pair Plus Pays");

        jLabel3.setFont(new java.awt.Font("Leelawadee UI", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 204, 0));
        jLabel3.setText("PAIR ..................................  1 to 1");

        jLabel4.setFont(new java.awt.Font("Leelawadee UI", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 204, 0));
        jLabel4.setText("FLUSH ...............................  4 to 1");

        jLabel5.setFont(new java.awt.Font("Leelawadee UI", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(204, 204, 0));
        jLabel5.setText("THREE OF A KIND ...........  30 to 1");

        jLabel6.setFont(new java.awt.Font("Leelawadee UI", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(204, 204, 0));
        jLabel6.setText("STRAIGHT ........................  6 to 1");

        jLabel7.setFont(new java.awt.Font("Leelawadee UI", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(204, 204, 0));
        jLabel7.setText("STRAIGHT FLUSH  ...........  40 to 1");

        jLabel8.setFont(new java.awt.Font("Leelawadee UI", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 102, 0));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Ante Bonus Pays");

        jLabel9.setFont(new java.awt.Font("Leelawadee UI", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 102, 0));
        jLabel9.setText("THREE OF A KIND ...........  4 to 1");

        jLabel10.setFont(new java.awt.Font("Leelawadee UI", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 102, 0));
        jLabel10.setText("STRAIGHT ........................  1 to 1");

        jLabel11.setFont(new java.awt.Font("Leelawadee UI", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 102, 0));
        jLabel11.setText("STRAIGHT FLUSH  ...........  5 to 1");

        DealerText.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        DealerText.setForeground(new java.awt.Color(102, 102, 102));
        DealerText.setText("Dealer:");

        PlayerText.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        PlayerText.setForeground(new java.awt.Color(102, 102, 102));
        PlayerText.setText("Player:");

        AntePlusBetText3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        AntePlusBetText3.setForeground(new java.awt.Color(102, 102, 102));
        AntePlusBetText3.setText("Choose Bet Value, Then press to bet");

        AntePlusBetText4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        AntePlusBetText4.setForeground(new java.awt.Color(102, 102, 102));
        AntePlusBetText4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        AntePlusBetText4.setText("on Ante or Pair Plus");

        AntePlusBetText5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        AntePlusBetText5.setForeground(new java.awt.Color(102, 102, 102));
        AntePlusBetText5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        AntePlusBetText5.setText("The More You Bet, The More You Can Win!");

        jPanel2.setBackground(new java.awt.Color(153, 153, 0));

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ThreeCardPoker/Ante.png"))); // NOI18N
        jLabel13.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel13MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel3.setBackground(new java.awt.Color(0, 255, 51));

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ThreeCardPoker/PairPlus.png"))); // NOI18N
        jLabel14.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel14MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
                jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel14, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
                jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel11.setBackground(new java.awt.Color(0, 51, 51));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ThreeCardPoker/Play.png"))); // NOI18N
        jLabel12.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel12MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
                jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel11Layout.setVerticalGroup(
                jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        Replay.setBackground(new java.awt.Color(171, 183, 183));
        Replay.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Replay.setForeground(new java.awt.Color(153, 153, 153));
        Replay.setText("Play Again");
        Replay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ReplayActionPerformed(evt);
            }
        });

        Result.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        Result.setForeground(new java.awt.Color(255, 102, 102));
        Result.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Result.setText("Win/Lose");
        Result.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout BodyLayout = new javax.swing.GroupLayout(Body);
        Body.setLayout(BodyLayout);
        BodyLayout.setHorizontalGroup(
                BodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(BodyLayout.createSequentialGroup()
                                .addGap(25, 25, 25)
                                .addGroup(BodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(BodyLayout.createSequentialGroup()
                                                .addComponent(DealerText, javax.swing.GroupLayout.PREFERRED_SIZE, 374, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(0, 0, Short.MAX_VALUE))
                                        .addGroup(BodyLayout.createSequentialGroup()
                                                .addGroup(BodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(BodyLayout.createSequentialGroup()
                                                                .addGap(47, 47, 47)
                                                                .addGroup(BodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addGroup(BodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                                                .addGroup(BodyLayout.createSequentialGroup()
                                                                                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                        .addGap(26, 26, 26)
                                                                                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                        .addGap(27, 27, 27)
                                                                                        .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, BodyLayout.createSequentialGroup()
                                                                                        .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                        .addGap(26, 26, 26)
                                                                                        .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                        .addGap(27, 27, 27)
                                                                                        .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                                        .addGroup(BodyLayout.createSequentialGroup()
                                                                                .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                                                                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                                        .addGroup(BodyLayout.createSequentialGroup()
                                                                .addComponent(PlayerText, javax.swing.GroupLayout.PREFERRED_SIZE, 367, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                                .addGroup(BodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(BodyLayout.createSequentialGroup()
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                                                                .addGroup(BodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addGroup(BodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                        .addGroup(BodyLayout.createSequentialGroup()
                                                                                                .addGap(10, 10, 10)
                                                                                                .addGroup(BodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                                                        .addComponent(jLabel4)
                                                                                                        .addComponent(jLabel3)
                                                                                                        .addComponent(jLabel5)
                                                                                                        .addComponent(jLabel6)
                                                                                                        .addComponent(jLabel7))))
                                                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BodyLayout.createSequentialGroup()
                                                                                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                        .addGap(3, 3, 3))
                                                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BodyLayout.createSequentialGroup()
                                                                                        .addComponent(jLabel10)
                                                                                        .addGap(16, 16, 16)))
                                                                        .addGroup(BodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                                                .addComponent(AntePlusBetText3, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addGroup(BodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                                .addComponent(AntePlusBetText4, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addComponent(AntePlusBetText5, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                                .addGap(69, 69, 69))
                                                        .addGroup(BodyLayout.createSequentialGroup()
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(18, 18, 18)
                                                                .addGroup(BodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                                        .addComponent(Replay, javax.swing.GroupLayout.DEFAULT_SIZE, 143, Short.MAX_VALUE)
                                                                        .addComponent(Result, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
        );
        BodyLayout.setVerticalGroup(
                BodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(BodyLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(DealerText)
                                .addGap(3, 3, 3)
                                .addGroup(BodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(BodyLayout.createSequentialGroup()
                                                .addGroup(BodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(BodyLayout.createSequentialGroup()
                                                                .addGap(55, 55, 55)
                                                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(BodyLayout.createSequentialGroup()
                                                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                .addGap(1, 1, 1)
                                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(23, 23, 23)
                                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(BodyLayout.createSequentialGroup()
                                                .addGroup(BodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(PlayerText)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(BodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(BodyLayout.createSequentialGroup()
                                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(39, 39, 39)
                                                .addComponent(AntePlusBetText3)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(AntePlusBetText4))
                                        .addGroup(BodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jPanel10, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jPanel8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jPanel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(AntePlusBetText5)
                                .addGap(18, 18, 18)
                                .addGroup(BodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(28, Short.MAX_VALUE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BodyLayout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Result)
                                .addGap(18, 18, 18)
                                .addComponent(Replay, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(53, 53, 53))
        );

        jPanel1.setBackground(new java.awt.Color(171, 183, 183));

        £50Text.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        £50Text.setForeground(new java.awt.Color(255, 102, 102));
        £50Text.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        £50Text.setText("£50");
        £50Text.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        £50Text.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                £50TextMouseClicked(evt);
            }
        });

        BetText.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        BetText.setForeground(new java.awt.Color(255, 255, 255));
        BetText.setText("  Bet Value: £50");

        £100Text.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        £100Text.setForeground(new java.awt.Color(255, 102, 102));
        £100Text.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        £100Text.setText("£100");
        £100Text.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        £100Text.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                £100TextMouseClicked(evt);
            }
        });

        £500Text.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        £500Text.setForeground(new java.awt.Color(255, 102, 102));
        £500Text.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        £500Text.setText("£500");
        £500Text.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        £500Text.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                £500TextMouseClicked(evt);
            }
        });

        £1000Text.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        £1000Text.setForeground(new java.awt.Color(255, 102, 102));
        £1000Text.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        £1000Text.setText("£1000");
        £1000Text.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        £1000Text.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                £1000TextMouseClicked(evt);
            }
        });

        PairPlusBetText.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        PairPlusBetText.setForeground(new java.awt.Color(255, 255, 255));
        PairPlusBetText.setText("  Pair Plus bet: £0");

        AntePlusBetText.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        AntePlusBetText.setForeground(new java.awt.Color(255, 255, 255));
        AntePlusBetText.setText("  Ante bet: £0");

        WinningsText.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        WinningsText.setForeground(new java.awt.Color(51, 51, 51));
        WinningsText.setText("  Winnings: £0");

        PlayButton.setBackground(new java.awt.Color(171, 183, 183));
        PlayButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        PlayButton.setForeground(new java.awt.Color(153, 153, 153));
        PlayButton.setText("Play");
        PlayButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        PlayButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PlayButtonActionPerformed(evt);
            }
        });

        PlaceBetButton.setBackground(new java.awt.Color(171, 183, 183));
        PlaceBetButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        PlaceBetButton.setForeground(new java.awt.Color(153, 153, 153));
        PlaceBetButton.setText("Place Bet");
        PlaceBetButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        PlaceBetButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PlaceBetButtonActionPerformed(evt);
            }
        });

        FoldButton.setBackground(new java.awt.Color(171, 183, 183));
        FoldButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        FoldButton.setForeground(new java.awt.Color(153, 153, 153));
        FoldButton.setText("Fold");
        FoldButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        FoldButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FoldButtonActionPerformed(evt);
            }
        });

        ClearBetButton.setBackground(new java.awt.Color(171, 183, 183));
        ClearBetButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        ClearBetButton.setForeground(new java.awt.Color(153, 153, 153));
        ClearBetButton.setText("Clear Bet");
        ClearBetButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ClearBetButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClearBetButtonActionPerformed(evt);
            }
        });

        CurrentWinText.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        CurrentWinText.setForeground(new java.awt.Color(51, 51, 51));
        CurrentWinText.setText("  Last Win: £0");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(£50Text, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BetText, javax.swing.GroupLayout.DEFAULT_SIZE, 210, Short.MAX_VALUE)
                        .addComponent(£100Text, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(£500Text, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(PairPlusBetText, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(AntePlusBetText, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(WinningsText, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(£1000Text, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(PlaceBetButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(PlayButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(FoldButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(ClearBetButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addContainerGap())
                        .addComponent(CurrentWinText, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(29, 29, 29)
                                .addComponent(BetText)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(£50Text)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(£100Text)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(£500Text)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(£1000Text)
                                .addGap(18, 18, 18)
                                .addComponent(AntePlusBetText)
                                .addGap(4, 4, 4)
                                .addComponent(PairPlusBetText)
                                .addGap(18, 18, 18)
                                .addComponent(CurrentWinText)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(WinningsText)
                                .addGap(25, 25, 25)
                                .addComponent(ClearBetButton, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(PlaceBetButton, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(PlayButton, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(FoldButton, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(13, 13, 13))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(Body, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addComponent(Hedder, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(60, 60, 60)
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 650, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                                .addGap(61, 61, 61)
                                .addComponent(Body, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addComponent(Hedder, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>

    private void MinimiseMouseClicked(java.awt.event.MouseEvent evt) {

        this.setState(JFrame.ICONIFIED);

    }

    private void CloseMouseClicked(java.awt.event.MouseEvent evt) {

        AllUsers.UpdateFile(player.getUser());
        System.exit(0);

    }

    private void £50TextMouseClicked(java.awt.event.MouseEvent evt) {
        playSelectChipSound();
        player.setCurrentChip(50);
        BetText.setText("  Bet Value: £" + player.getCurrentChip());
    }

    private void £100TextMouseClicked(java.awt.event.MouseEvent evt) {
        playSelectChipSound();
        player.setCurrentChip(100);
        BetText.setText("  Bet Value: £" + player.getCurrentChip());
    }

    private void £500TextMouseClicked(java.awt.event.MouseEvent evt) {
        playSelectChipSound();
        player.setCurrentChip(500);
        BetText.setText("  Bet Value: £" + player.getCurrentChip());
    }

    private void £1000TextMouseClicked(java.awt.event.MouseEvent evt) {
        playSelectChipSound();
        player.setCurrentChip(1000);
        BetText.setText("  Bet Value: £" + player.getCurrentChip());
    }

    private void jLabel12MouseClicked(java.awt.event.MouseEvent evt) {
        // TODO Play:

    }

    private void jLabel13MouseClicked(java.awt.event.MouseEvent evt) {
        playPlaceChipSound();
        // TODO Ante:
        if(jLabel13.isEnabled()){
            if(enoughMoney()){
                player.setBetAmount(player.getBetAmount() + player.getCurrentChip());
                AntePlusBetText.setText("  Ante bet: £" + player.getBetAmount());
            }else{
                //TODO Show "not enough money" Error text
            }
        }
    }

    private void jLabel14MouseClicked(java.awt.event.MouseEvent evt) {
        // TODO PairPlus:
        playPlaceChipSound();
        if(jLabel14.isEnabled()){
            if(enoughMoney()){
                player.setPairBetAmount(player.getPairBetAmount() + player.getCurrentChip());
                PairPlusBetText.setText("  Pair Plus bet: £" + player.getPairBetAmount());
            }else{
                //TODO Show "not enough money" Error text
            }
        }
    }

    private void PlaceBetButtonActionPerformed(java.awt.event.ActionEvent evt) {
        playPlaceButtonChipSound();
        System.out.println("[Class: ThreeCardPoker] PlaceBetButtonActionPerformed() Called");
        int TotalBet = player.getBetAmount() + player.getPairBetAmount();
        int AnteBet = player.getBetAmount();
        int account = player.getUser().getChipBalance();

        if(account - (player.getBetAmount()*2 + player.getPairBetAmount()) < 0){
            //TODO Not Enough Money
        }else {
            if(TotalBet > 0 && AnteBet > 0){
                player.getUser().setChipBalance(account - TotalBet);
                account = player.getUser().getChipBalance();
                BalanceText.setText("  Balance: £" + FormatNumber(account));

                Disable();
                RevealPlayerCards();

                AllUsers.UpdateFile(player.getUser());

            }else {
                //TODO no money bet
            }
        }


    }

    private void ReplayActionPerformed(java.awt.event.ActionEvent evt) {
        playFlipSound();
        PlayerText.setText("Player: ");
        DealerText.setText("Dealer: ");
        Fold = false;
        Replay.setEnabled(false);
        Replay.setVisible(false);
        newHands();
        resetCards();
        Enable();
    }

    private void PlayButtonActionPerformed(java.awt.event.ActionEvent evt) {
        playFlipSound();
        HandText();
        player.getUser().setChipBalance(player.getUser().getChipBalance() - player.getBetAmount());
        BalanceText.setText("  Balance: £" + FormatNumber(player.getUser().getChipBalance()));
        AllUsers.UpdateFile(player.getUser());

        RevealDealerCards();
        PlayButton.setEnabled(false);
        FoldButton.setEnabled(false);
        DealerQualify();

        if(dealer.isQualifies()){
            if ((player.getHand().getHandValue()) > (dealer.getHand().getHandValue())){

                Result.setText("You Win");
                Result.setVisible(true);
                Winnings();

            }else if((player.getHand().getHandValue()) < (dealer.getHand().getHandValue())){

                Result.setText("You Lose");
                Result.setVisible(true);
                Winnings();

            }else if((player.getHand().getHandValue()) == (dealer.getHand().getHandValue())){

                if(player.getHand().getSecondHighestCard() > dealer.getHand().getSecondHighestCard()){
                    Result.setText("You Win");
                    Result.setVisible(true);
                    Winnings();
                }else if(player.getHand().getSecondHighestCard() < dealer.getHand().getSecondHighestCard()){
                    Result.setText("You Lose");
                    Result.setVisible(true);
                    Winnings();
                }else if(player.getHand().getSecondHighestCard() == dealer.getHand().getSecondHighestCard()){

                    if (player.getHand().getLowestCard() > dealer.getHand().getLowestCard()){
                        Result.setText("You Win");
                        Result.setVisible(true);
                        Winnings();
                    }else if (player.getHand().getLowestCard() < dealer.getHand().getLowestCard()){
                        Result.setText("You Lose");
                        Result.setVisible(true);
                        Winnings();
                    }else if (player.getHand().getLowestCard() == dealer.getHand().getLowestCard()){
                        Result.setText("Draw");
                        Result.setVisible(true);
                        Winnings();
                    }
                }

            }
        }else {
            Result.setText("You Win");
            Result.setVisible(true);
            Winnings();

        }

        Replay.setEnabled(true);
        Replay.setVisible(true);

    }

    private void HandText(){
        ArrayList<String> Text = CheckHands();

        PlayerText.setText("Player: "+Text.get(0));
        DealerText.setText("Dealer: "+Text.get(1));
    }

    private void Winnings(){
        DealerQualify();

        int Winnings = player.getHand().getHandValue();
        int pairPlusWins = player.getPairBetAmount();
        int anteWins = player.getBetAmount();
        //int account = player.getUser().getChipBalance();
        int TotalBet = (anteWins*2)+pairPlusWins;

        if(Fold == false){
            if (Winnings <= 12){
                //HIGH CARD
                pairPlusWins = 0;

            }else if (Winnings <= 25){
                //PAIR
                pairPlusWins = pairPlusWins + pairPlusWins*1;

            }else if (Winnings <= 38){
                //FLUSH
                pairPlusWins = pairPlusWins + pairPlusWins*4;

            }else if (Winnings <= 51){
                //STRAIGHT
                pairPlusWins = pairPlusWins + pairPlusWins*6;

            }else if (Winnings <= 64){
                //THREE OF A KIND
                pairPlusWins = pairPlusWins + pairPlusWins*30;

            }else if (Winnings <= 77) {
                //STRAIGHT FLUSH
                pairPlusWins = pairPlusWins + pairPlusWins * 40;
            }

            if(dealer.isQualifies()){
                if(Result.getText().equalsIgnoreCase("You Win")){
                    //playWinChipSound();
                    if (Winnings <= 12){
                        //HIGH CARD
                        anteWins = (int)((anteWins*2 + anteWins*0)*1.15);

                    }else if (Winnings <= 25){
                        //PAIR
                        anteWins = (int)((anteWins*2 + anteWins*0)*1.25);

                    }else if (Winnings <= 38){
                        //FLUSH
                        anteWins = (int)((anteWins*2 + anteWins*0)*1.35);

                    }else if (Winnings <= 51){
                        //STRAIGHT
                        anteWins = (int)((anteWins*2 + anteWins*1)*1.1);

                    }else if (Winnings <= 64){
                        //THREE OF A KIND
                        anteWins = (int)((anteWins*2 + anteWins*4)*1.1);

                    }else if (Winnings <= 77) {
                        //STRAIGHT FLUSH
                        anteWins = (int)((anteWins*2 + anteWins * 5)*1.1);
                    }


                    Winnings = RoundUpNearest50(pairPlusWins + anteWins);
                    int LastWin = Winnings - TotalBet;
                    CurrentWinText.setText("  Last Win: £"+(LastWin));
                    player.getUser().setChipBalance(player.getUser().getChipBalance()+Winnings);
                    BalanceText.setText("  Balance: £" + FormatNumber(player.getUser().getChipBalance()));

                    Winnings = player.getWinnings() + ((LastWin));
                    player.setWinnings(Winnings);
                    WinningsText.setText("  Winnings: £"+Winnings);


                }else if(Result.getText().equalsIgnoreCase("You Lose")){
                    TotalBet = (anteWins*2)+pairPlusWins;

                    Winnings = 0;
                    CurrentWinText.setText("  Last Win: £0");
                    player.getUser().setChipBalance(player.getUser().getChipBalance()+Winnings);
                    BalanceText.setText("  Balance: £" + FormatNumber(player.getUser().getChipBalance()));

                    Winnings = ((0 - TotalBet) + player.getWinnings());
                    player.setWinnings(Winnings);
                    WinningsText.setText("  Winnings: £"+FormatNumber(Winnings));
                }else {
                    CurrentWinText.setText("  Last Win: £0");
                    TotalBet = (anteWins*2)+pairPlusWins;
                    Winnings = TotalBet;
                    player.getUser().setChipBalance(player.getUser().getChipBalance()+Winnings);
                    BalanceText.setText("  Balance: £" + FormatNumber(player.getUser().getChipBalance()));
                }
            }else{
                anteWins = (int)((anteWins*2 + anteWins * 0)*1.1);
                Winnings = RoundUpNearest50(pairPlusWins + anteWins);
                int LastWin = Winnings - TotalBet;
                CurrentWinText.setText("  Last Win: £"+(LastWin));
                player.getUser().setChipBalance(player.getUser().getChipBalance()+Winnings);
                BalanceText.setText("  Balance: £" + FormatNumber(player.getUser().getChipBalance()));

                Winnings = player.getWinnings() + ((LastWin));
                player.setWinnings(Winnings);
                WinningsText.setText("  Winnings: £"+Winnings);
            }

        }else{
            TotalBet = (anteWins) + pairPlusWins;

            Winnings = 0;
            CurrentWinText.setText("  Last Win: £0");
            player.getUser().setChipBalance(player.getUser().getChipBalance()+Winnings);
            BalanceText.setText("  Balance: £" + FormatNumber(player.getUser().getChipBalance()));

            Winnings = ((0 - TotalBet) + player.getWinnings());
            player.setWinnings(Winnings);
            WinningsText.setText("  Winnings: £"+FormatNumber(Winnings));
        }

        AllUsers.UpdateFile(player.getUser());

    }

    private int RoundUpNearest50(int OriginalValue){
        if (OriginalValue <= 0){
            return 0;
        }else{
            return (int)Math.ceil(OriginalValue/50f)*50;
        }

    }

    private void DealerQualify(){
        if (dealer.getHand().getHandValue() < 10){
            dealer.setQualifies(false);
        }else{
            dealer.setQualifies(true);
        }
    }

    private void FoldButtonActionPerformed(java.awt.event.ActionEvent evt) {
        playFlipSound();
        HandText();
        Fold = true;
        RevealDealerCards();
        PlayButton.setEnabled(false);
        FoldButton.setEnabled(false);
        Result.setText("You Lose");
        Result.setVisible(true);
        Winnings();

        Replay.setEnabled(true);
        Replay.setVisible(true);
    }

    private ArrayList<String> CheckHands() {
        ArrayList<String> CheckHands = new ArrayList<>();
        String pHigh = Integer.toString(player.getHand().getHighestCard());
        String dHigh = Integer.toString(dealer.getHand().getHighestCard());
        if (pHigh.equalsIgnoreCase("9")){
            pHigh = "Jack";
        }else if (pHigh.equalsIgnoreCase("10")){
            pHigh = "Queen";
        }else if (pHigh.equalsIgnoreCase("11")){
            pHigh = "King";
        }else if (pHigh.equalsIgnoreCase("12")){
            pHigh = "Ace";
        }else {
            pHigh = Integer.toString(Integer.parseInt(pHigh)+2);
        }

        DealerQualify();
        if(dealer.isQualifies()){
            if (dHigh.equalsIgnoreCase("9")){
                dHigh = "Jack";
            }else if (dHigh.equalsIgnoreCase("10")){
                dHigh = "Queen";
            }else if (dHigh.equalsIgnoreCase("11")){
                dHigh = "King";
            }else if (dHigh.equalsIgnoreCase("12")){
                dHigh = "Ace";
            }else {
                dHigh = Integer.toString(Integer.parseInt(dHigh)+2);
            }
        }else {
            dHigh = "Dealer Doesn't Qualify";
        }

        //if high (<=12)
        if (player.getHand().getHandValue() <= 12) {
            CheckHands.add((pHigh) +" High Card");
        }
        //if pair (<=25)
        else if (player.getHand().getHandValue() <= 25) {
            int pairCard = player.getHand().getPairCard()+2;
            if (pairCard == 11){
                pHigh = "Jack";
            }else if (pairCard == 12){
                pHigh = "Queen";
            }else if (pairCard == 13){
                pHigh = "King";
            }else if (pairCard == 14){
                pHigh = "Ace";
            }else {
                pHigh = Integer.toString(pairCard);
            }

            CheckHands.add("Pair of "+(pHigh)+"'s");
        }
        //elif flush (<=38)
        else if (player.getHand().getHandValue() <= 38) {
            CheckHands.add(pHigh + " high Flush");
        }
        //elif Straight (<=51)
        else if (player.getHand().getHandValue() <= 51) {
            CheckHands.add(pHigh + " high Straight");
        }
        //elif three of a kind (<=64)
        else if (player.getHand().getHandValue() <= 64) {
            CheckHands.add(pHigh + " Three Of a Kind");
        }
        //elif straight flush (<=77)
        else if (player.getHand().getHandValue() <= 77) {
            CheckHands.add(pHigh + " high Straight Flush!");
        }

        if(dHigh.equalsIgnoreCase("Dealer Doesn't Qualify")){
            CheckHands.add(dHigh);
        }else{
            //if high (<=12)
            if (dealer.getHand().getHandValue() <= 12) {
                CheckHands.add(dHigh +" High Card");
            }
            //if pair (<=25)
            else if (dealer.getHand().getHandValue() <= 25) {
                int pairCard = dealer.getHand().getPairCard()+2;
                if (pairCard == 11){
                    dHigh = "Jack";
                }else if (pairCard == 12){
                    dHigh = "Queen";
                }else if (pairCard == 13){
                    dHigh = "King";
                }else if (pairCard == 14){
                    dHigh = "Ace";
                }else {
                    dHigh = Integer.toString(pairCard);
                }

                CheckHands.add("Pair of "+(dHigh)+"'s");
            }
            //elif flush (<=38)
            else if (dealer.getHand().getHandValue() <= 38) {
                CheckHands.add(dHigh + " high Flush");
            }
            //elif Straight (<=51)
            else if (dealer.getHand().getHandValue() <= 51) {
                CheckHands.add(dHigh + " high Straight");
            }
            //elif three of a kind (<=64)
            else if (dealer.getHand().getHandValue() <= 64) {
                CheckHands.add(dHigh + " Three Of a Kind");
            }
            //elif straight flush (<=77)
            else if (dealer.getHand().getHandValue() <= 77) {
                CheckHands.add(dHigh + " high Straight Flush!");
            }
        }

        return CheckHands;
    }

    private void ClearBetButtonActionPerformed(java.awt.event.ActionEvent evt) {
        playClearChipSound();
        player.setBetAmount(0);
        player.setPairBetAmount(0);
        AntePlusBetText.setText("  Ante bet: £" + player.getBetAmount());
        PairPlusBetText.setText("  Pair Plus bet: £" + player.getPairBetAmount());
    }

    private boolean enoughMoney (){
        int TotalBet = player.getBetAmount() + player.getPairBetAmount();
        int account = player.getUser().getChipBalance();

        //If current bet + selected chip is more than account balance then you cant place it.
        if(TotalBet + player.getCurrentChip() > account/2){
            return false;
        }else{
            return true;
        }
    }

    private void Disable(){
        Replay.setEnabled(false);
        Replay.setVisible(false);
        Result.setVisible(false);
        ClearBetButton.setEnabled(false);
        PlaceBetButton.setEnabled(false);
        FoldButton.setEnabled(true);
        PlayButton.setEnabled(true);
        jLabel13.setEnabled(false);
        jLabel14.setEnabled(false);
    }

    private void Enable(){
        Replay.setEnabled(false);
        Replay.setVisible(false);
        Result.setVisible(false);
        ClearBetButton.setEnabled(true);
        PlaceBetButton.setEnabled(true);
        FoldButton.setEnabled(false);
        PlayButton.setEnabled(false);
        jLabel13.setEnabled(true);
        jLabel14.setEnabled(true);
    }

    private void RevealPlayerCards(){
        ArrayList<ImageIcon> images = player.getHand().FlipCards();
        playerCard1.setIcon(images.get(0));
        playerCard2.setIcon(images.get(1));
        playerCard3.setIcon(images.get(2));
    }

    private void RevealDealerCards(){
        ArrayList<ImageIcon> images = dealer.getHand().FlipCards();
        dealerCard1.setIcon(images.get(0));
        dealerCard2.setIcon(images.get(1));
        dealerCard3.setIcon(images.get(2));
    }

    private String FormatNumber(int Num){
        String s = NumberFormat.getIntegerInstance().format(Num);
        return s;
    }

    public void setFlipSound(){
        File file = new File(System.getProperty("user.dir") +"\\src\\Sound\\CardFlip.wav");
        try {
            AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(file);
            Clip clip = AudioSystem.getClip();
            clip.open(audioInputStream);
            FlipSound = clip;
        } catch (UnsupportedAudioFileException e) {
            e.printStackTrace();
        } catch (IOException exception) {
            exception.printStackTrace();
        } catch (LineUnavailableException e) {
            e.printStackTrace();
        }
    }

    public void setWinChipSound(){
        File file = new File(System.getProperty("user.dir") +"\\src\\Sound\\WinChips.wav");
        try {
            AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(file);
            Clip clip = AudioSystem.getClip();
            clip.open(audioInputStream);
            WinChipSound = clip;
        } catch (UnsupportedAudioFileException e) {
            e.printStackTrace();
        } catch (IOException exception) {
            exception.printStackTrace();
        } catch (LineUnavailableException e) {
            e.printStackTrace();
        }
    }

    public void setPlaceChipSounds(){
        File file = new File(System.getProperty("user.dir") +"\\src\\Sound\\PlaceChips1.wav");
        File file2 = new File(System.getProperty("user.dir") +"\\src\\Sound\\PlaceChips2.wav");
        File file3 = new File(System.getProperty("user.dir") +"\\src\\Sound\\PlaceChips3.wav");
        try {
            AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(file);
            Clip clip = AudioSystem.getClip();
            clip.open(audioInputStream);
            PlaceChipSounds.add(clip);
            audioInputStream = AudioSystem.getAudioInputStream(file2);
            clip = AudioSystem.getClip();
            clip.open(audioInputStream);
            PlaceChipSounds.add(clip);
            audioInputStream = AudioSystem.getAudioInputStream(file3);
            clip = AudioSystem.getClip();
            clip.open(audioInputStream);
            PlaceChipSounds.add(clip);
        } catch (UnsupportedAudioFileException e) {
            e.printStackTrace();
        } catch (IOException exception) {
            exception.printStackTrace();
        } catch (LineUnavailableException e) {
            e.printStackTrace();
        }
    }

    public void setSelectChipSound(){
        File file = new File(System.getProperty("user.dir") +"\\src\\Sound\\SelectChip.wav");
        try {
            AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(file);
            Clip clip = AudioSystem.getClip();
            clip.open(audioInputStream);
            SelectChipSound = clip;
        } catch (UnsupportedAudioFileException e) {
            e.printStackTrace();
        } catch (IOException exception) {
            exception.printStackTrace();
        } catch (LineUnavailableException e) {
            e.printStackTrace();
        }
    }

    public void setPlaceButtonChipSound(){
        File file = new File(System.getProperty("user.dir") +"\\src\\Sound\\PlaceButtonSound.wav");
        try {
            AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(file);
            Clip clip = AudioSystem.getClip();
            clip.open(audioInputStream);
            PlaceButtonSound = clip;
        } catch (UnsupportedAudioFileException e) {
            e.printStackTrace();
        } catch (IOException exception) {
            exception.printStackTrace();
        } catch (LineUnavailableException e) {
            e.printStackTrace();
        }
    }

    public void setClearChipSound(){
        File file = new File(System.getProperty("user.dir") +"\\src\\Sound\\ChipClear.wav");
        try {
            AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(file);
            Clip clip = AudioSystem.getClip();
            clip.open(audioInputStream);
            ChipClear = clip;
        } catch (UnsupportedAudioFileException e) {
            e.printStackTrace();
        } catch (IOException exception) {
            exception.printStackTrace();
        } catch (LineUnavailableException e) {
            e.printStackTrace();
        }
    }

    public void playPlaceChipSound(){
        Random r = new Random();
        for (int i=0; i<PlaceChipSounds.size(); i++){
            PlaceChipSounds.get(i).stop();
            PlaceChipSounds.get(i).setMicrosecondPosition(0);
        }
        PlaceChipSounds.get(r.nextInt(PlaceChipSounds.size())).start();
    }

    public void playSelectChipSound(){
        SelectChipSound.stop();
        SelectChipSound.setMicrosecondPosition(0);
        SelectChipSound.start();
    }

    public void playWinChipSound(){
        WinChipSound.stop();
        WinChipSound.setMicrosecondPosition(0);
        WinChipSound.start();
    }

    public void playFlipSound(){
        FlipSound.stop();
        FlipSound.setMicrosecondPosition(0);
        FlipSound.start();
    }

    public void playPlaceButtonChipSound(){
        PlaceButtonSound.stop();
        PlaceButtonSound.setMicrosecondPosition(0);
        PlaceButtonSound.start();
    }

    public void playClearChipSound(){
        ChipClear.stop();
        ChipClear.setMicrosecondPosition(0);
        ChipClear.start();
    }

    private void MainMenuMouseClicked(java.awt.event.MouseEvent evt) {
        AllUsers.UpdateFile(player.getUser());
        this.setState(JFrame.ICONIFIED);
        GameMenu Gm = new GameMenu();
        Gm.setVisible(true);
        this.dispose();
    }

    private void RulesMouseClicked(java.awt.event.MouseEvent evt) {
        rules.setEnabled(true);
        rules.setVisible(true);
    }

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
            java.util.logging.Logger.getLogger(ThreeCardPoker.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ThreeCardPoker.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ThreeCardPoker.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ThreeCardPoker.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ThreeCardPoker().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify
    private javax.swing.JLabel AntePlusBetText;
    private javax.swing.JLabel AntePlusBetText3;
    private javax.swing.JLabel AntePlusBetText4;
    private javax.swing.JLabel AntePlusBetText5;
    private javax.swing.JLabel BalanceText;
    private javax.swing.JLabel BetText;
    private javax.swing.JPanel Body;
    private javax.swing.JButton ClearBetButton;
    private javax.swing.JLabel Close;
    private javax.swing.JLabel CurrentWinText;
    private javax.swing.JLabel DealerText;
    private javax.swing.JButton FoldButton;
    private javax.swing.JPanel Hedder;
    private javax.swing.JLabel MainMenu;
    private javax.swing.JLabel Minimise;
    private javax.swing.JLabel PairPlusBetText;
    private javax.swing.JButton PlaceBetButton;
    private javax.swing.JButton PlayButton;
    private javax.swing.JLabel PlayerText;
    private javax.swing.JButton Replay;
    private javax.swing.JLabel Result;
    private javax.swing.JLabel Rules;
    private javax.swing.JLabel WinningsText;
    private javax.swing.JLabel dealerCard1;
    private javax.swing.JLabel dealerCard2;
    private javax.swing.JLabel dealerCard3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JLabel playerCard1;
    private javax.swing.JLabel playerCard2;
    private javax.swing.JLabel playerCard3;
    private javax.swing.JLabel £1000Text;
    private javax.swing.JLabel £100Text;
    private javax.swing.JLabel £500Text;
    private javax.swing.JLabel £50Text;
    // End of variables declaration
}

