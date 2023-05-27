package aufg6_gatter;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class EingangTest {
    /**
     * Test 01 der Methode toString() mit true als Input.
     */
    @Test
    public void testToString01(){
        Gatter eingang = new Eingang(true);
        assertEquals("WAHR ", eingang.toString());
    }

    /**
     * Test 02 der Methode toString() mit false als Input.
     */
    @Test
    public void testToString02(){
        Gatter eingang = new Eingang(false);
        assertEquals("FALSCH ", eingang.toString());
    }

    /**
     * Test 01 der Methode getOutput() mit true als Input.
     */
    @Test
    public void testGetOutput01(){
        Gatter eingang = new Eingang(true);
        assertTrue(eingang.getOutput());
    }

    /**
     * Test 02 der Methode getOutput() mit false als Input.
     */
    @Test
    public void testGetOutput02(){
        Gatter eingang = new Eingang(false);
        assertFalse(eingang.getOutput());
    }
}
