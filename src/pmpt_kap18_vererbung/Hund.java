package pmpt_kap18_vererbung;

public class Hund implements Tier {
    @Override
    public void geraeuschMachen() {
        System.out.println("Wuff");
    }
}
