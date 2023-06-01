package kap19_werte_referenz_object;

public class Bruch {
    private final int zaehler;
    private final int nenner;

    public Bruch(int zaehler, int nenner) {
        this.zaehler = zaehler;
        this.nenner = nenner;
    }

    public int getZaehler() {
        return zaehler;
    }

    public int getNenner() {
        return nenner;
    }
}
