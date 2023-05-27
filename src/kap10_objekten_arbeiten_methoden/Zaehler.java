package kap10_objekten_arbeiten_methoden;

public class Zaehler {
    int zaehlerstand;

    void inkrement() {
        zaehlerstand++;
    }

    void erhoehen(boolean wahrheitswert, int ganzzahl) {
        if (wahrheitswert) {
            zaehlerstand += ganzzahl;
        }
    }

    void setWert(int zaehlerstand) {
        this.zaehlerstand = zaehlerstand;
    }

    public static void main(String[] args) {
        Zaehler zaehler = new Zaehler();
        zaehler.inkrement();
    }
}
