import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HandTestSuit {

    @Test
    void numericField(){
        //tests the numeric datafield of a card
        Card card=new Card(1,"diamond");
        assertEquals("A",card.numeric);
    }
    //tests from Hand class
    @Test
    void getSize() {
        Hand hand=new Hand();
        Card card=new Card(1,"diamond");
        hand.addCard(card);
        Card card2=new Card(1,"club");
        hand.addCard(card2);
        assertEquals(2,hand.getSize());
    }

    @Test
    void getValue1() {
        Hand hand=new Hand();
        Card card=new Card(1,"diamond");
        hand.addCard(card);
        assertEquals(11,hand.getValue());
        Card card2=new Card(1,"club");
        hand.addCard(card2);
        assertEquals(12,hand.getValue());
        Card card3=new Card(1,"heart");
        hand.addCard(card3);
        assertEquals(13,hand.getValue());
    }

    @Test
    void getValue2() {
        Hand hand=new Hand();
        Card card=new Card(11,"diamond");
        hand.addCard(card);
        assertEquals(10,hand.getValue());
        Card card2=new Card(12,"club");
        hand.addCard(card2);
        assertEquals(20,hand.getValue());
    }

    @Test
    void getValue4() {
        Hand hand=new Hand();
        Card card=new Card(1,"diamond");
        hand.addCard(card);
        assertEquals(11,hand.getValue());
        Card card2=new Card(1,"club");
        hand.addCard(card2);
        assertEquals(12,hand.getValue());
        Card card3=new Card(1,"spade");
        hand.addCard(card3);
        assertEquals(13,hand.getValue());
        Card card4=new Card(1,"heart");
        hand.addCard(card4);
        assertEquals(14,hand.getValue());
    }

    @Test
    void getValue5() {
        Hand hand=new Hand();
        Card card=new Card(11,"diamond");
        hand.addCard(card);
        assertEquals(10,hand.getValue());
        Card card2=new Card(12,"club");
        hand.addCard(card2);
        assertEquals(20,hand.getValue());
        Card card3=new Card(13,"spade");
        hand.addCard(card3);
        assertEquals(30,hand.getValue());
        Card card4=new Card(14,"heart");
        hand.addCard(card4);
        assertEquals(40,hand.getValue());
    }

    @Test
    void getValue6() {
        Hand hand=new Hand();
        Card card=new Card(6,"diamond");
        hand.addCard(card);
        assertEquals(6,hand.getValue());
        Card card2=new Card(5,"club");
        hand.addCard(card2);
        assertEquals(11,hand.getValue());
        Card card3=new Card(7,"spade");
        hand.addCard(card3);
        assertEquals(18,hand.getValue());
        Card card4=new Card(3,"heart");
        hand.addCard(card4);
        assertEquals(21,hand.getValue());
    }

    @Test
    void addCard() {
        Hand hand = new Hand();
        Card card2=new Card(1,"club");
        hand.addCard(card2);
        assertEquals(1, hand.getSize());


    }

    @Test
    void getCard() {
        Hand hand = new Hand();
        Card card2=new Card(1,"club");
        hand.addCard(card2);
        assertEquals(card2,hand.getCard(0));
    }

    @Test
    void removeCard() {
        Hand hand = new Hand();
        Card card=new Card(11,"diamond");
        hand.addCard(card);
        Card card2=new Card(1,"club");
        hand.addCard(card2);
        //int size = hand.getSize();
        assertEquals(card, hand.removeCard(0));
    }

    @Test
    void getValue() {
        Hand hand=new Hand();
        Card card=new Card(13,"diamond");
        hand.addCard(card);
        Card card2=new Card(1,"club");
        hand.addCard(card2);
        assertEquals(21,hand.getValue());
    }

    //tests from card class

    @Test
    void isHidden() {
        Card card=new Card(1,"club");
        card.hideCard();
        assertEquals(true,card.isHidden());

        Card card2=new Card(1,"club");
        card2.showCard();
        assertEquals(true,card2.isHidden());
    }

    @Test
    void getFontColor() {
        Card card=new Card(1,"club");
        Card card2=new Card(1,"diamond");
        assertEquals(card.getFontColor(),card2.getFontColor());
    }

    @Test
    void getFaceColor() {
        Card card=new Card(1,"club");
        Card card2=new Card(1,"diamond");
        assertEquals(card.getFaceColor(),card2.getFaceColor());
    }

    @Test
    void getBackColor() {
        Card card=new Card(1,"club");
        Card card2=new Card(1,"diamond");
        assertEquals(card.getBackColor(),card2.getBackColor());
    }

    @Test
    void getBorderColor() {
        Card card=new Card(1,"club");
        Card card2=new Card(1,"diamond");
        assertEquals(card.getBorderColor(),card2.getBorderColor());
    }

    @Test
    void getStripeColor() {
        Card card=new Card(1,"club");
        Card card2=new Card(1,"diamond");
        assertEquals(card.getStripeColor(),card2.getStripeColor());
    }

    @Test
    void getText() {
        Card card=new Card(1,"club");
        assertEquals(card.getText(),"A\u2663");
    }
}