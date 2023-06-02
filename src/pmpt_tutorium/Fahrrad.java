package pmpt_tutorium;

public class Fahrrad extends Fahrzeug {
    private int gaenge;
    private String material;
    private String marke;

    public Fahrrad(String marke) {
        super(marke);
    }

    public Fahrrad(String material, int gaenge, String marke){
        super(material);
    }

}
