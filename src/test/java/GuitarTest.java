import StockItem.Guitar;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuitarTest {

    Guitar guitar;

    @Before
    public void before(){
        guitar = new Guitar("Yamaha", "Acoustic 12", "Black", "Guitar", 200.00, 250.00, "Acoustic", 12, true);
    }

    @Test
    public void hasStrings(){
        assertEquals(12, guitar.getNumberOfStrings());
    }

    @Test
    public void canMakeSound() {
        assertEquals("Strummmmmmmmm!", guitar.makeSound());
    }

    @Test
    public void canCalculateMarkup(){
        assertEquals(50.00, guitar.calculateMarkup(), 0.00);
    }
}
