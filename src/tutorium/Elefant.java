package tutorium;

public class Elefant implements Tier{
    private int geschwindigkeit = 0;
    private String lieblingssnack = "";
    public Elefant(int geschwindigkeit, String snack){
        this.geschwindigkeit = geschwindigkeit;
        this.lieblingssnack = snack;
    }


    @Override
    public void geraeuschMachen() {
        System.out.println("Töröö");
    }

    public void snacken(String snack, boolean check){
        if(snack.length() != 0){
            System.out.println(snack);
            snacken(snack.substring(1), true);
        }
    }
    public void snacken(String snack){
        if(snack.equals(lieblingssnack)){
            snacken(snack, true);        }
    }

    @Override
    public int getSpeed() {
        return geschwindigkeit;
    }

    @Override
    public int speedDifference(Tier tier) {
        return this.geschwindigkeit - tier.getSpeed();
    }
}
