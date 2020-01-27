import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SundaeTest {

    @Test
    void calculateItemCost() {
        Sundae sundae=new Sundae("Vanilla Ice Cream", 1.05, "Caramel", 0.50);
        assertEquals(sundae.calculateItemCost(),1.55);
    }
    @Test
    void findSalesTax(){
        Sundae sundae=new Sundae("Vanilla Ice Cream", 1.05, "Caramel", 0.50);
        assertEquals(sundae.findSalesTax(),sundae.tax);
    }
}