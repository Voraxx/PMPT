package pmpt_kap15_string_junit;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestPerson {

    @Test
    /**
     * Testmethode für den Konstruktor
     */
    public void testKonstruktor() {
        Person p1 = new Person("Mike, Hansen, 32,1.83");
        assertEquals("Mike", p1.getVorname());
        assertEquals("Hansen", p1.getNachname());
        assertEquals(32, p1.getAlter());
        assertEquals(1.83f, p1.getGroesse(), 1e-5);
    }

    @Test
    /**
     * Testmethode für toString()
     */
    public void testToString() {
        Person p1 = new Person("Mike, Hansen, 32,1.83");
        //assertEquals("Mike Hansen (Alter: 32, Größe: 1.83m)", p1.toString());
    }
}
