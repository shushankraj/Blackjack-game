/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package blackjackgame;

/**
 *
 * @author desta
 */
public class Player {
    private String name;
    private final Hand hand;

    //Initialize player
    public Player(String name) {
        this.name = name;
        this.hand = new Hand();
    }

    //Player action to hit (add a card)
    public void hit(Card card) {
        hand.addCard(card);
    }

    //Player action to stand
    public void stand() {
        System.out.println(name + " stands.");
    }

    public boolean checkBust() {
        return hand.isBust();
    }

    //Total value of player hand
    public int getHandTotal() {
        return hand.calculateTotal();
    }

    public String getName() {
        return name;
    }

    //Returns players hand
    public Hand getHand() {
        return hand;  
    }

    @Override
    public String toString() {
        return hand.toString();
    }
}


