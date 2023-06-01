package kap17_durchschnaufen;

public class ZahlElement implements Element {
    private int wert;

    public ZahlElement(int wert) {
        this.wert = wert;
    }

    public int getWert() {
        return wert;
    }

    public String element2String() {
        return String.valueOf(wert);
    }
}
