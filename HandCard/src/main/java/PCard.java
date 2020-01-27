import java.awt.Color;

/**
 * Base class used to create a playing card. This class is extended by another
 * class that overrides the necessary methods to create usability and visual
 * appeal.
 * 
 * @author Jared N. Plumb
 * @version 1.0
 * @since 2018-05-25
 */
public abstract class PCard {

	/**
	 * Returns a string containing both the rank and suit of the card. This text is
	 * used for visual display and may include Unicode characters.
	 */
	public abstract String getText(); // Return a value such as "\u2605"

	/** Sets the card to the face up state. */
	public void showCard() {

	}

	/** Sets the card to the face down state. */
	public void hideCard() {

	}

	/**
	 * Finds if the card if face-down or face-up 
	 * 
	 * @return <b>true</b> if the card if face down.
	 */
	public boolean isHidden() {
		return true;
	}

	/** Returns the color of the font used for the card text. */
	public Color getFontColor() {
		return Color.LIGHT_GRAY;
	}

	/** Returns the color of the cards face. */
	public Color getFaceColor() {
		return Color.BLACK;
	}

	/** Returns the color of the cards background. */
	public Color getBackColor() {
		return Color.BLUE;
	}

	/** Returns the color of an 8 pixel border around the edge of the card. */
	public Color getBorderColor() {
		return Color.LIGHT_GRAY;
	}

	/** Returns the alternative color used on the cards background. */
	public Color getStripeColor() {
		return Color.LIGHT_GRAY;
	}
}
