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
     * Ordinal rank of card.
     */
    private int ordinal;
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
        ordinal = rankList[rankIndex];
        value = rankList[rankIndex];
        face = faceList[rankIndex];
    }
    /**
     * Gets the suit of the card.
     * @return suit
     */
    public String getSuit() {
        return suit;
    }
    /**
     * Gets the face value of the card.
     * @return face
     */
    public String getFace() {
        return face;
    }
    /**
     * Gets the value of the card.
     * @return value
     */
    public int getValue() {
        return value;
    }
    /**
     * Gets the ordinal value of the card.
     * @return ordinal
     */
    public int getOrdinal() {
        return ordinal;
    }
    /**
     * Returns the card as a string.
     * @return cardString
     */
    public String toString() {
        String cardString = "Card: " + face + " of " + suit 
                + "\nValue:" + value;
        return cardString;
    }
}
