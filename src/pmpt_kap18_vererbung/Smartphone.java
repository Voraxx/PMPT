package pmpt_kap18_vererbung;

/**
 * Ein Smartphone ist ein Computer mit nicht ganz so viel Rechenpower, kann Ergebnisse  aber
 * direkt in Augmented Reality darstellen.
 */
public class Smartphone extends Computer {
  public Smartphone() {
    super("Smartphone");
  }

  public void ausgeben(String text) {
    System.out.println("AR-Ausgabe (Text wird direkt über Kamerabild gelegt): " + text);
  }

  public void berechnen(String aufgabe) {
    ausgeben("Das " + getTyp() + " lässt die Cloud die Aufgabe " + aufgabe + " lösen.");
  }
}
