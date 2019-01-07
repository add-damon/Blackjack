
package p1;

import java.util.ArrayList;
<<<<<<< HEAD
=======
import java.util.Collections;
>>>>>>> 2fae3095b1f8563eb86bc1540ac9d93e14c8943b
import java.util.Random;

public class Deck {
    
    /** Number of cards in this deck. */
    private final int numOfCardsInADeck = 52;
    /** Number of cards in this deck. */
    private final int numOfSuits = 4;
    /** Number of cards in this deck. */
    private final int numOfRanks = 13;
    /** An array list represents this deck. */
    private ArrayList<Card> deck;
    private ArrayList<Card> shuffleDeck;
    
    public Deck () {
        deck = new ArrayList<Card>();
        for (int suitIndex = 0; suitIndex < numOfSuits; suitIndex++) {
            for (int rankIndex = 0; rankIndex < numOfRanks; rankIndex++) {
                deck.add(new Card(suitIndex, rankIndex));
            }
        }
        shuffle();
    }
    
<<<<<<< HEAD
//    public Card deal() {
//        
//    }
    /**
     * Shuffles the deck.
     */
    public void shuffle() {
        Random random = new Random();
        random.nextInt(51);
=======
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
>>>>>>> 2fae3095b1f8563eb86bc1540ac9d93e14c8943b
    }
    
    /**
     * Deals the first Card in this Deck.
     * @return Card.
     */
    public Card deal() {
        return deck.remove(0);
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
