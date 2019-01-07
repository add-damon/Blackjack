
package p1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Deck {
    
    /** Number of cards in this deck. */
    private static final int numOfCardsInADeck = 52;
    /** Number of cards in this deck. */
    private final int numOfSuits = 4;
    /** Number of cards in this deck. */
    private final int numOfRanks = 13;
    /** An array list represents this deck. */
    private ArrayList<Card> deck;
    /** Shuffles Deck.*/
    private ArrayList<Card> shuffleDeck;
    
    int count = 0;
    
    public Deck () {
        deck = new ArrayList<Card>();
        for (int suitIndex = 0; suitIndex < numOfSuits; suitIndex++) {
            for (int rankIndex = 0; rankIndex < numOfRanks; rankIndex++) {
                deck.add(new Card(suitIndex, rankIndex));
            }
        }
        shuffle();
    }
    
//    public Card deal() {
//        
//    }

    /**
     * Swaps the elements in this deck randomly.
     */
    public void shuffle() {
        int i;
        int j;
        Random rand = new Random();
        
        for (int times = 0; times < numOfCardsInADeck; times++ ) {
            i = rand.nextInt(deck.size() - 1);
            j = rand.nextInt(deck.size() - 1);
            Collections.swap(deck, i, j);
        }
    }
    
    /**
     * Deals the first Card in this Deck.
     * @return Card.
     */
    public Card deal() {
        return deck.get(count++);
    }
    /**
     * Resets the game.
     */
    public void resetGame() {
        count = 0;
        shuffle();
    }
    
    /**
     * Returns a concatenation of whatever Card left in this deck.
     * @return String.
     */
    @Override
    public String toString() {
        String result = "";
        for (Card c : deck) {
            result += c + "\n";
        }
        return result;
    }
}
