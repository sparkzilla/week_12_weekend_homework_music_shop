import StockItem.Piano;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class PianoTest {

    Piano piano;

    @Before
    public void before(){
        piano = new Piano("Bosendorfer", "Supreme", "black", "Piano", 3000, 10000, false, "Grand");

    }

    @Test
            public void canGetPianoType() {
        assertEquals("Grand", piano.getPianoType());
    }

    @Test
    public void canMakeSound(){
        assertEquals("Tinkle, tinkle!", piano.makeSound());
    }

    @Test
    public void canCalculateMarkup(){
        Assert.assertEquals(7000, piano.calculateMarkup(), 0.00);
    }
}
