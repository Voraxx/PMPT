package kap12_modifizierer_static_rekursion;

public class NumPrimBis {

    /**
     * Liefert die Anzahl der Primzahlen zwischen 2 und n; n muss >= 2 sein.
     */
    public int numPrimsBisRekusiv(int n) {
        if (n == 1) {
            return 0;
        } else {
            return numPrimsBisRekusiv(n - 1) + (istPrim(n) ? 1 : 0);
        }
    }

    /**
     * Liefert die Anzahl der Primzahlen zwischen 2 und n; n muss >= 2 sein. Endrekursive Variante.
     */
    public int numPrimsBisEndrekursiv(int n, int ergebnis) {
        if (n == 1) {
            return ergebnis;
        } else {
            return numPrimsBisEndrekursiv(n - 1, ergebnis + (istPrim(n) ? 1 : 0));
        }
    }

    private boolean istPrim(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }


    public static void main(String[] args) {
        NumPrimBis numPrimBis = new NumPrimBis();
        System.out.println(numPrimBis.numPrimsBisRekusiv(10));
        System.out.println(numPrimBis.numPrimsBisEndrekursiv(10, 0));
    }
}
