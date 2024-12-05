/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package blackjackgame;

/**
 *
 * @author desta
 */
import java.util.ArrayList;
import java.util.List;

public class Hand {
    private final List<Card> cardsInHand;

    public Hand() {
        cardsInHand = new ArrayList<>();
    }

    //Add card to hand
    public void addCard(Card card) {
        cardsInHand.add(card);
    }
    
    //Get number of cards in hand
    public int size() {
        return cardsInHand.size();  // Returns the number of cards in the hand
    }

    //Calculate the total value of the cards in the hand
    public int calculateTotal() {
        int total = 0;
        int aceCount = 0;

        //Loop through each card in hand
        for (Card card : cardsInHand) {
            total += card.getValue();
            //Checks rank to add to ace total
            if (card.getRank() == Card.Rank.ACE) {
                aceCount++;
            }
        }

        //Adjusts hand total if hand with ace exceeds 21 (makes ace 11 or 1)
        while (total > 21 && aceCount > 0) {
            total -= 10;
            aceCount--;
        }

        return total;
    }

    //Checks if hand is bust
    public boolean isBust() {
        return calculateTotal() > 21;
    }
    
    //Return cards in hand as a list
    public List<Card> getCardsInHand() {
        return cardsInHand; // Returns the list of cards in hand
    }
    
    @Override
    public String toString() {
        return cardsInHand.toString();
    }
}

