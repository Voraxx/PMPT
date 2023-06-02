package pmpt_aufg5_brettspiel;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BrettspielTest {
    @Test
    void testeHinzufuegen(){
        Brettspielsammlung s1 = new Brettspielsammlung();
        Brettspiel b1 = new Brettspiel("Spiel 1", new int[]{1,5}, 16);
        Brettspiel b2 = new Brettspiel("Spiel 2", new int[]{2,2}, 12);
        Brettspiel b3 = new Brettspiel("Spiel 3", new int[]{1,3}, 0);
        Brettspiel b4 = new Brettspiel("Spiel 4", new int[]{1,1}, 6);
        Brettspiel b5 = new Brettspiel("Spiel 5", new int[]{2,5}, 18);

        s1.hinzufuegen(b1);
        assertEquals(1, s1.getAnzahlBrettspiele());
        //assertEquals(1, s1.ge);

    }
}
