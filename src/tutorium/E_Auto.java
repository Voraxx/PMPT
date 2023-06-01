package tutorium;

public class E_Auto extends Fahrzeug {
    private String marke;
    private int prozentAkku;
    private int maxTempo;

    public E_Auto(String marke, int maxTempo) {
        super(marke);
        this.maxTempo = maxTempo;
        prozentAkku = 100;
    }

    @Override
    public void beschleunigen() {
        super.beschleunigen();
    }

    @Override
    public void bremsen(){
        super.beschleunigen();
        super.beschleunigen();
        super.beschleunigen();
    }

    @Override
    public String toString(){
        return marke;
    }
}
