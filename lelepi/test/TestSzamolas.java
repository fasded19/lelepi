import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class TestSzamolas {
    Szamolas szamolas;
    @BeforeEach
    public void init() {
        this.szamolas = new Szamolas();
    }
    @Test
    public void testcalcVolume() {        
        double actual = szamolas.calcVolume(5, 5, 5);
        assertEquals(actual, 125.0, 0.01, "Nem 125-t kaptam");
    }
    @Test
    public void testcalcVolumeSecond() {
        double actual = szamolas.calcVolume(4, 4, 4);
        assertEquals(actual, 64, 0.1, "Nem 64-t kaptam");
    }
    @Test
    public void testCheckInput() {
        boolean actual = szamolas.checkInput("33");
        assertTrue(actual);
    }
    @Test
    public void testCheckInputFloat() {
        boolean actual = szamolas.checkInput("33.5");
        assertTrue(actual);
    }
    @Test 
    public void testCheckInputFalse() {
        boolean actual = szamolas.checkInput("a");
        assertFalse(actual);
    }
    @Test 
    public void testCheckInputSpecial() {
        boolean actual = szamolas.checkInput("@");
        assertFalse(actual);
    }
}
