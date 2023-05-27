package kap10_objekten_arbeiten_methoden;

/**
 * Ein*e Krieger*in kann angreifen, verteidigen und verfügt über Lebenspunkte. Sind
 * leine Lebenspunkte mehr übrig, dann wird er/sie bewusstlus.
 */
public class KriegerIn {

  /**
   * Name
   */
  String name;

  /**
   * Wert für Angriff aus [1;20], je größer, desto besser.
   */
  int angriff;

  /**
   * Wert für Verteidigung aus [1;20], je größer, desto besser.
   */
  int verteidigung;

  /**
   * Aktuelle Anzahl an Lebenspunkten. <= 0 bedeutet Bewusstlosigkeit
   */
  int lebenspunkte;

  /**
   * Initialisierung des Zustands des Objektes.
   */
  void initialisieren(String name, int angriff, int verteidigung, int lebenspunkte) {
    this.name = name;
    this.angriff = angriff;
    this.verteidigung = verteidigung;
    this.lebenspunkte = lebenspunkte;
  }

  /**
   * Liefert wahr, wenn der Angriff mit dem gegebenen Würfelwurf erfolgreich war.
   */
  boolean angreifen(int wurf) {
    return wurf <= angriff;
  }

  /**
   * Liefert wahr, wenn die Verteidigung mit dem angegebenen Würfelwurf erfolgreich war.
   */
  boolean verteidigen(int wurf) {
    return wurf <= verteidigung;
  }

  /**
   * Liefert wahr, wenn der/die Krieger*in bewusslos ist.
   */
  public boolean istBewusstlos() {
    return lebenspunkte <= 0;
  }
}
