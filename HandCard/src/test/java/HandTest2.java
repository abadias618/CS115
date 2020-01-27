import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HandTest2 {

    @Test
    void getValue() {
        Hand hand=new Hand();
        Card card=new Card(11,"diamond");
        hand.addCard(card);
        Card card2=new Card(1,"club");
        hand.addCard(card2);
        assertEquals(21,hand.getValue());
    }
}