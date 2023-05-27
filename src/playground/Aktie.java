package playground;

public class Aktie implements Vermoegenswert {

    @Override
    public String getName() {
        return "Aktie";
    }

    @Override
    public double getEuroWert() {
        return 1000;
    }

    @Override
    public int getRisko() {
        return RISIKO_HOCH;
    }
}
