/**
 * 
 */
package p1;

/**
 * A card in a deck of 52 Cards.
 * @author DDD
 * @version 1.0
 */
public class Card {
    /**
     * Array of rank of cards.
     */
    private int[] rankList = {2, 3, 4, 5, 6, 7, 8, 9, 10, 10, 10, 10, 10, 11};
    
    /**
     * Face value of the cards.
     */
    private String[] faceList = {"2", "3", "4", "5", "6", "7", 
            "8", "9", "10", "Jack", "Queen", "King", "Ace"};
    
    /**
     * Array of suits.
     */
    private String[] suitList = {"Spades", "Clubs", "Diamonds", "Hearts"};
    /**
     * Suit of card.
     */
    private String suit;
    /**
     * Rank of card.
     */
    private int rank;
    /**
     * Value of card.
     */
    private int value;
    /**
     * Face of the card.
     */
    private String face;

    /**
     * A card in a 52 card deck.
     * @param suitIndex int
     * @param rankIndex int
     */
    public Card(int suitIndex, int rankIndex) {
        suit = suitList[suitIndex];
        rank = rankList[rankIndex];
        value = rankList[rankIndex];
        face = faceList[rankIndex];
        
    }
    
    
}
