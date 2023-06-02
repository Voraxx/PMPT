package pmpt_tutorium;

public class Fahrzeug {
    private int tempo;
    private String marke;

    public Fahrzeug(String marke){
        this.marke = marke;
        tempo = 0;
    }

    public void bremsen(){
        if(tempo == 0){
            System.out.println("Das Fahrzeug steht bereits.");
        } else {
            tempo--;
        }
    }

    public void beschleunigen(){
        tempo++;
    }

    public void warnGeraeusch(){
        System.out.println("Tuuuut tuuuut");
    }

    public String toString(){
        return marke;
    }
}
