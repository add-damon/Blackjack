package p1;

import java.util.ArrayList;

public class Player {
    private ArrayList<Card> cardOnHands;
    
    /**
     * 
     */
    public Player() {
        cardOnHands = new ArrayList<Card>();
    }
    
    /**
     * 
     */
    public void stand() {
        return;
    }
    
    /**
     * Draws a Card to this player from the deck.
     * @param d
     */
    public void hit(Deck d) {
        cardOnHands.add(d.deal());
    }
    
    /**
     * Returns the value of cards on this player's hand.
     * @return total value of cards.
     */
    public int getTotalValue() {
        if (cardOnHands.isEmpty()) {
            return 0;
        } else {
            int total = 0;
            for (Card c : cardOnHands) {
                total += c.getValue();
            }
            return total;
        }
    }
    
    /**
     * Clears all cards on this player.
     */
    public void emptyCardsOnHand() {
        cardOnHands.clear();
    }
    
    /**
     * Returns a concatenation of cards on this player.
     * @return String.
     */
    @Override
    public String toString() {
        String result = "";
        for (Card c : cardOnHands) {
            result += c + "\n";
        }
        return result;
    }

}
