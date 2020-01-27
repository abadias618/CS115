import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CookieTest {

    @Test
    void calculateItemCost() {
        Cookie cookie=new Cookie("Chocolate Chip Cookies", 4, 3.99);
        assertEquals(cookie.calculateItemCost(),1.33);
    }
    @Test
    void findSalesTax(){
        Cookie cookie=new Cookie("Chocolate Chip Cookies", 4, 3.99);
        assertEquals(cookie.findSalesTax(),cookie.tax);
    }
}