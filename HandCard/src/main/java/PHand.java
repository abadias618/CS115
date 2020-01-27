/**
 * Base interface used to manage cards held by a player.
 * 
 * @author Jared N. Plumb
 * @version 1.0
 * @since 2018-05-25
 */
public interface PHand {

	/** Returns the number of cards in the hand. */
	public int getSize();

	/** Adds a card to the end of the hand. */
	public void addCard(PCard card);

	/** Returns a card from the hand (but not removed). */
	public PCard getCard(int index);

	/** Removes and returns the card */
	public PCard removeCard(int index);

	/** Returns the point value of the current hand. */
	public int getValue();
}
