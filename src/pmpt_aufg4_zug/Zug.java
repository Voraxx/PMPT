package pmpt_aufg4_zug;

public class Zug {
    private Wagen ersterWagen;
    private int anzahlWagen = 0;

    /** Konstruktor, setzt die Referenz auf den ersten Wagen auf null, da er noch keine Wagen hat
     *
     */
    public Zug(){
        this.ersterWagen = null;
        //Wagen.resetCount();
        ZugTesten.tracing(1, "");
    }

    /**
     * Methode zum Anhängen eines neuen Wagens
     * Wenn der Zug noch keinen Wagen hat, wird der Wagen angehängt.
     * Dessen Referenz auf den nachfolgenden Wagen null, da er noch keinen nachfolgenden Wagen hat.
     * Anderenfalls geht eine Schleife durch alle Wagen bis sie keinen Nachfolger mehr findet.
     * Anschließend wird der Wagen als Nachfolger des aktuellen Wagens festgelegt.
     * @param wagen Das Wagen-Object,dass angehängt werden soll.
     */
    public void anhaengen(Wagen wagen) {
        if (ersterWagen == null) {
            this.ersterWagen = wagen;
            //ZugTesten.tracing(3, wagen.getWagenID());
        } else {
            Wagen aktuellerWagen = ersterWagen;
            while (aktuellerWagen.getNachfolger() != null){
                aktuellerWagen = aktuellerWagen.getNachfolger();
            }
            aktuellerWagen.setNachfolger(wagen);
            //ZugTesten.tracing(3, wagen.getWagenID());
        }
        ZugTesten.tracing(3, wagen.getWagenID());
        anzahlWagen++;
        ZugTesten.tracing(anzahlWagen);
    }

    /**
     * Methode zum Abhängen eines Wagens
     * In dieser Methode wird zuerst geprüft, ob ersterWagen abgehängt werden soll.
     * Der folgende Wagen wird zu ersterWagen und die Referenz von ersterWagen auf den folgenden Wagen wird null.
     * Wenn ein anderer Wagen abgehängt werden soll, wird der Wagen mittels Schleife gesucht.
     * Anschließend wird der gesuchte Wagen abgehängt.
     * Die anzahlWagen wird um 1 verringert.
     * @param wagen Das Wagen-Objekt, dass abgehängt werden soll.
     * @return Gibt einen Boolean zurück.
     * True: abhängen hat funktioniert.
     * False: abhängen hat nicht funktioniert.
     */
    public boolean abhaengen(Wagen wagen) {
        Wagen aktuellerWagen;

        // Kein Wagen am Zug
        if (ersterWagen == null){
            ZugTesten.tracing(anzahlWagen);
            ZugTesten.tracing(7, "");
            return false;
        }

        // Wird der erste Wagen abgehängt?
        if (ersterWagen == wagen) {
            //Hat er einen Nachfolger?
            if (ersterWagen.getNachfolger() != null){
                // Hat der erste Wagen einen Nachfolger, wird er abgehängt und der Nachfolger zum ersten Wagen.
                ZugTesten.tracing(4, ersterWagen.getWagenID());
                ersterWagen = ersterWagen.getNachfolger();
            } else {
                // Hat der erste Wagen keinen Nachfolger, wird er abgehängt
                ZugTesten.tracing(5, ersterWagen.getWagenID());
                ersterWagen = null;
            }

            // Formelles Löschen der Referenz des abgehängten Wagens auf den Nachfolger
            wagen.setNachfolger(null);
            this.anzahlWagen--;
            ZugTesten.tracing(this.anzahlWagen);
            //ZugTesten.tracing(wagen.getWagenID());
            return true;

        } else {
            // Beginnend beim ersten Wagen, wird iterativ die Referenz auf den folgenden Wagen mit dem gesuchten Wagen abgeglichen
            // Der Zug und die Wagen werden in der Konsole ausgegeben.
            aktuellerWagen = ersterWagen;
            ZugTesten.tracing("ZUG: " + aktuellerWagen.getWagenID() + " --> ");

            while (aktuellerWagen.getNachfolger() != null && aktuellerWagen.getNachfolger() != wagen) {
                ZugTesten.tracing(aktuellerWagen.getNachfolger().getWagenID() + " --> ");
                aktuellerWagen = aktuellerWagen.getNachfolger();
            }

            // Wenn der Wagen gefunden wurde wird er abgehängt
            if (aktuellerWagen.getNachfolger() == wagen && wagen != null) {
                // Hier wird der nachfolgende Wagen an den letzten Wagen angehängt.
                aktuellerWagen.setNachfolger(wagen.getNachfolger());
                wagen.setNachfolger(null);
                System.out.println("Wagen abgehängt: " + wagen.getWagenID());
                ZugTesten.tracing(4, wagen.getWagenID());
                anzahlWagen--;
                ZugTesten.tracing(anzahlWagen);
                return true;
            } else {
                // Wenn der Wagen nicht im Zug gefunden wurde
                return false;
            }
        }
    }

    // Fängt beim ersten Wagen an und geht alle Wagen durch, gibt anzahlWagen zurück.
    public int getAnzahlWagenIterativ() {
        int anzahlWagen = 0;
        Wagen aktuellerWagen = ersterWagen;
        while (aktuellerWagen != null) {
            anzahlWagen++;
            aktuellerWagen = aktuellerWagen.getNachfolger();
        }
        return anzahlWagen;
    }

    // Gibt die anzahlWagen zurück.
    public int getAnzahlWagen() {
        return this.anzahlWagen;
    }

    //Beginnend beim ersten Wagen wird von jedem Wagen im Zug die ID ausgegeben.
    public void getWagenIterativ() {
        Wagen aktuellerWagen = ersterWagen;
        while (aktuellerWagen != null) {
            System.out.print(aktuellerWagen.getWagenID() + " ");
            aktuellerWagen = aktuellerWagen.getNachfolger();
        }
    }

    public Wagen getErsterWagen(){
        return ersterWagen;
    }

    public Wagen getLetzterWagen(){
        Wagen letzterWagen = ersterWagen;
        while (letzterWagen != null && letzterWagen.getNachfolger() != null){
            letzterWagen = letzterWagen.getNachfolger();
        }
        return letzterWagen;
    }
}
