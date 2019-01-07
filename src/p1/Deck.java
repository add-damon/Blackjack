
package p1;

import java.util.ArrayList;
import java.util.Random;

public class Deck {
    
    private final int numOfCardsInADeck = 52;
    private final int numOfSuits = 4;
    private final int numOfRanks = 13;
    private ArrayList<Card> deck;
    private ArrayList<Card> shuffleDeck;
    
    public Deck () {
        deck = new ArrayList<Card>();
        for (int suitIndex = 0; suitIndex < numOfSuits; suitIndex++) {
            for (int rankIndex = 0; rankIndex < numOfRanks; rankIndex++) {
                deck.add(new Card(suitIndex, rankIndex));
            }
        }
    }
    
//    public Card deal() {
//        
//    }
    /**
     * Shuffles the deck.
     */
    public void shuffle() {
        Random random = new Random();
        random.nextInt(51);
    }
    
    
    public String toString() {
        String result = "";
        
        return result;
    }
}
