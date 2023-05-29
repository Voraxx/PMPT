package aufg6_gatter;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class SchaltungTest {
    /**
     * Test 01 der Methode toString() mit true und false als Input, komplexe Schaltung.
     */
    @Test
    public void testToString01(){
        Gatter eingangA = new Eingang(true);
        Gatter eingangB = new Eingang(false);
        Gatter nichtA = new GatterNicht(eingangA);
        Gatter oderA = new BinaeresGatterOder(nichtA, eingangA);
        Gatter oderB = new BinaeresGatterOder(nichtA, eingangB);
        Gatter und = new BinaeresGatterUnd(oderA, oderB);
        assertEquals("(((NICHT WAHR) ODER WAHR) UND ((NICHT WAHR) ODER FALSCH))", und.toString());
    }

    /**
     * Test 02 der Methode toString() mit true und true als Input, komplexe Schaltung.
     */
    @Test
    public void testToString02(){
        Gatter eingangA = new Eingang(true);
        Gatter eingangB = new Eingang(true);
        Gatter nichtA = new GatterNicht(eingangA);
        Gatter oderA = new BinaeresGatterOder(nichtA, eingangA);
        Gatter oderB = new BinaeresGatterOder(nichtA, eingangB);
        Gatter und = new BinaeresGatterUnd(oderA, oderB);
        assertEquals("(((NICHT WAHR) ODER WAHR) UND ((NICHT WAHR) ODER WAHR))", und.toString());
    }

    /**
     * Test 03 der Methode toString() mit false und false als Input, komplexe Schaltung.
     */
    @Test
    public void testToString03(){
        Gatter eingangA = new Eingang(false);
        Gatter eingangB = new Eingang(false);
        Gatter nichtA = new GatterNicht(eingangA);
        Gatter oderA = new BinaeresGatterOder(nichtA, eingangA);
        Gatter oderB = new BinaeresGatterOder(nichtA, eingangB);
        Gatter und = new BinaeresGatterUnd(oderA, oderB);
        assertEquals("(((NICHT FALSCH) ODER FALSCH) UND ((NICHT FALSCH) ODER FALSCH))", und.toString());
    }
}
