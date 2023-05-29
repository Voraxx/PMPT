package aufg6_gatter;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class BinaeresGatterUndTest {
    /**
     * Test 01 der Methode getOutput() mit true und false als Input.
     */
    @Test
    public void testGetOutput01(){
        Eingang eingangA = new Eingang(true);
        Eingang eingangB = new Eingang(false);
        Gatter schaltung = new BinaeresGatterUnd(eingangA, eingangB);
        assertFalse(schaltung.getOutput());
    }

    /**
     * Test 02 der Methode getOutput() mit false und false als Input.
     */
    @Test
    public void testGetOutput02(){
        Eingang eingangA = new Eingang(false);
        Eingang eingangB = new Eingang(false);
        Gatter schaltung = new BinaeresGatterUnd(eingangA, eingangB);
        assertFalse(schaltung.getOutput());
    }

    /**
     * Test 03 der Methode getOutput() mit true und true als Input.
     */
    @Test
    public void testGetOutput03(){
        Eingang eingangA = new Eingang(true);
        Eingang eingangB = new Eingang(true);
        Gatter schaltung = new BinaeresGatterUnd(eingangA, eingangB);
        assertTrue(schaltung.getOutput());
    }

    /**
     * Test 01 der Methode toString() mit true und false als Input.
     */
    @Test
    public void testToString01(){
        Eingang eingangA = new Eingang(true);
        Eingang eingangB = new Eingang(false);
        Gatter schaltung = new BinaeresGatterUnd(eingangA, eingangB);
        assertEquals("(WAHR UND FALSCH)", schaltung.toString());
    }

    /**
     * Test 02 der Methode toString() mit false und false als Input.
     */
    @Test
    public void testToString02(){
        Gatter eingangA = new Eingang(false);
        Gatter eingangB = new Eingang(false);
        Gatter schaltung = new BinaeresGatterUnd(eingangA, eingangB);
        assertEquals("(FALSCH UND FALSCH)", schaltung.toString());
    }

    /**
     * Test 03 der Methode toString() mit true und true als Input.
     */
    @Test
    public void testToString03(){
        Gatter eingangA = new Eingang(true);
        Gatter eingangB = new Eingang(true);
        Gatter schaltung = new BinaeresGatterUnd(eingangA, eingangB);
        assertEquals("(WAHR UND WAHR)", schaltung.toString());
    }
}
