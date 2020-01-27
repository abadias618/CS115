import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CandyTest {

    @Test
    void calculateItemCost() {
        Candy candy=new Candy("Gummy Worms", 1.33, 0.89);
        assertEquals(candy.calculateItemCost(),1.1837);
    }
    @Test
    void findSalesTax(){
        Candy candy=new Candy("Gummy Worms", 1.33, 0.89);
        assertEquals(candy.findSalesTax(),candy.tax);
    }
}