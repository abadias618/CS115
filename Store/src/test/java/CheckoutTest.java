import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CheckoutTest {

    @Test
    void add() {
        Checkout checkout=new Checkout();
        checkout.setNumberOfItems(6);
        assertEquals(checkout.getNumberOfItems(),checkout.numberOfItems);
    }
    @Test
    void totalCost() {
        Checkout checkout=new Checkout();
        assertEquals(checkout.totalCost(),checkout.totalCos);
    }
    @Test
    void totalTax(){
        Checkout checkout=new Checkout();
        assertEquals(checkout.totalTax(),checkout.totalTx);
    }
}