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
     * Get's the value of the hand.
     * @return value of hand.
     */
    public int getHandValue() {
        int value = 0;
        for(Card c: cards) {
            value += c.getValue();
        }
        return value;
    }
    
    /**
     * Determines if the dealer is under 17, needs to stand, gets blackjack
     * or busts.
     * 1 = under 17
     * 2 = stand
     * 3 = blackjack
     * 4 = bust.
     * @return status int
     */
    private int status(Deck deck) {
        int status = 0;
        int value = getHandValue();
        
        if (value < 17) {
            cards.add(deck.deal());
            status = 1;
        } else if (value < 21) {
            
            status = 2;
        } else if (value == 21) {
            //blackjack
            status = 3;
        } else {
            //BUST
            status = 4;
        }
        
        
        return status;
    }

    /**
     * Prints out what is happening.
     * @return printed status.
     */
    public String printStatus() {
        String print = "";
        switch (status()) {
            case 1:
                print = "The dealer hits";
                //WE NEED TO GET THE DEALER TO HIT HERE
                break;
            case 2:
                print = "The dealer stands";
                break;
            case 3:
                print = "The dealer has BlackJack!";
                break;
            case 4:
                print = "The dealer busts! You win!";
                break;
        }
        
        return print;
    }
    
}
