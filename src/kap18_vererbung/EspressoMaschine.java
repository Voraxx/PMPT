package kap18_vererbung;

public class EspressoMaschine extends KaffeeMaschine {
  /**
   * Macht Kaffee.
   * 
   * @param mengeKaffee
   *          Kaffeepulver in Gramm
   */
  public void kaffeeMachen(int mengeKaffee) {
    System.out.format("Lecker Espresso aus %d Gramm Kaffeepulver.\n",
        mengeKaffee);
  }

  /**
   * Macht Cappuccino.
   * 
   * @param mengeKaffee
   *          Kaffeepulver in Gramm.
   * 
   * @param milchMenge
   *          MilchMenge in Milliliter.
   */
  public void kaffeeMachen(int mengeKaffee, int milchMenge) {
    System.out.format(
        "Lecker Cappuccino aus %d Gramm Kaffeepulver und %d Milliliter Milch machen.\n",
        mengeKaffee, milchMenge);
  }
}
