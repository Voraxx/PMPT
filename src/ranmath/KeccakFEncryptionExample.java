package ranmath;

import java.nio.charset.StandardCharsets;

public class KeccakFEncryptionExample {
    public static void main(String[] args) {
        String input = "Hello, World!";
        byte[] inputBytes = input.getBytes(StandardCharsets.UTF_8);

        byte[] encrypted = KeccakF.keccakF(inputBytes);

        // Ausgabe des verschlüsselten Ergebnisses
        System.out.println("Verschlüsseltes Ergebnis: " + KeccakF.bytesToHex(encrypted));
    }


}

