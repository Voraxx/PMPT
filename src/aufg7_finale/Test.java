package aufg7_finale;

public class Test {
    public static void main(String[] args) {
        //System.out.println(Verbindungsdaten.Staedte.values().length);
        //String[] string = new String[Staedte.values().length];
        //Stadt muenchen = new Stadt(Verbindungsdaten.Staedte.MUENCHEN);
        //muenchen.getAnzahlNachbarn();
        //System.out.println(muenchen.getStadtID());
        //Verbindungsdaten.copyStaedte();
        Verbindungsdaten.getVerbindungen();
        Tour tour = new Tour();
        tour.getPfad();
        for (Verbindungsdaten.Staedte c : Verbindungsdaten.Staedte.values()){
            //System.out.println(c);
        }

        for (String[] c : Verbindungsdaten.verbindungen){
            //System.out.println(c);
        }

    }
}
