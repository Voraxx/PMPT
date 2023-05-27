package kap10_objekten_arbeiten_methoden;

public class Bruch {
    int zaehler;
    int nenner;

    void subtrahiereDavon(Bruch andererBruch) {
        this.zaehler = zaehler * andererBruch.nenner - andererBruch.zaehler * nenner;
        this.nenner = nenner * andererBruch.nenner;
    }

    boolean istKleiner(int zaehler, int nenner) {
        return this.zaehler * nenner < zaehler * this.nenner;
    }
}
