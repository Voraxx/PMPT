package pmpt_aufg4_zug;

public class Main {
    public static void main(String[] args) {
        boolean isTesting = true;

        if (!isTesting){

            Zug zug = new Zug();
            Wagen wagen;

            int anzahlWagen = 5;

            for (int i = 1; i <= anzahlWagen; i++){
                wagen = new Wagen();
                zug.anhaengen(wagen);
                if (i==2){
                    zug.abhaengen(wagen);
                }
            }

        } else {
            ZugTesten.tracing(6,"1");
            ZugTesten.doTest001();
            ZugTesten.tracing(6,"2");
            ZugTesten.doTest002();
            ZugTesten.tracing(6,"3");
            ZugTesten.doTest003();
            ZugTesten.tracing(6,"4");
            ZugTesten.doTest004();
        }


    }
}
