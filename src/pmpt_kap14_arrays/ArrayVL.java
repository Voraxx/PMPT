package pmpt_kap14_arrays;

public class ArrayVL {

    // 14.10
    private String[] verdoppeln(String[] eingabe) {
        String[] ergebnis = new String[eingabe.length * 2];
        for (int i = 0; i < eingabe.length; i++) {
            ergebnis[2 * i] = eingabe[i];
            ergebnis[2 * i + 1] = eingabe[i];
        }
        return ergebnis;
    }

    // 14.11
    private String[] verdoppeln2(String[] eingabe) {
        String[] ergebnis = new String[eingabe.length * 2];
        System.arraycopy(eingabe, 0, ergebnis, ergebnis.length / 2, eingabe.length);
        return ergebnis;
    }

    public static void main(String[] args) {
        // 14.1
        double[] doubleArray;

        // 14.2
        doubleArray = new double[5];

        // 14.3
        doubleArray[2] = 23.42;

        // 14.4
        doubleArray = new double[]{1, 2, 3, 4, 5};

        // 14.6
        int[] quadratzahlen = new int[10];
        for (int i = 0; i < quadratzahlen.length; i++) {
            quadratzahlen[i] = i * i;
        }

        // 14.7
        for (int i = 0; i < quadratzahlen.length; i++) {
            System.out.print(quadratzahlen[i] + " ");
        }
        System.out.println();

        // 14.8
        for (int zahl : quadratzahlen) {
            System.out.print(zahl + " ");
        }
        System.out.println();

        // 14.10
        ArrayVL arrayVL = new ArrayVL();
        for (String s : arrayVL.verdoppeln(new String[]{"Eins", "Zwei", "Drei"})) {
            System.out.print(s + " ");
        }
        System.out.println();

        // 14.11
        for (String s : arrayVL.verdoppeln2(new String[]{"Eins", "Zwei", "Drei"})) {
            System.out.print(s + " ");
        }
        System.out.println();
    }
}
