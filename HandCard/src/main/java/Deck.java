import java.util.ArrayList;
import java.util.Collections;

public class Deck implements PDeck{
    ArrayList<PCard> deck= new ArrayList<PCard>();

    /** Randomizes the deck. */
    public void shuffle() {
        Collections.shuffle(deck);
    }

    /** Adds a card to the end of the deck. */
    public void addCard(PCard card) {
        deck.add(card);
    }

    /** Removes a card from the end of the deck. */
    public PCard dealCard() {
        /*PCard dealtCard=deck.get(-0);
        deck.remove(-0);
        return dealtCard;*/
        PCard dealtCard=deck.get((deck.size()-1));
        deck.remove(dealtCard);
        return dealtCard;

    }

    /** Removes a card from the end of the deck and marks it as hidden. */
    public PCard dealHiddenCard() {
        /*PCard cardx=deck.get((deck.size()-1));
        cardx.isHidden();
        return cardx;*/
        PCard cardx=deck.get((deck.size()-1));
        cardx.hideCard();
        deck.remove((deck.size()-1));
        return cardx;
    }

    /** Returns the number of cards in the deck. */
    public int cardCount() {

        return deck.size();
    }
}
