package Game;

import Card.Hand;

public class Dealer {

    protected Hand hand;
    protected boolean Qualifies = false;

    public Dealer() {
        hand = new Hand();
    }

    public Hand getHand() {
        System.out.println("[Class: Dealer] getHand() Called");
        return this.hand;
    }

    public boolean isQualifies() {
        System.out.println("[Class: Dealer] isQualifies() Called");
        return Qualifies;
    }

    public void setQualifies(boolean qualifies) {
        System.out.println("[Class: Dealer] setQualifies() Called");
        Qualifies = qualifies;
    }
}
