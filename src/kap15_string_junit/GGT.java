package kap15_string_junit;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;



public class GGT {
    @Test
    public int ggt(int zahl1, int zahl2) {
        // Sicherstellung, dass beide Zahlen positiv sind
        zahl1 = Math.abs(zahl1);
        zahl2 = Math.abs(zahl2);

        // Algorithmus von Euklid
        int ergebnis = 0;
        if (zahl1 == 0) {
            ergebnis = zahl2;
        } else {
            while (zahl2 != 0) {
                if (zahl1 > zahl2) {
                    zahl1 = zahl1 - zahl2;
                } else {
                    zahl2 = zahl2 - zahl1;
                }
            }
            ergebnis = zahl1;
        }
        return ergebnis;
    }

    @Test
    public void testeGgt(){
        GGT ggt = new GGT();
        assertEquals(3, ggt.ggt(6, 9));
    }
}
