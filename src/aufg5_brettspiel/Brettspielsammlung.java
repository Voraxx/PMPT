package aufg5_brettspiel;

public class Brettspielsammlung {
    private Brettspiel[] brettspielArray;
    private int arrayLaenge = 0;
    private int anzahlBrettspiele = 0;
    private final int index = 0;

    /**
     * Brettspielsammlung - Konstruktor
     * Wenn ein Objekt der Klasse Brettspielsammlung initiiert wird,
     * wird ein neuer Brettspiel[]-Array mit einer festgelegten arrayLaenge erstellt.
     */
    public Brettspielsammlung(){
        brettspielArray = new Brettspiel[this.arrayLaenge];
    }


    /**
     * Einfügen eines weiteren Brettspiels, Arraygröße verdoppeln falls notwendig.
     * Es ist nicht erlaubt, null hinzuzufügen.
     * @param brettspiel
     */
    public void hinzufuegen(Brettspiel brettspiel){

        // brettspielArray.length in arrayLaenge speichern
        arrayLaenge = brettspielArray.length;

        // Haben wir eine Brettspielsammlung mit brettspielArray?
        if(brettspielArray != null){
            // Ist der Array voll?
            if(anzahlBrettspiele == arrayLaenge){
                // Passe die arrayLaenge an.
                if(arrayLaenge == 0){
                    arrayLaenge++;
                    //Test.tracing("Arraylänge verdoppelt! Länge = " + arrayLaenge);
                } else {
                    arrayLaenge *= 2;
                }

                // Neuen Array mit doppelter Länge erstellen und
                // Elemente im brettspielArray auf tmpArray übertragen
                Brettspiel[] tmpArray = new Brettspiel[arrayLaenge];


                // Anschließend Variable neu setzen
                brettspielArray = tmpArray;
            }

            anzahlBrettspiele++;
            System.out.println("Anzahl Spiele in der Sammlung: " + anzahlBrettspiele);

        } else if (brettspielArray == null){
            // HIER FEHLT NOCH WAS
        }
    }


    /**
     * Entfernen des angegebenen Brettspiels aus der Sammlung.
     * Alle dahinter liegenden Brettspiele rutschen ein Fach nach vorne.
     * Es passiert nichts, wenn das Brettspiel nicht in der Sammlung ist.
     * Arraylänge bleibt gleich.
     * @param brettspiel
     */
    public void entfernen(Brettspiel brettspiel){
        int index = 0;
        if(this.brettspielArray != null){
            for (Brettspiel brettspielAnIndex : this.brettspielArray){
                index++;
                if(brettspiel == brettspielAnIndex){
                    System.out.println(index + "HALLO");
                }
            }
        }
        this.anzahlBrettspiele--;
    }


    /**
     * Alle Brettspiele aus der Sammlung entfernen. Arraylänge bleibt gleich.
     */
    public void leeren(){

        this.anzahlBrettspiele = 0;
    }


    /**
     * Alle Brettspiele in der Sammlung auf der Konsole ausgeben.
     */
    public void ausgeben(){
        Brettspiel[] brettspielsammlung = brettspielArray;
        if(brettspielsammlung != null){
            for (int i = 0; i < brettspielsammlung.length; i++){
                if(brettspielArray[i] != null){
                    System.out.println("Titel: " + brettspielArray[i].getBrettspielTitel());
                }
                //System.out.println("Länge: " + brettspielsammlung.length);
            }
        }
        //System.out.println("Anzahl Brettspiele in der Sammlung: " + this.getAnzahlBrettspiele());
    }


    /**
     * Brettspielobjekt am Index i
     * @param i
     * @return
     */
    public Brettspiel getBrettspielAnIndex(int i){
        Brettspiel[] brettspielsammlung = brettspielArray;
        Brettspiel brettspiel = brettspielsammlung[i];
        return brettspiel;
    }


    /**
     * Anzahl der Brettspiel-Objekte in der Sammlung
     * @return
     */
    public int getAnzahlBrettspiele(){
        int anzahlBrettspiele = 0;
        for (Brettspiel i : brettspielArray){
            anzahlBrettspiele++;
        }
        //Test.tracing(anzahlBrettspiele);
        return anzahlBrettspiele;
    }


    public int getIndexFuer(Brettspiel brettspiel){

        return index;
    }
}
