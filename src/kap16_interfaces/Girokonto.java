package kap16_interfaces;

/**
 * Ein Girokonto ist auch ein Vermögenswert.
 */
public class Girokonto implements Vermoegenswert {
  /**
   * Name der Bank.
   */
  private String bank;

  /**
   * ID (Kontonummer).
   */
  private int kontonummer;

  /**
   * EUR-Betrag.
   */
  private double kontostand;

  @Override
  public String getName() {
    return bank + "(" + kontonummer + ")";
  }

  @Override
  public double getEuroWert() {
    return kontostand;
  }

  @Override
  public int getRisko() {
    return NIEDRIG;
  }

}
