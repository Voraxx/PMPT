package pmpt_aufg5_brettspiel;

public class Main {
    public static void main(String[] args) {


        /////////////////////////////////////////////////////////////////////////////////////
        /*{
            int eingabeInt = 0;
            int outputInt = 0;

            boolean isInput = false;

            String spielTitel = "";
            int spielerzahlMin = 0;
            int spielerzahlMax = 0;
            int mindestalter = 0;

            Scanner scanner = new Scanner(System.in);
            Brettspielsammlung brettspielsammlung = new Brettspielsammlung();

            System.out.println("Dies ist ein Programm zum Verwalten von Brettspielen.");
            System.out.println("Geben Sie eine beliebige Zahl ein und drücken Sie Enter.");

            // Ständige Registrierung von Input
            while (scanner.hasNext()) {
                outputInt = 0;
                eingabeInt = scanner.nextInt();

                switch (eingabeInt) {
                    case 0:

                    case 1:
                        System.out.println("Geben Sie einen Spieltitel ein:");
                        spielTitel = scanner.next();
                        System.out.println("Geben Sie die Spielerzahl ein:\nMin:");
                        spielerzahlMin = scanner.nextInt();
                        System.out.println("Max:");
                        spielerzahlMax = scanner.nextInt();
                        System.out.println("Geben Sie das Mindestalter ein:");
                        mindestalter = scanner.nextInt();
                        Brettspiel brettspiel = new Brettspiel(spielTitel, new int[]{spielerzahlMin, spielerzahlMax}, mindestalter);
                        brettspielsammlung.hinzufuegen(brettspiel);
                        brettspiel.ausgeben();
                        brettspielsammlung.ausgeben();
                        //eingabeInt = scanner.nextInt();
                        break;
                    case 2:
                        //brettspielsammlung.ausgeben();
                        break;
                    case 3:
                        System.out.println("Programm beendet.");
                        scanner.close();
                        break;
                    default:
                        System.out.println("Geben Sie eine Zahl ein:");
                        System.out.println("1 : Spiel hinzufügen" +
                                "\n2 : Spielesammlung in der Konsole ausgeben" +
                                "\n3 : Programm beenden");
                        break;
                }
            }
        }*/
        /////////////////////////////////////////////////////////////////////////////////////


        // brettspiel01 erstellen und ausgeben
        Brettspiel brettspiel01 = new Brettspiel("Risiko", new int[]{2, 5}, 0);
        brettspiel01.ausgeben();

        // brettspiel02 erstellen und ausgeben
        Brettspiel brettspiel02 = new Brettspiel("Backgammon", new int[]{2, 2}, 5);
        brettspiel02.ausgeben();

        // brettspiel03 erstellen und ausgeben
        Brettspiel brettspiel03 = new Brettspiel("Schach", new int[]{2, 2}, 0);
        brettspiel03.ausgeben();

        System.out.println();

        // Brettspielsammlung erstellen
        Brettspielsammlung brettspielsammlung = new Brettspielsammlung();
        brettspielsammlung.getAnzahlBrettspiele();

        // brettspiel01 und brettspiel02 zu brettspielsammlung hinzufügen
        brettspielsammlung.hinzufuegen(brettspiel01);
        brettspielsammlung.hinzufuegen(brettspiel02);

        // brettspielsammlung ausgeben
        brettspielsammlung.ausgeben();

        // brettspiel01 entfernen
        brettspielsammlung.entfernen(brettspiel01);
        brettspielsammlung.ausgeben();

        // brettspiel03 hinzufügen
        brettspielsammlung.hinzufuegen(brettspiel03);
        brettspielsammlung.ausgeben();
    }
}
