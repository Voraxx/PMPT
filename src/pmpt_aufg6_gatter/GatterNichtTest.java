package pmpt_aufg6_gatter;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class GatterNichtTest {
    /**
     * Test 01 der Methode toString() mit false als Input.
     */
    @Test
    public void testToString01(){
        Gatter eingang = new Eingang(false);
        Gatter schaltung = new GatterNicht(eingang);
        assertEquals("(NICHT FALSCH)", schaltung.toString());
    }

    /**
     * Test 02 der Methode toString() mit true als Input.
     */
    @Test
    public void testToString02(){
        Gatter eingang = new Eingang(true);
        Gatter schaltung = new GatterNicht(eingang);
        assertEquals("(NICHT WAHR)", schaltung.toString());
    }

    /**
     * Test 01 der Methode getOutput() mit false als Input.
     */
    @Test
    public void testGetOutput01(){
        Gatter eingang = new Eingang(false);
        Gatter schaltung = new GatterNicht(eingang);
        assertTrue(schaltung.getOutput());
    }

    /**
     * Test 02 der Methode getOutput() mit true als Input.
     */
    @Test
    public void testGetOutput02(){
        Gatter eingang = new Eingang(true);
        Gatter schaltung = new GatterNicht(eingang);
        assertFalse(schaltung.getOutput());
    }
}
