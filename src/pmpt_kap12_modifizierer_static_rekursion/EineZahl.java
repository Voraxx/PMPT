package pmpt_kap12_modifizierer_static_rekursion;

public class EineZahl {
    private final int wert = 23;

    public int getWert() {
        return wert;
    }

    public static void main(String[] args) {
        EineZahl eineZahl = new EineZahl();
        System.out.println(eineZahl.getWert());
    }
}
