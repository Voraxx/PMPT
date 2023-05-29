package aufg7_finale;

import java.util.Random;

public class Stadt {
    private int anzahlNachbarn;
    private String stadtID;
    private Random ran = new Random();

    public Stadt(Verbindungsdaten.Staedte stadt){
        stadtID = String.valueOf(stadt);
        stadtID = stadtID.charAt(0) + stadtID.substring(1).toLowerCase();
    }

    public String formatiereString(String string){
        string = string.charAt(0) + string.substring(1).toLowerCase();
        return string;
    }

    public int getAnzahlNachbarn(){
        return anzahlNachbarn;
    }

    public String getStadtID() {
        return stadtID;
    }
}
