package pmpt_tutorium;

public class Schnabeltier implements Tier{
    private int speed = 0;
    private String lieblingssnack = "";
    public Schnabeltier(int geschwindigkeit, String snack){
        this.speed = geschwindigkeit;
        this.lieblingssnack = snack;
    }


    @Override
    public void geraeuschMachen() {
        System.out.println("Auch töröö");
    }

    /*
    @Override
    public void snacken(String snack) {
        if(this.lieblingssnack.equals(snack)){
            for (int i = 0; i<snack.length(); i++){
                for (int j = 0; j<snack.length()-i;j++){
                    System.out.print(snack.charAt(j+i));
                }
                System.out.println();
            }
        }
    }
    */

    @Override
    public void snacken(String snack) {
        if(this.lieblingssnack.equals(snack)){
            for (int i = 0; i<snack.length(); i++){
                System.out.println(snack.substring(0, lieblingssnack.length()-i));
            }
        } else {
            this.geraeuschMachen();
        }
    }

    @Override
    public int getSpeed() {
        return speed;
    }

    @Override
    public int speedDifference(Tier tier) {
        return Math.abs(this.speed - tier.getSpeed());
    }
}
