package Card;

import ThreeCardPoker.ThreeCardPoker;

import javax.swing.*;
import java.awt.*;

public class Card {

    private ImageIcon image;
    private ImageIcon backImage;
    private String Suit;
    private String Face;
    private static String folderDirectory = System.getProperty("user.dir") + "\\src\\images\\";

    public ImageIcon getBackImage() {
        return backImage;
    }

    public Card(String suit, String face) {
        Suit = suit;
        Face = face;

        String fileName;
        if(getFace().equalsIgnoreCase("joker")){
            fileName = suit+"_"+face+".png";
        }else{
            fileName = face+"_of_"+suit+".png";
        }
        image = new javax.swing.ImageIcon(getClass().getResource("/images/"+fileName));
        backImage = new javax.swing.ImageIcon(getClass().getResource("/images/BackOfCard.png"));
        //image = new ImageIcon("/images/"+fileName);
        //backImage = new ImageIcon("/images/BackOfCard.png");

        image = ScaleImage(image);
        backImage = ScaleImage(backImage);
    }

    private ImageIcon ScaleImage(ImageIcon I){
        Image img = I.getImage();
        Image imgScale = img.getScaledInstance(125,182, Image.SCALE_SMOOTH);
        ImageIcon scaledImage = new ImageIcon(imgScale);

        return scaledImage;
    }

    public int getFaceValue(){
        System.out.println("[Class: Card] getFaceValue() Called");

        try {
            if (Integer.parseInt(Face) >= 2 && Integer.parseInt(Face) <= 10) {
                return Integer.parseInt(Face) - 2;
            }
        }catch(NumberFormatException e) {
            if (Face.equalsIgnoreCase("jack")) {
                return 9;
            } else if (Face.equalsIgnoreCase("queen")) {
                return 10;
            } else if (Face.equalsIgnoreCase("king")) {
                return 11;
            } else {
                //else its an ace
                return 12;
            }
        }
        return -1;
    }

    public ImageIcon getImage() {
        System.out.println("[Class: Card] getImage() Called");
        return image;
    }

    public String getSuit() {
        System.out.println("[Class: Card] getSuit() Called");
        return Suit;
    }

    public String getFace() {
        //System.out.println("[Class: Card] getFace() Called");
        return Face;
    }
}
