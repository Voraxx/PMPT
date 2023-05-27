package playground;

public interface Vermoegenswert {
    int RISIKO_NIEDRIG = 0;
    int RISIKO_MITTEL = 1;
    int RISIKO_HOCH = 2;

    String getName();
    double getEuroWert();
    int getRisko();


    static void main(String[] args) {
        // statischer Typ, dynamischer Typ
        Vermoegenswert vermoegenswert = null;

        // Widening (implizit) - Typumwandlung zu Oldtimer
        vermoegenswert = new Oldtimer(25,2000);
        //System.out.println(vermoegenswert.getAlter());


        // Narrowing = Expliziter cast zu Oldtimer
        if(vermoegenswert instanceof Oldtimer oldtimer) {
            System.out.println(oldtimer.getAlter());
        } else {
            System.out.println("Narrowing nicht möglich.");
        }

        System.out.println(vermoegenswert.getName());
        vermoegenswert = new Aktie();
        System.out.println(vermoegenswert.getName());

        System.out.println(vermoegenswert.getEuroWert());

    }



}
