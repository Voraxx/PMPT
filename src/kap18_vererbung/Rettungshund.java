package kap18_vererbung;

public class Rettungshund extends Hund {

    @Override
    public void geraeuschMachen() {
        super.geraeuschMachen();
        retten();
    }

    private void retten() {
        System.out.println("Menschen retten");
    }

    public static void main(String[] args) {
        Tier tier1 = new Hund();
        Tier tier2 = new Rettungshund();
        tier1.geraeuschMachen();
        tier2.geraeuschMachen();
    }
}
