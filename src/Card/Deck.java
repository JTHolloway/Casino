package Card;

import javafx.scene.image.Image;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;

public class Deck {

    private static ArrayList<Card> deck = new ArrayList<Card>();

    public Deck() {
        deck = new ArrayList<Card>();
    }

    public void createDeck(){
        deck.clear();
        this.deck = new ArrayList<Card>();
        System.out.println("[Class: Deck] createDeck() Called");

        String[] Suits = {"hearts","diamonds","spades","clubs"};
        String[] Faces = {"2","3","4","5","6","7","8","9","10","jack","queen","king","ace"};

        for (String s : Suits) {
            for (String f : Faces) {
                this.deck.add(new Card(s, f));
            }
        }
    }

    public void Shuffle(){
        System.out.println("[Class: Deck] Shuffle() Called");

        //Just to make sure it is entirely shuffled I used a loop. Wasn't necessary!
        for (int i = 0; i < 5; i++){
            Collections.shuffle(this.deck);
        }
    }

    public ArrayList<Card> deal(){
        System.out.println("[Class: Deck] deal() Called");

        ArrayList<Card> hand = new ArrayList<Card>();
        if(deck.isEmpty()){
            createDeck();
            Shuffle();
        }
        for (int i = 0; i < 3; i++){
            if (deck.isEmpty()) {
                createDeck();
                Shuffle();
            }
            hand.add(this.deck.get(0));
            this.deck.remove(0);
        }

        return hand;
    }

//    public void empty(){
//        System.out.println("[Class: Deck] empty() Called");
//
//        deck.clear();
//        createDeck();
//        Shuffle();
//    }

}
