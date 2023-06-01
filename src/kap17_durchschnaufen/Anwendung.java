package kap17_durchschnaufen;

public class Anwendung {

    private ConsListe[] erstelleConsArray(int n) {
        ConsListe[] array = new ConsListe[n];
        for (int i = 0; i < n; i++) {
            array[i] = new ConsListe(new ZahlElement(i));
        }
        return array;
    }

    public static void main(String[] args) {
        Element e1 = new ZahlElement(1);
        ConsListe liste = new ConsListe(e1,
                new ConsListe(new ZahlElement(2),
                        new ConsListe(new ZahlElement(3), null)));
        System.out.println(liste.liste2String());

        ConsListe liste2 = new ConsListe(e1,
                new ConsListe(new TextElement("Hallo"), null));
        System.out.println(liste2.liste2String());

        Anwendung anwendung = new Anwendung();
        ConsListe[] array = anwendung.erstelleConsArray(3);
        System.out.print("[ ");
        for (ConsListe c : array) {
            System.out.print(c.liste2String() + " ");
        }
        System.out.println("]");
    }
}
