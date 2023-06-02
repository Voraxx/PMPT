package pmpt_kap10_objekten_arbeiten_methoden;

/**
 * In dieser Klasse wird ein Kampf zwischen zwei Krieger*innen simuliert.
 */
public class RollenspielSimulation {
  public static void main(String[] args) {

    // Zwei Krieger*innen und einen Würfel initialisieren
    KriegerIn leia = new KriegerIn();
    KriegerIn hubert = new KriegerIn();
    leia.initialisieren("Leia", 8, 6, 4);
    hubert.initialisieren("Hubert", 6, 8, 5);
    Wuerfel wuerfel = new Wuerfel();
    wuerfel.initialsieren(20);

    // Die Rollen für Angriff und Verteidigung wechseln, daher zwei zusätzliche Variable.
    KriegerIn kriegerInAngriff = leia;
    KriegerIn kriegerInVerteidihung = hubert;

    // Es wird so lange gekämpft, bis eine*r bewusstlos ist
    while (!kriegerInAngriff.istBewusstlos() && !kriegerInVerteidihung.istBewusstlos()) {
      int wurfAngriff = wuerfel.wuerfeln();
      int wurfVerteidigung = wuerfel.wuerfeln();
      // Schaden wird genommen, wenn der Angriff erfolgreich ist, die Verteidigung nicht
      if (kriegerInAngriff.angreifen(wurfAngriff) && !kriegerInVerteidihung.verteidigen(wurfVerteidigung)) {
        System.out.println("Angriff von " + kriegerInAngriff.name + " auf " + kriegerInVerteidihung.name + " erfolgreich");
        kriegerInVerteidihung.lebenspunkte --;
        System.out.println("Verbleibende Lebenspunkte von " + kriegerInVerteidihung.name + ": " + kriegerInVerteidihung.lebenspunkte);
      } else {
        System.out.println("Angriff von " + kriegerInAngriff.name + " auf " + kriegerInVerteidihung.name + " " +
                "nicht erfolgreich");
      }

      if (kriegerInAngriff == leia) {
        kriegerInAngriff = hubert;
        kriegerInVerteidihung = leia;
      } else {
        kriegerInAngriff = leia;
        kriegerInVerteidihung = hubert;
      }
    }
  }
}
