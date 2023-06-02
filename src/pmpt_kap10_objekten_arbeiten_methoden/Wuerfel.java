package pmpt_kap10_objekten_arbeiten_methoden;

/**
 * Mit dieser Klasse werden Würfel repräsentiert mit denen man eine Zufallszahl würfeln kann.
 */
public class Wuerfel {

  int anzahlAugen;

  void initialsieren(int anzahlAugen) {
    this.anzahlAugen = anzahlAugen;
  }

  int wuerfeln() {
    return (int) (Math.random() * anzahlAugen) + 1;
  }
}
