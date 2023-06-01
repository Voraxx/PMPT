package kap18_vererbung;

/**
 * Basisklasse für einen Zähler.
 */
public class Zaehler {
  /**
   * Aktueller Wert.
   */
  private int wert = 0;

  /**
   * Wert um 1 erhöhen.
   */
  public void erhoehen() {
    wert++;
  }

  public int getWert() {
    return wert;
  }

  /**
   * Zähler auf 0 zurücksetzen.
   */
  public void reset() {
    wert = 0;
  }

  protected void setWert(int wert) {
    this.wert = wert;
  }
}
