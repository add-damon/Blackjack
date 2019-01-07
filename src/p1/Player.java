package p1;

import java.util.ArrayList;

public class Player {
    private ArrayList<Card> cardOnHands;
    
    public Player() {
        cardOnHands = new ArrayList<Card>();
    }
    
    public void stand() {
        return;
    }
    
    public void hit(Deck d) {
        cardOnHands.add(d.deal());
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
