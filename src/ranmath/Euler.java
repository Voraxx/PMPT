package ranmath;

import java.math.BigDecimal;
import java.math.MathContext;

/**
 * Euler
 * Version 1.0
 * 2023/05/20
 * <p>
 * This is my own implementation of Euler's number e.
 * <p>
 * Attribution
 * CC BY
 * <a href="https://creativecommons.org/licenses/by/4.0/">...</a>
 * <p>
 * Adrian Morgenthal
 * <a href="https://github.com/Voraxx">...</a>
 */

public class Euler {

    private static BigDecimal euler = BigDecimal.ONE;

    public static BigDecimal euler() {
        int n = 1000;
        BigDecimal euler = BigDecimal.ONE;
        BigDecimal faktor = BigDecimal.ONE;

        for (int i = 1; i <= n; i++) {
            faktor = faktor.divide(BigDecimal.valueOf(i), MathContext.DECIMAL128);
            euler = euler.add(faktor);
        }
        return euler;
    }

    public static BigDecimal euler(int n) {
        BigDecimal euler = BigDecimal.ONE;
        BigDecimal faktor = BigDecimal.ONE;

        for (int i = 1; i <= n; i++) {
            faktor = faktor.divide(BigDecimal.valueOf(i), MathContext.DECIMAL128);
            euler = euler.add(faktor);
        }
        return euler;
    }

    public Euler(){
        euler = euler();
    }

    public Euler(int n){
        euler = euler(n);
    }

}
