package pmpt_aufg4_zug;

public class Wagen {
    private static int count = 1;
    private final String wagenID;
    private Wagen nachfolger;


    // Konstruktor, setzt eine eindeutige wagenID
    public Wagen(){
        this.wagenID = "T" + count++;
    }

    // Gibt den nächsten Wagen zurück
    public Wagen getNachfolger(){
        return nachfolger;
    }

    // Legt die Referenz auf den nächsten Wagen fest
    public void setNachfolger(Wagen nachfolger){
        this.nachfolger = nachfolger;
    }

    // Gibt die WagenID zurück.
    public String getWagenID(){
        return this.wagenID;
    }

    public static void resetCount(){
        count = 1;
    }
}
