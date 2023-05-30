/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package card;
import java.util.Random;
import java.util.Scanner;
/**
 * A class that fills a magic hand of 7 cards with random Card Objects
 * and then asks the user to pick a card and searches the array of cards
 * for the match to the user's card. To be used as starting code in ICE 1
 * @author srinivsi
 * modifier Deep Vitthani
 * Student Number : 991678900
 * Date : 30th May 2023 */
public class CardTrick {
    
    public static void main(String[] args)
    {
        luckyCard[] magicHand = new luckyCard[7];
        Random rnd = new Random();
        Scanner sc = new Scanner(System.in);
        
        for (int i=0; i<magicHand.length; i++)
        {
            luckyCard c = new luckyCard();
            int v1 = rnd.nextInt(13)+1;
            String s1 = luckyCard.SUITS[rnd.nextInt(luckyCard.SUITS.length)];
            c.setValue(v1);
            c.setSuit(s1);
            magicHand[i]=c;
            //c.setValue(insert call to random number generator here)
            //c.setSuit(Card.SUITS[insert call to random number between 0-3 here])
        }
        
        System.out.println("Enter the Card number from 1 to 13: ");
        int i1 = sc.nextInt();
        System.out.println("Enter the card type:(daimonds, hearts, clubs, sprades)");
        String i2 = sc.next();
        
        boolean search = false;
        for(luckyCard card : magicHand){
            if(card.getValue_1() == i1 && card.getSuit_1().equalsIgnoreCase(i2)){
                search = true;
                break;
            }
        }
        
        
        if(search){
            System.out.println("The cars is Found in the magic Hand!");
        }
        else{
            System.out.println("The card is not Found in the magic Hand!");
        }
        //insert code to ask the user for Card value and suit, create their card
        // and search magicHand here
        //Then report the result here
    }
    
}
