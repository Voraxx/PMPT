package pmpt_kap18_vererbung;

/**
 * Ein Computer kann etwas berechnen und Informationen ausgeben (wenn eine passende Ausgabeeinheit angeschlossen ist).
 */
public class Computer {

  /**
   * Jeder Computer ist von einem Typ
   */
  protected String typ;

  public Computer(String typ) {
    this.typ = typ;
  }

  /**
   * Der Standard-Computer gibt Informationen auf einer Ausgabeeinheit aus - wenn denn eine angeschlossen ist.
   */
  public void ausgeben(String text) {
    // Wir bestimmen mit Zufall, ob eine Ausgabeeinheit angeschlossen ist
    boolean ausgabeeinheitIstAngeschlossen = Math.random() < 0.4;
    System.out.println(ausgabeeinheitIstAngeschlossen ? "[Knatter, knatter] " + text :
            "[Bitte Ausgabeeinheit anschliessen].");
  }

  public void berechnen(String aufgabe) {
    ausgeben("Der " + getTyp() + " löst in endlicher Zeit die Aufgabe " + aufgabe + ".");
  }

  public String getTyp() {
    return typ;
  }
}
