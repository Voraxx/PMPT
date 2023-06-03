package ranlib;
import java.math.BigDecimal;
import java.math.MathContext;


public class Euler2 {

    public static BigDecimal euler(int n) {
        BigDecimal euler = BigDecimal.ZERO;
        int k = 0;

        while (k <= n + 2) {
            BigDecimal kehrwertFakultaet = BigDecimal.ONE.divide(faktorial(k), MathContext.DECIMAL128);
            euler = euler.add(kehrwertFakultaet);
            k++;
        }

        return euler.round(new MathContext(n));
    }

    private static BigDecimal faktorial(int n) {
        BigDecimal faktorial = BigDecimal.ONE;
        for (int i = 2; i <= n; i++) {
            faktorial = faktorial.multiply(BigDecimal.valueOf(i));
        }
        return faktorial;
    }

    public static void main(String[] args) {
        BigDecimal euler = euler(100);
        System.out.println(euler);
    }
}
