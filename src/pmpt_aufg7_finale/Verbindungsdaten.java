package pmpt_aufg7_finale;

import java.util.Arrays;
import java.util.Random;

public class Verbindungsdaten {
    private static final int anzahlStaedte = Staedte.values().length;
    public static String[][] verbindungen = new String[anzahlStaedte][anzahlStaedte];

    public static void getVerbindungen(){
        buildGrid();
        for (String[] c : verbindungen){
            System.out.println(Arrays.toString(c));
        }
    }

    private static void buildGrid(){
        for (int i = 0; i<anzahlStaedte; i++){      // Spalten
            Random ran = new Random();
            int anzNachbarn = ran.nextInt(1,5);

            verbindungen[i][0] = Staedte.values()[i].toString();
            for (int j = 0; j<anzNachbarn; j++){
                int entfernung = ran.nextInt(2,6);
                int n = ran.nextInt(1,29);
                verbindungen[i][n] = String.valueOf(entfernung);
            }
            for (int k=0; k<anzahlStaedte;k++){
                if (verbindungen[i][k] == null){
                    verbindungen[i][k] = "";
                }
            }

        }
    }

    public enum Staedte{
        BASEL, BERLIN, BERN, BOZEN, BRUXELLES, DORTMUND, FLENSBURG, FRANKFURT, GENEVE, GRAZ, HAMBURG, HANNOVER,
        INNSBRUCK, KASSEL, KOELN, LINZ, MAINZ, MANNHEIM, MILANO, MUENCHEN, NUERNBERG, ROTTERDAM, SAARBRUECKEN, SALZBURG,
        STUTTGART, TRIESTE, VERONA, WIEN, ZUERICH
    }

}
