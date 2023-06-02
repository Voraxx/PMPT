package pmpt_aufg5_brettspiel;

public class Brettspiel {
    /**
     * Ein Brettspiel hat einen Titel, eine Spielerzahl-Angabe und ein empfohlenes Mindestalter.
     * Bei den Spielerzahlen gibt man überlicherweise eine minimale und eine maximale Anzahl an (bspw. 1-4).
     * Legen Sie diese Information im Brettspiel-Objekt als ein int-Array mit zwei Elementen ab.
     * Die Klasse soll einen Konstruktor haben, an den alle genannten Informationen übergeben werden.
     * Ergänzen Sie auch je einen Getter.
     * Schreiben Sie außerdem eine Methode ausgeben((), mit der die Information zu dem Brettspiel auf der Konsolte ausgegeben wird.
     */

    private final int[] spieleranzahl;
    private final String brettspielTitel;
    private final int mindestalter;
    private final int fsk = 0;

    /**
     * Brettspiel-Konstruktor.
     * Es werden folgende Parameter benötigt:
     * @param brettspielTitel
     * @param spieleranzahl
     * @param mindestalter
     */
    public Brettspiel(String brettspielTitel, int[] spieleranzahl, int mindestalter){
        this.spieleranzahl = spieleranzahl;
        this.brettspielTitel = brettspielTitel;
        this.mindestalter = mindestalter;
    }

    /**
     * Die ausgeben()-Methode gibt alle Informationen über ein Brettspiel aus:
     * Spieltitel, Spieleranzahl, Mindestalter, FSK
     */
    public void ausgeben(){
        // Gibt den Spieltitel aus.
        System.out.println("Spieltitel: " + this.getBrettspielTitel());

        // Wenn die maximale Spielerzahl gleich der minimalen Spielerzahl ist, wird die minimale Spielerzahl ausgegeben.
        // Ansonsten wird die Spieleranzahl im Format (min bis max) ausgegeben.
        if(this.getSpieleranzahl(0) == this.getSpieleranzahl(1)){
            System.out.println("Spieleranzahl: " + this.getSpieleranzahl(0));
        } else {
            System.out.println("Spieleranzahl: " + this.getSpieleranzahl(0) + " bis " + this.getSpieleranzahl(1));
        }
        // Gibt das empfohlene Mindestalter aus.
        System.out.println("Empfohlenes Mindestalter: " + this.getMindestalter());
    }

    /**
     * Getter und Setter für:
     * spieleranzahl, brettspielTitel, mindestalter und fsk
     */
    public int getSpieleranzahl(int position){
        return spieleranzahl[position];
    }

    public String getBrettspielTitel(){
        System.out.println();
        return brettspielTitel;
    }

    public int getMindestalter(){
        return mindestalter;
    }
}
