package ranlib;

import java.nio.charset.StandardCharsets;

public class SHA3EncryptionExample {
    private static final int BLOCK_SIZE = 136;
    private static final int OUTPUT_SIZE = 256;
    private static final int STATE_SIZE = 1600;
    private static final int RATE = STATE_SIZE - (2 * OUTPUT_SIZE);

    public static void main(String[] args) {
        String input = "Hello, World!";
        byte[] encrypted = sha3(input.getBytes(StandardCharsets.UTF_8));
        System.out.println("Verschlüsseltes Ergebnis: " + bytesToHex(encrypted));
    }

    private static byte[] sha3(byte[] input) {
        int blockSize = BLOCK_SIZE / 8;
        int outputSize = OUTPUT_SIZE / 8;

        byte[] paddedInput = padInput(input, blockSize);
        int numBlocks = paddedInput.length / blockSize;

        long[] state = new long[STATE_SIZE / 64];
        for (int i = 0; i < numBlocks; i++) {
            absorb(state, paddedInput, i * blockSize, blockSize);
        }

        squeeze(state, outputSize);

        return longsToBytes(state);
    }

    private static byte[] padInput(byte[] input, int blockSize) {
        int inputLength = input.length;

        // Berechnung der Anzahl der Padding-Bytes
        int numPaddingBytes = blockSize - ((inputLength + 1) % blockSize);

        // Hinzufügen von Padding-Byte (0x06) und null Bytes
        byte[] paddedInput = new byte[inputLength + numPaddingBytes + 1];
        System.arraycopy(input, 0, paddedInput, 0, inputLength);
        paddedInput[inputLength] = (byte) 0x06;

        return paddedInput;
    }

    private static void absorb(long[] state, byte[] data, int offset, int length) {
        int blockSize = state.length * 8;

        for (int i = 0; i < length; i += blockSize) {
            for (int j = 0; j < state.length; j++) {
                state[j] ^= bytesToLong(data, offset + i);
            }

            keccakF(state);
        }
    }

    private static void squeeze(long[] state, int outputSize) {
        int blockSize = state.length * 8;

        int numBlocks = outputSize / blockSize;
        int remainingBytes = outputSize % blockSize;

        for (int i = 0; i < numBlocks; i++) {
            keccakF(state);
        }

        byte[] outputBytes = new byte[outputSize];
        for (int i = 0; i < remainingBytes; i++) {
            outputBytes[i] = (byte) (state[i / 8] >>> (8 * (i % 8)));
        }

        long[] outputLongs = bytesToLong(outputBytes);
        for (int i = 0; i < state.length; i++) {
            state[i] = outputLongs[i];
        }
    }

    private static void keccakF(long[] state) {
        String input = "Hello, World!";
        byte[] inputBytes = input.getBytes(StandardCharsets.UTF_8);

        byte[] encrypted = KSHA3.keccakF(inputBytes);

        // Ausgabe des verschlüsselten Ergebnisses
        System.out.println("Verschlüsseltes Ergebnis: " + bytesToHex(encrypted));
    }

    private static byte[] longsToBytes(long[] longs) {
        byte[] bytes = new byte[longs.length * 8];
        for (int i = 0; i < longs.length; i++) {
            longToBytes(longs[i], bytes, i * 8);
        }
        return bytes;
    }

    private static void longToBytes(long value, byte[] bytes, int offset) {
        for (int i = 0; i < 8; i++) {
            bytes[offset + i] = (byte) (value >>> (56 - (i * 8)));
        }
    }

    private static long bytesToLong(byte[] bytes, int offset) {
        if (bytes.length - offset < 8) {
            throw new IllegalArgumentException("Invalid byte array or offset");
        }

        long value = 0;
        for (int i = 0; i < 8; i++) {
            value |= (long) (bytes[offset + i] & 0xFF) << (56 - (i * 8));
        }
        return value;
    }

    private static long[] bytesToLong(byte[] bytes) {
        if (bytes.length % 8 != 0) {
            throw new IllegalArgumentException("Invalid byte array length");
        }

        int numLongs = bytes.length / 8;
        long[] longs = new long[numLongs];

        for (int i = 0; i < numLongs; i++) {
            longs[i] = ((long) (bytes[i * 8] & 0xFF) << 56) |
                    ((long) (bytes[i * 8 + 1] & 0xFF) << 48) |
                    ((long) (bytes[i * 8 + 2] & 0xFF) << 40) |
                    ((long) (bytes[i * 8 + 3] & 0xFF) << 32) |
                    ((long) (bytes[i * 8 + 4] & 0xFF) << 24) |
                    ((long) (bytes[i * 8 + 5] & 0xFF) << 16) |
                    ((long) (bytes[i * 8 + 6] & 0xFF) << 8) |
                    ((long) (bytes[i * 8 + 7] & 0xFF));
        }

        return longs;
    }


    private static String bytesToHex(byte[] bytes) {
        StringBuilder sb = new StringBuilder();
        for (byte b : bytes) {
            sb.append(String.format("%02x", b));
        }
        return sb.toString();
    }
}
