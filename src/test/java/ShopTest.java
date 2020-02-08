import StockItem.Guitar;
import StockItem.Piano;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class ShopTest {

    Shop shop;
    Guitar guitar1;
    Guitar guitar2;
    Piano piano1;

    @Before
    public void before(){
        shop = new Shop();
        guitar1 = new Guitar("Yamaha", "Acoustic 12", "Black", "Guitar",
                200.00, 250.00, "Acoustic", 12, true);
        guitar2 = new Guitar("Fender", "Telecaster", "Silver", "Guitar",
                600.00, 800.00, "Electric", 6, true);
        piano1 = new Piano("Bosendorfer", "Supreme", "black", "Piano",
                5000, 10000, false, "Grand");
    }

    @Test
    public void canAddToStock(){
        shop.addItemToStock(guitar1);
        shop.addItemToStock(piano1);
        assertEquals(1, shop.getStock().size());
    }

    @Test
    public void canRemoveFromStock(){
        shop.addItemToStock(guitar1);
        shop.addItemToStock(guitar2);
        shop.removeItemFromStock(guitar1);
        assertEquals(1, shop.getStock().size());
        assertEquals(guitar2, shop.getStock().get(0));
    }

    @Test
    public void canCalculateTotalMarkup(){
        shop.addItemToStock(guitar1);
        shop.addItemToStock(guitar2);
        assertEquals(250, shop.calculateTotalMarkup(), 0.00);

    }
}
