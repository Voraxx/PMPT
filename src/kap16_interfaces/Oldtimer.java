package kap16_interfaces;

/**
 * Repräsentation eines Vermögenswerts vom Typ Oldtimer.
 */
public class Oldtimer implements Vermoegenswert {

  /**
   * Modell-Bezeichnung des Fahrzeugs
   */
  private final String modell;

  /**
   * Adresse des Grundstücks.
   */
  private final double basisPreis;

  /**
   * Alter in Jahren.
   */
  private final int alter;

  /**
   * Konstruktor.
   */
  public Oldtimer(String modell, double basisPreis, int alter) {
    this.modell = modell;
    this.basisPreis = basisPreis;
    this.alter = alter;
  }

  @Override
  public String getName() {
    return modell;
  }

  @Override
  public double getEuroWert() {
    return basisPreis * alter;
  }

  @Override
  public int getRisko() {
    return MITTEL;
  }

}
