package kap11_namenskollisionen_ueberladen_methoden_konstruktoren;

public class Kollision {
    int wert = 23;

    void methode(int wert){
        System.out.println(wert);
        System.out.println(this.wert);
    }

    public static void main(String[] args) {
        Kollision kollision = new Kollision();
        kollision.methode(42);
    }
}
