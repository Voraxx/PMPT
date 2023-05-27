package kap14_arrays;

/**
 * Eine Spielkarte hat eine Farbe und einen Wert. Als Farben sind SCHWARZ und WEISS möglich, die Werte gehen von
 * 1 ... 10;
 */
public class Karte {

  /**
   * Konstante zum Beschreiben der schwarzen Karten.
   */
  public static final String SCHWARZ = "SCHWARZ";

  /**
   * Konstante zum Beschreiben der weissen Karten
   */
  public static final String WEISS = "WEISS";

  /**
   * Farbe der Karte (SCHWARZ oder WEISS)
   */
  private final String farbe;

  /**
   * Wert der Karte (1...10)
   */
  private final int wert;

  public Karte(String farbe, int wert) {
    if ( farbe != SCHWARZ && farbe != WEISS){
      throw new IllegalArgumentException("Ungültige Farbe");
    }
    if ( wert < 0 || wert > 10){
      throw new IllegalArgumentException("Ungültiger Wert");
    }
    this.farbe = farbe;
    this.wert = wert;
  }

  /**
   * Sortierungsreihenfolge: die schwarzen karten kommen von der weissen, bei gleicher Farbe entscheidet der Wert
   */
  public boolean istKleinerAls(Karte andere) {
    if (andere == null) {
      return true;
    }
    if (farbe == WEISS && andere.farbe == SCHWARZ) {
      return true;
    } else if (farbe == SCHWARZ && andere.farbe == WEISS) {
      return false;
    } else {
      return wert <= andere.wert;
    }
  }

  /**
   * Gibt die Karte (Farbe + Wert) auf der Konsole aus.
   */
  public void ausgeben() {
    System.out.println(farbe + " " + wert);
  }
}
