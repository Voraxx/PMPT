package dossier;

public class Oldtimer implements Vermoegenswert, Auto {

    private final int alter;
    private final double basiswert;
    public Oldtimer(int alter, double basiswert){
        this.alter = alter;
        this.basiswert = basiswert;
    }
    @Override
    public String getName() {
        return "Oldtimer";
    }

    @Override
    public double getEuroWert() {
        return alter * basiswert;
    }

    @Override
    public int getRisko() {
        return RISIKO_MITTEL;
    }

    @Override
    public String getMarke() {
        return null;
    }

    public int getAlter() {
        return alter;
    }
}
