package ranlib;

public class Fibonacci {
    public static void main(String[] args) {
        int n = 10; // Die Anzahl der Fibonacci-Zahlen, die berechnet werden sollen
        System.out.println("Fibonacci-Zahlen bis zur Position " + n + ":");
        for (int i = 0; i < n; i++) {
            System.out.print(fibonacci(i) + " ");
        }
    }

    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }
}
