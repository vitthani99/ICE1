/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package card;

/**
 * A class that models playing card Objects. Cards have 
 * a value (note that Ace = 1, Jack -11, Queen =12, King = 13)
 * A suit (clubs, hearts, spades, diamonds).
 * There are 52 cards in a deck, no jokers.
 * This code is to be used in ICE1. When you create your own branch,
 * add your name as a modifier.
 * @author srinivsi
 */
public class luckyCard {

   private String suit_1; //clubs, spades, diamonds, hearts
   private int value_1;//1-13

   public static final String [] SUITS = {"Hearts", "Diamonds", "Spades", "Clubs"};
    /**
     * @return the suit
     */
    public String getSuit_1() {
        return suit_1;
    }

    /**
     * @param suit the suit to set
     */
    public void setSuit_1(String suit_1) {
        this.suit_1 = suit_1;
    }

    /**
     * @return the value
     */
    public int getValue_1() {
        return value_1;
    }

    /**
     * @param value the value to set
     */
    public void setValue_1(int value_1) {
        this.value_1 = value_1;
    }
   
   
    
}
