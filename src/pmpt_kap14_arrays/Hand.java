package pmpt_kap14_arrays;

import static pmpt_kap14_arrays.Karte.SCHWARZ;
import static pmpt_kap14_arrays.Karte.WEISS;

/**
 * Eine Hand enthält ein Blatt auf 5 Karten.
 */
public class Hand {

  /**
   * Die Karten werden als Array repräsentiert
   */
  private Karte[] karten;

  public Hand() {
    karten = new Karte[5];
  }

  /**
   * 5 Karten auf die Hand nehmen.
   */
  public void aufnehmen(Karte k1, Karte k2, Karte k3, Karte k4, Karte k5) {
    karten[0] = k1;
    karten[1] = k2;
    karten[2] = k3;
    karten[3] = k4;
    karten[4] = k5;
  }

  /**
   * Sortiert die Karten auf der Hand mit Hilfe der istKleinerAls()-Methode der Karten.
   */
  public void sortieren() {
    Karte[] tmp = new Karte[5];
    for (int i = 0; i < 5; i++) {
      int kleinste = 0;
      for (int j = 0; j < 5; j++) {
        if (karten[kleinste] == null || !karten[kleinste].istKleinerAls(karten[j])) {
          kleinste = j;
        }
      }
      tmp[i] = karten[kleinste];
      karten[kleinste] = null;
    }
    karten = tmp;
  }

  /**
   * Gibt die Hand auf der Konsole aus.
   */
  public void ausgeben() {
    for (int i = 0; i < 5; i++) {
      karten[i].ausgeben();
    }
  }

  public static void main(String[] args) {
    Karte k1 = new Karte(WEISS, 5);
    Karte k2 = new Karte(SCHWARZ, 1);
    Karte k3 = new Karte(WEISS, 1);
    Karte k4 = new Karte(SCHWARZ, 7);
    Karte k5 = new Karte(SCHWARZ, 6);
    Hand hand = new Hand();
    hand.aufnehmen(k1, k2, k3, k4, k5);
    hand.ausgeben();
    hand.sortieren();
    System.out.println();
    hand.ausgeben();
  }
}
