package Game;

import Card.Hand;
import User.User;
import User.AllUsers;

public class Player {

    private User user;
    private int CurrentChip = 50;
    private int BetAmount = 0;
    private int PairBetAmount = 0;
    private int Winnings = 0;
    protected Hand hand;

    public int getPairBetAmount() {
        return PairBetAmount;
    }

    public int getWinnings() {
        return Winnings;
    }

    public void setWinnings(int winnings) {
        Winnings = winnings;
    }

    public void setPairBetAmount(int pairBetAmount) {
        PairBetAmount = pairBetAmount;
    }

    public Player() {
        this.hand = new Hand();
        this.user = AllUsers.readFile().get(AllUsers.getCurrentUser());
    }

    public User getUser() {
        System.out.println("[Class: Player] getUser() Called");
        return user;
    }

    public void setUser(User user) {
        System.out.println("[Class: Player] setUser() Called");
        this.user = user;
    }

    public int getCurrentChip() {
        System.out.println("[Class: Player] getCurrentChip() Called");
        return CurrentChip;
    }

    public void setCurrentChip(int currentChip) {
        System.out.println("[Class: Player] setCurrentChip() Called");
        CurrentChip = currentChip;
    }

    public int getBetAmount() {
        System.out.println("[Class: Player] getBetAmount() Called");
        return BetAmount;
    }

    public void setBetAmount(int betAmount) {
        System.out.println("[Class: Player] setBetAmount() Called");
        BetAmount = betAmount;
    }

    public Hand getHand() {
        System.out.println("[Class: Player] getHand() Called");
        return this.hand;
    }

    public void setHand(Hand hand) {
        System.out.println("[Class: Player] setHand() Called");
        this.hand = hand;
    }
}
