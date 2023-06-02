package pmpt_kap18_vererbung;

/**
 * Ein einfacher Simulator für eine KaffeeMaschine.
 */
public class KaffeeMaschine {

  /**
   * Macht Kaffee
   * 
   * @param mengeKaffee
   *          Kaffeepulver in Gramm.
   */
  public void kaffeeMachen(int mengeKaffee) {
    System.out
        .format("Lecker Kaffee aus %d Gramm Kaffeepulver.\n", mengeKaffee);
  }
}
