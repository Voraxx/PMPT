package tutorium;

public class Hovercraft extends Fahrzeug {
    private int flughoehe;
    private String marke;

    public Hovercraft(String marke, int flughoehe) {
        super(marke);
        this.flughoehe = flughoehe;
    }

    @Override
    public void beschleunigen() {
        flughoehe++;
    }

    @Override
    public void bremsen(){
        if(flughoehe == 0){
            System.out.println("Das Hovercraft ist bereits am Boden");
        } else {
            flughoehe--;
        }
    }

    @Override
    public String toString(){
        return marke;
    }
}
