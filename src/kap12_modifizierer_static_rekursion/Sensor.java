package kap12_modifizierer_static_rekursion;

public class Sensor {
    private final String id;
    private int wert;

    public Sensor(String id, int wert) {
        this.id = id;
        this.wert = wert;
    }

    public void reset() {
        this.wert = 23;
    }

    public static int getBetrag(int zahl) {
        return Math.abs(zahl);
    }

    public static void main(String[] args) {
        Sensor sensor = new Sensor("MeineID", 23);
        System.out.println(Sensor.getBetrag(-23));
    }

}
