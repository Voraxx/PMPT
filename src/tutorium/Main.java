package tutorium;

public class Main {
    public static void main(String[] args) {
        Tier tier = new Elefant(2, "Zucker");
        tier.geraeuschMachen();
        tier.snacken("Karotte");
        tier.snacken("Zucker");


        Tier tier2 = new Schnabeltier(2, "Honig");
        tier2.geraeuschMachen();
        tier2.snacken("Karotte");
        tier2.snacken("Honig");
    }
}
