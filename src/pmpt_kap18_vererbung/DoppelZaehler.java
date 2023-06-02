package pmpt_kap18_vererbung;

/**
 * Ein DoppelZaehler erhöht seinen Wert immer in Zweierschritten.
 */
public class DoppelZaehler extends Zaehler {

  @Override
  public void erhoehen() {
    super.erhoehen();
    super.erhoehen();
  }

  /**
   * Erhöht den Wert um 2 und liefert sich selbst zurück (Verkettung von
   * Aufrufen möglich).
   * 
   * @return
   */
  public DoppelZaehler doppeltErhoehen() {
    erhoehen();
    return this;
  }

}
