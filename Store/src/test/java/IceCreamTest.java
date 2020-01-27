import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IceCreamTest {

    @Test
    void calculateItemCost() {
        IceCream iceCream=new IceCream("Strawberry Ice Cream", 1.45);
        assertEquals(iceCream.calculateItemCost(),1.45);
    }
    @Test
    void findSalesTax(){
        IceCream iceCream=new IceCream("Strawberry Ice Cream", 1.45);
        assertEquals(iceCream.findSalesTax(),iceCream.tax);
    }
}