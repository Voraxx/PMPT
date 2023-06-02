package pmpt_kap11_namenskollisionen_ueberladen_methoden_konstruktoren;

public class Rasenmaeher {

  /**
   * Inhalt des Tanks (Benzin) in Litern
   */
  float tankinhalt;

  /**
   * Soviel Benzin passt maximal in den Tank.
   */
  float tankvolumen;

  /**
   * Konstruktion eines Rasenmähers mit einem leeren Tank.
   */
  Rasenmaeher(float tankvolumen) {
    this(tankvolumen, 0);
  }

  /**
   * Konstruktion eines Rasenmähers mit einer initialen Tankfüllung
   */
  Rasenmaeher(float tankvolumen, float benzinMenge) {
    this.tankvolumen = tankvolumen;
    this.tankinhalt = benzinMenge;
    if (tankinhalt > tankvolumen) {
      throw new IllegalArgumentException("Initiale Tankbefüllung darf Tankvolumen nicht überschreiten.");
    }
  }

  /**
   * Maehen eine bestimmen flaeche
   */
  void maehen(float flaeche) {
    float verbrauch = berechneVerbrauch(flaeche);
    if (verbrauch > tankinhalt) {
      throw new IllegalArgumentException("Tok, tok ..... toooook. Motor aus.");
    }
    tankinhalt -= verbrauch;
    System.out.println("Fläche von " + flaeche + " m^2 gemäht. Verbrauch: " + verbrauch + " Liter.");
  }

  /**
   * Berechnet den Verbrauch für die angegebene Fläche bei einer Verbrauchsannahme von 0.005l/qm.
   */
  private float berechneVerbrauch(float flaeche) {
    float verbrauchProQm = 0.005f;
    return verbrauchProQm * flaeche;
  }

  public static void main(String[] args) {
    Rasenmaeher rasenmaeher = new Rasenmaeher(2, 1.5f);
    rasenmaeher.maehen(100);
  }
}
