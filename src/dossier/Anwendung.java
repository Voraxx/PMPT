package dossier;

public class Anwendung {
    public boolean istOldtimer(Vermoegenswert vermoegenswert){
        return vermoegenswert instanceof Oldtimer;
    }

    public static void main(String[] args) {
        Anwendung anwendung = new Anwendung();
        Vermoegenswert v = new Aktie();
        System.out.println(anwendung.istOldtimer(v));

        v = new Oldtimer(30, 500);
        System.out.println(anwendung.istOldtimer(v));
    }
}
