
package p1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

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
        shuffle();
    }

    public void shuffle() {
        int i;
        int j;
        Random rand = new Random();
        for (int times = 0; times < numOfCardsInADeck; times++ ) {
            i = rand.nextInt(numOfCardsInADeck);
            j = rand.nextInt(numOfCardsInADeck);
            Collections.swap(deck, i, j);
        }
    }
    
    @Override
    public String toString() {
        String result = "";
        for (Card c : deck) {
            result += c + "\n";
        }
        return result;
    }
}
