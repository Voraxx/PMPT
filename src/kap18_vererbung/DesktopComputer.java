package kap18_vererbung;

/**
 * Ein Desktop-Computer hat mächtig Rechenpower und einen ordentlichen Bildschirm.
 */
public class DesktopComputer extends Computer {

  public DesktopComputer() {
    super("Desktop-Computer");
  }

  public void ausgeben(String text) {
    System.out.println("Ausgabe in HDTV: " + text);
  }

  public void berechnen(String aufgabe) {
    ausgeben("Der " + getTyp() + " löst superschnell die Aufgabe " + aufgabe);
  }
}