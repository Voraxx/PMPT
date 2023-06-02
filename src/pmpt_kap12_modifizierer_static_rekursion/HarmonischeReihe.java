package pmpt_kap12_modifizierer_static_rekursion;

public class HarmonischeReihe {

    public float harmonischeReiheIterativ(int n) {
        if (n <= 0) {
            throw new IllegalArgumentException("Nur positive Eingabe erlaubt.");
        }

        float wert = 0;
        for (int i = 1; i <= n; i++) {
            wert += 1.0f / i;
        }
        return wert;
    }

    public float harmonischeReiheRekursiv(int n) {
        if (n <= 0) {
            throw new IllegalArgumentException("Nur positive Eingabe erlaubt.");
        }

        if (n == 1) {
            return 1;
        }
        return 1.0f / n + harmonischeReiheRekursiv(n - 1);
    }

    public static void main(String[] args) {
        HarmonischeReihe hr = new HarmonischeReihe();
        System.out.println(hr.harmonischeReiheIterativ(5));
        System.out.println(hr.harmonischeReiheRekursiv(5));
    }
}
