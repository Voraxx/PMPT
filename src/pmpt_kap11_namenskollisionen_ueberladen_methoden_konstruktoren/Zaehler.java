package pmpt_kap11_namenskollisionen_ueberladen_methoden_konstruktoren;

public class Zaehler {
    int zaehlerstand;

    void erhoehen(boolean wahrheitswert, int ganzzahl) {
        if (wahrheitswert) {
            zaehlerstand += ganzzahl;
        }
    }

    void erhoehen(boolean wahrheitswert) {
        if (wahrheitswert) {
            zaehlerstand += 1;
        }
    }

    public static void main(String[] args) {
        Zaehler zaehler = new Zaehler();
        zaehler.erhoehen(false, 5);
        zaehler.erhoehen(true);
    }
}
