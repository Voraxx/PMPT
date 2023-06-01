package kap17_durchschnaufen;

public class ConsListe {
    private Element wert;
    private ConsListe rest;

    public ConsListe(Element wert) {
        this.wert = wert;
        this.rest = null;
    }

    public ConsListe(Element wert, ConsListe consListe) {
        this.wert = wert;
        this.rest = consListe;
    }

    public Element getWert() {
        return wert;
    }

    public ConsListe getRest() {
        return rest;
    }

    public String liste2String() {
        if (rest == null) {
            return wert.element2String();
        }
        return wert.element2String() + " " + rest.liste2String();
    }
}
