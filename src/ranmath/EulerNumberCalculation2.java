package ranmath;

import java.math.BigDecimal;
import java.math.MathContext;

public class EulerNumberCalculation2 {

    public static BigDecimal berechneEulerzahl(int nachkommastellen) {
        BigDecimal euler = BigDecimal.ZERO;
        int k = 0;

        while (k <= nachkommastellen + 2) {
            BigDecimal kehrwertFakultaet = BigDecimal.ONE.divide(fakultaet(k), MathContext.DECIMAL128);
            euler = euler.add(kehrwertFakultaet);
            k++;
        }

        return euler.round(new MathContext(nachkommastellen));
    }

    private static BigDecimal fakultaet(int n) {
        BigDecimal faktorial = BigDecimal.ONE;
        for (int i = 2; i <= n; i++) {
            faktorial = faktorial.multiply(BigDecimal.valueOf(i));
        }
        return faktorial;
    }

    public static void main(String[] args) {
        BigDecimal euler = berechneEulerzahl(100);
        System.out.println(euler);
    }
}
