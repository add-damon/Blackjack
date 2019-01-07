
package p1;

import java.util.ArrayList;

public class Deck {
    
    private final int numOfCardsInADeck = 52;
    private final int numOfSuits = 4;
    private final int numOfRanks = 13;
    private ArrayList<Card> deck;
    
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
    
    public void shuffle() {
        
    }
    
    
    public String toString() {
        String result = "";
        
        return result;
    }
}
