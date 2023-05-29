package ranmath;

import java.math.BigDecimal;
import java.math.MathContext;

public class EulerNumberCalculation {

    public static BigDecimal berechneEulerzahl(int nachkommastellen) {
        BigDecimal euler = BigDecimal.ONE;
        BigDecimal faktor = BigDecimal.ONE;

        for (int i = 1; i <= nachkommastellen; i++) {
            faktor = faktor.divide(BigDecimal.valueOf(i), MathContext.DECIMAL128);
            euler = euler.add(faktor);
        }

        return euler;
    }

    public static void main(String[] args) {
        BigDecimal euler = berechneEulerzahl(100);
        System.out.println(euler);
    }
}
