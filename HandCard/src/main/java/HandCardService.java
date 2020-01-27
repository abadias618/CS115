import java.awt.*;

/* @author Alberto Abdias Baldiviezo
*@CS115
*/
public class HandCardService {
    public static void main(String[] args) {
        Deck deck=new Deck();
        deck.addCard(new Card(1,"club"));
        deck.addCard(new Card(2,"club"));
        deck.addCard(new Card(3,"club"));
        deck.addCard(new Card(4,"club"));
        deck.addCard(new Card(5,"club"));
        deck.addCard(new Card(6,"club"));
        deck.addCard(new Card(7,"club"));
        deck.addCard(new Card(8,"club"));
        deck.addCard(new Card(9,"club"));
        deck.addCard(new Card(10,"club"));
        deck.addCard(new Card(11,"club"));
        deck.addCard(new Card(12,"club"));
        deck.addCard(new Card(13,"club"));
        deck.addCard(new Card(14,"club"));
        deck.addCard(new Card(1,"heart"));
        deck.addCard(new Card(2,"heart"));
        deck.addCard(new Card(3,"heart"));
        deck.addCard(new Card(4,"heart"));
        deck.addCard(new Card(5,"heart"));
        deck.addCard(new Card(6,"heart"));
        deck.addCard(new Card(7,"heart"));
        deck.addCard(new Card(8,"heart"));
        deck.addCard(new Card(9,"heart"));
        deck.addCard(new Card(10,"heart"));
        deck.addCard(new Card(11,"heart"));
        deck.addCard(new Card(12,"heart"));
        deck.addCard(new Card(13,"heart"));
        deck.addCard(new Card(14,"heart"));
        deck.addCard(new Card(1,"diamond"));
        deck.addCard(new Card(2,"diamond"));
        deck.addCard(new Card(3,"diamond"));
        deck.addCard(new Card(4,"diamond"));
        deck.addCard(new Card(5,"diamond"));
        deck.addCard(new Card(6,"diamond"));
        deck.addCard(new Card(7,"diamond"));
        deck.addCard(new Card(8,"diamond"));
        deck.addCard(new Card(9,"diamond"));
        deck.addCard(new Card(10,"diamond"));
        deck.addCard(new Card(11,"diamond"));
        deck.addCard(new Card(12,"diamond"));
        deck.addCard(new Card(13,"diamond"));
        deck.addCard(new Card(14,"diamond"));
        deck.addCard(new Card(1,"spade"));
        deck.addCard(new Card(2,"spade"));
        deck.addCard(new Card(3,"spade"));
        deck.addCard(new Card(4,"spade"));
        deck.addCard(new Card(5,"spade"));
        deck.addCard(new Card(6,"spade"));
        deck.addCard(new Card(7,"spade"));
        deck.addCard(new Card(8,"spade"));
        deck.addCard(new Card(9,"spade"));
        deck.addCard(new Card(10,"spade"));
        deck.addCard(new Card(11,"spade"));
        deck.addCard(new Card(12,"spade"));
        deck.addCard(new Card(13,"spade"));
        deck.addCard(new Card(14,"spade"));
        //
        Hand handDealer=new Hand();
        Hand handPlayer=new Hand();
        //
        PGame.setBackgroundColor(Color.GRAY);
        PGame.setBannerColor(Color.MAGENTA);
        PGame.setBannerTextColor(Color.GREEN);
        PGame.setButtonColor(Color.ORANGE);
        PGame.setButtonHighlightColor(Color.LIGHT_GRAY);
        PGame.setButtonTextColor(Color.GREEN);
        PGame.setFont("Serif");
        PGame.setStatusTextColor(Color.YELLOW);
        //
        PGame.run(deck,handDealer,handPlayer);
    }
}
