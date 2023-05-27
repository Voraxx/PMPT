package kap11_namenskollisionen_ueberladen_methoden_konstruktoren;

public class Sensor {
    String id;
    int wert;

    Sensor() {
        this("EineAndereId", 42);
    }

    Sensor(String id, int wert) {
        this.id = id;
        this.wert = wert;
    }

    public static void main(String[] args) {
        Sensor sensor = new Sensor("MeineID", 23);
    }

}
