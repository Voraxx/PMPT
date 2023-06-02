package pmpt_kap18_vererbung;

/**
 * Eine Smartwatch ist ein spezielles Smartphone, das zusätzlich den Puls messen kann. Die Ausgabe
 * erfolgt über einen winzigen Bildschirm.
 */
public class Smartwatch extends Smartphone {

  public Smartwatch() {
    typ = "Smartwatch";
  }

  /**
   * Misst den Puls der Trägerin und liefert den Wert zurück.
   */
  public int getPuls() {
    return (int) (Math.random() * 80) + 80;
  }

  public void ausgeben(String text) {
    System.out.println("Kaum zu lesen, weil zu klein: " + text);
  }
}
