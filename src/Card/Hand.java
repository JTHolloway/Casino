package Card;

import javax.swing.*;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;

public class Hand {

    private static Deck deck = new Deck();
    private ArrayList<Card> hand = new ArrayList<Card>();

    public Hand() {

    }

    public ArrayList<Card> getHand() {
        return this.hand;
    }

    public void dealNewHand(){
        System.out.println("[Class: Hand] dealNewHand() Called");
        hand = deck.deal();
    }

    public int getHandValue(){
        System.out.println("[Class: Hand] getHandValue() Called");

        int Value;
        //if pair (Worth 13-25)
        if (pair() > -1){
            Value = 13 + pair();
        }
        //elif flush (Worth 26-38)
        else if (flush()){
            Value = 26 + getHighestCard();
        }
        //elif Straight (Worth 39-51)
        else if (straight()){
            Value = 39 + getHighestCard();
        }
        //elif three of a kind (Worth 52-64)
        else if (threeOfAKind()){
            Value = 52 + getHighestCard();
        }
        //elif straight flush (Worth 65-77)
        else if (straightFlush()){
            Value = 65 + getHighestCard();
        }
        //else: high Card - calls getHighestCard()  (Worth 0-12)
        else{
            return getHighestCard();
        }

        return Value;

        //Card value = Card.getFaceValue()


    }

    private int pair(){
        System.out.println("[Class: Hand] pair() Called");

        ArrayList<Integer> Numbers = FaceValues();
        Collections.sort(Numbers);

        if(Numbers.get(0) == Numbers.get(1) && Numbers.get(0) != Numbers.get(2)){  //XXY
            return Numbers.get(0);
        }else if(Numbers.get(1) == Numbers.get(2) && Numbers.get(1) != Numbers.get(0)){ //YXX
            return Numbers.get(1);
        }else{
            return -1;
        }
    }

    public int getPairCard(){
        return pair();
    }

    private boolean flush(){
        System.out.println("[Class: Hand] flush() Called");

        ArrayList<String> Suits = SuitValues();
        ArrayList<Integer> Numbers = FaceValues();
        Collections.sort(Numbers);


        if ((Suits.get(0).equalsIgnoreCase(Suits.get(1)) && Suits.get(0).equalsIgnoreCase(Suits.get(2)))  && !((Numbers.get(0) + 1 == Numbers.get(1)) && (Numbers.get(1) + 1 == Numbers.get(2)))){
            return true;
        }else{
            return false;
        }
    }

    private boolean straight(){
        System.out.println("[Class: Hand] straight() Called");

        ArrayList<String> Suits = SuitValues();
        ArrayList<Integer> Numbers = FaceValues();
        Collections.sort(Numbers);

        if ( ((Numbers.get(0) + 1 == Numbers.get(1)) && (Numbers.get(1) + 1 == Numbers.get(2))) &&
                !(Suits.get(0).equalsIgnoreCase(Suits.get(1)) && Suits.get(0).equalsIgnoreCase(Suits.get(2))) ){
            return true;
        }

        ArrayList<Integer> altNumbers = Numbers;
        for (int i = 0; i < altNumbers.size(); i++){
            if (altNumbers.get(i) == 12){
                altNumbers.set(i, -1);
            }
        }
        Collections.sort(altNumbers);
//        System.out.println(Numbers.toString());
//        System.out.println(altNumbers.toString());

        if(((altNumbers.get(0) + 1 == altNumbers.get(1)) && (altNumbers.get(1) + 1 == altNumbers.get(2))) &&
                !(Suits.get(0).equalsIgnoreCase(Suits.get(1)) && Suits.get(0).equalsIgnoreCase(Suits.get(2))) ){
            return true;
        }

        return false;
    }

    private boolean threeOfAKind(){
        System.out.println("[Class: Hand] threeOfAKind() Called");

        ArrayList<Integer> Numbers = FaceValues();

        if ( Numbers.get(0) == Numbers.get(1) && Numbers.get(0) == Numbers.get(2) ){
            return true;
        }else{
            return false;
        }
    }

    private boolean straightFlush(){
        System.out.println("[Class: Hand] straightFlush() Called");

        ArrayList<String> Suits = SuitValues();
        ArrayList<Integer> Numbers = FaceValues();
        Collections.sort(Numbers);

        if (((Numbers.get(0) + 1 == Numbers.get(1)) && (Numbers.get(1) + 1 == Numbers.get(2)))
                && (Suits.get(0).equalsIgnoreCase(Suits.get(1)) && Suits.get(0).equalsIgnoreCase(Suits.get(2)))){
            return true;
        }

        ArrayList<Integer> altNumbers = Numbers;
        for (int i = 0; i < altNumbers.size(); i++){
            if (altNumbers.get(i) == 12){
                altNumbers.set(i, -1);
            }
        }
        Collections.sort(altNumbers);

        if(((altNumbers.get(0) + 1 == altNumbers.get(1)) && (altNumbers.get(1) + 1 == altNumbers.get(2)))
                && (Suits.get(0).equalsIgnoreCase(Suits.get(1)) && Suits.get(0).equalsIgnoreCase(Suits.get(2)))){
            return true;
        }

        return false;
    }


    private ArrayList<Integer> FaceValues(){
        System.out.println("[Class: Hand] FaceValues() Called");

        ArrayList<Integer> FaceNumbers = new ArrayList<>();
        for (int i = 0; i < 3; i++){
            FaceNumbers.add(hand.get(i).getFaceValue());
        }

        return FaceNumbers;
    }

    private ArrayList<String> SuitValues(){
        System.out.println("[Class: Hand] SuitValues() Called");

        ArrayList<String> HandSuits = new ArrayList<>();
        for (int i = 0; i < 3; i++){
            HandSuits.add(hand.get(i).getSuit());
        }

        return HandSuits;
    }

    public int getHighestCard(){
        System.out.println("[Class: Hand] getHighestCard() Called");

        ArrayList<Integer> Numbers = FaceValues();
        Collections.sort(Numbers);

        return Numbers.get(2);
    }

    public int getSecondHighestCard(){
        System.out.println("[Class: Hand] getSecondHighestCard() Called");

        ArrayList<Integer> Numbers = FaceValues();
        Collections.sort(Numbers);

        return Numbers.get(1);
    }

    public int getLowestCard(){
        System.out.println("[Class: Hand] getLowestCard() Called");

        ArrayList<Integer> Numbers = FaceValues();
        Collections.sort(Numbers);

        return Numbers.get(0);
    }

    public ArrayList<ImageIcon> FlipCards(){
        ArrayList<ImageIcon> images = new ArrayList<>();
        for (int i = 0; i < 3; i++){
            images.add(hand.get(i).getImage());
        }

        return images;
    }

}
