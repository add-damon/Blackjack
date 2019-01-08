package p1;

import java.util.ArrayList;

public class Dealer {
    private ArrayList<Card> cards;
    
    public Dealer(){
        cards = new ArrayList<Card>();
    }
    
    /**
     * Clear's the dealer's hand.
     */
    public void clear() {
        cards.clear();
    }
    /**
     * Dealer hits.
     * @param deck
     */
    public void hit(Deck deck) {
        cards.add(deck.deal());
        
    }
    /**
     * Determines if the dealer busts.
     * @return status boolean
     */
    public boolean bust() {
        boolean status = false;
        int value = 0;
        
        for (Card c: cards) {
            value += c.getValue();
        }
        
        if(value > 21) {
            status = true;
        }
        
        return status;
    }
}
