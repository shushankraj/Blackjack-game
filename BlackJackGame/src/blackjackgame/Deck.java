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
import java.util.Collections;
import java.util.List;

public class Deck {
    //List to hold cards in deck
    private List<Card> cards;

    //Initialize deck
    public Deck() {
        cards = new ArrayList<>();
        for (Card.Suit suit : Card.Suit.values()) {
            for (Card.Rank rank : Card.Rank.values()) {
                cards.add(new Card(rank, suit));
            }
        }
        shuffle();
    }

    //Shuffles cards in the deck
    public void shuffle() {
        Collections.shuffle(cards);
    }

    public Card drawCard() {
        return cards.remove(cards.size() - 1);
    }
}
