package kap20_exceptions;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class Funktion {
    public int summe(int a, int b) throws PM1PTException {
        if (b <= 0) {
            throw new PM1PTException(b);
        }
        return a + b;
    }

    public static void main(String[] args) {
        Funktion funktion = new Funktion();

        double x;
        try {
            int ergebnis = funktion.summe(32, 42);
        } catch (PM1PTException e) {
            System.out.println("Exception gefangen: " + e.getMessage());
        }
    }

    @Test
    public void testSumme() {
        Funktion funktion = new Funktion();
        assertThrows(PM1PTException.class, () -> funktion.summe(23, -42));
        try {
            assertEquals(65, funktion.summe(23, 42));
        } catch (PM1PTException e) {
            assertTrue(false, "Test fehlgeschlagen");
        }
    }
}
