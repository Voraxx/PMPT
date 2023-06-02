package pmpt_aufg4_zug;

public class ZugTesten {
    public static String tracing(int i, String traced){
        switch (i) {
            case 1:
                System.out.println("Zug erstellt. " + traced);
                break;
            case 2:
                System.out.println("Wagen erstellt mit ID: " + traced);
                break;
            case 3:
                System.out.println("Wagen mit ID: " + traced + " angehängt.");
                break;
            case 4:
                System.out.println("Wagen mit ID: " + traced + " abgehängt.");
                break;
            case 5:
                System.out.println("Erster Wagen abgehängt!");
                break;
            case 6:
                System.out.println();
                System.out.println("TEST NR: " + traced);
                break;
            case 7:
                System.out.println("Wagen hängt nicht am Zug! Abhängen fehlgeschlagen.");
                break;
            case 8:
                System.out.println("TEST ERFOLGREICH!");
                break;
            case 9:
                System.out.println("TEST FEHLGESCHLAGEN!");
                break;
            case 10:
                System.out.println("ALLE TESTS ERFOLGREICH!");
                break;
            default:
                System.out.println(traced);
                break;
        }
        return traced;
    }

    public static void tracing(int i){
        if (i == 0) {
            System.out.println("Der Zug hat keinen Wagen.");
        } else {
            System.out.println(i + " Wagen.");
        }
    }

    public static void tracing(String input){
        System.out.print(input);
    }

    // Einen Wagen anhängen, einen Wagen abhängen
    public static void doTest001(){
        Zug zug = new Zug();
        Wagen wagen = new Wagen();
        zug.anhaengen(wagen);
        zug.abhaengen(wagen);
        zug.getWagenIterativ();
    }

    // Mehr als einen Zug angehängt, aus der Mitte einen Wagen abgehängt
    public static void doTest002(){
        Zug zug = new Zug();
        Wagen wagen = new Wagen();
        zug.anhaengen(wagen);
        zug.anhaengen(new Wagen());
        zug.abhaengen(wagen);
        zug.anhaengen(new Wagen());
        zug.anhaengen(new Wagen());
        zug.getWagenIterativ();
    }

    // Keinen Wagen angehängt, Wagen abhängen
    public static void doTest003(){
        Zug zug = new Zug();
        Wagen wagen = new Wagen();
        zug.abhaengen(wagen);
        zug.getWagenIterativ();
    }

    public static void doTest004(){
        Zug zug = new Zug();
        Wagen wagen = new Wagen();


        //Erster Wagen anhängen
        zug.anhaengen(new Wagen());     // T1
        zug.anhaengen(new Wagen());     // T2
        zug.anhaengen(wagen);           // T3
        zug.anhaengen(new Wagen());     // T4
        zug.anhaengen(new Wagen());     // T5
        zug.anhaengen(new Wagen());     // T6

        //Wagen aus Mitte abhängen
        zug.abhaengen(wagen);
        //Letzer abhängen
        zug.abhaengen(zug.getLetzterWagen());
        zug.abhaengen(zug.getLetzterWagen());
        zug.abhaengen(zug.getLetzterWagen());
        zug.abhaengen(zug.getLetzterWagen());
        zug.abhaengen(zug.getLetzterWagen());

        //nicht existierenden Wagen abhängen
        zug.abhaengen(zug.getLetzterWagen());
        zug.getWagenIterativ();
    }

    // Alle Wagen abhängen
    public static void doTest005(){
        Zug zug = new Zug();

        for(int i = 0; i < 10; i++) {
            zug.anhaengen(new Wagen());
        }

        int anzahlWagen = zug.getAnzahlWagen();
        for(int i = 0; i < anzahlWagen; i++) {
            zug.abhaengen(zug.getLetzterWagen());
        }
    }

    public static void doTest006() {
        Zug zug = new Zug();

        for(int i = 0; i < 10; i++) {
            zug.anhaengen(new Wagen());
        }
        System.out.println(zug.getLetzterWagen().getWagenID());
    }
}

/*
    Äquivalenzklassen:

    ++ mehr als 1 angehängt
    ++ genau 1 angehängt
    ++ nichts angehängt
    ++ Aus der Mitte abhängen
    ++ Erster Abhängen
    ++ Letzer Abhängen
    ++ Alle Abhängen
    + Anhängen und dann abhängen
    ++ nicht existierender Wagen abhängen
 */

