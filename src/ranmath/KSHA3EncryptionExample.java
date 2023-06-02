package ranmath;

import java.nio.charset.StandardCharsets;

public class KSHA3EncryptionExample {
    public static void main(String[] args) {
        String input = "Hello, World!";

        // Ausgabe des verschlüsselten Ergebnisses
        System.out.println("Verschlüsseltes Ergebnis: " + KSHA3.calculateHash(input));
    }
}

