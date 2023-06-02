package ranmath;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;

/**
 * KSHA3
 * Version 1.0
 * 2023/06/03
 * <p>
 * Attribution
 * CC BY
 * <a href="https://creativecommons.org/licenses/by/4.0/">...</a>
 * <p>
 * Adrian Morgenthal
 * <a href="https://github.com/Voraxx">...</a>
 * <p>
 * KSHA3 is an implementation of the Keccak-f function, which is a component of the SHA-3 cryptographic hash function.
 * The calculateHash method takes an input string, converts it to bytes using UTF-8 encoding,
 * and then applies the Keccak-f function to generate a hash value.
 * The resulting hash is returned as a hexadecimal string.
 * <p>
 * Code breakdown:
 * calculateHash() receives a string input as input.
 * The input string is converted to bytes using the UTF-8 encoding.
 * keccakF() is called with the input bytes to perform the Keccak-f operation and obtain the encrypted bytes.
 * The encrypted bytes are converted to a hexadecimal string using the bytesToHex method.
 * The hexadecimal string representing the hash value is returned as the result.
 * <p>
 * The keccakF method performs the Keccak-f operation on the input state.
 * It consists of multiple rounds, each of which applies different transformations to the state.
 * The rounds include operations such as theta, rho, pi, chi, and iota.
 * These operations modify the state to achieve diffusion and confusion,
 * which are important properties of cryptographic hash functions.
 * <p>
 * The other methods in the code are utility methods for converting between bytes and longs,
 * reshaping and flattening the state, and performing bitwise operations required for the Keccak-f algorithm.
 * <p>
 * It's important to note that the code is specific to the SHA-3-256 variant, where the hash size is 256 bits.
 * The constants and parameters used in the code are tailored for this specific variant.
 */

public class KSHA3 {
    private static final int STATE_SIZE = 1600; // State size in bits
    private static final int LANE_SIZE = 64; // Lane size in bits

    // Round-constants for Keccak-f
    private static final long[] ROUND_CONSTANTS = {
            0x0000000000000001L, 0x0000000000008082L, 0x800000000000808AL,
            0x8000000080008000L, 0x000000000000808BL, 0x0000000080000001L,
            0x8000000080008081L, 0x8000000000008009L, 0x000000000000008AL,
            0x0000000000000088L, 0x0000000080008009L, 0x000000008000000AL,
            0x000000008000808BL, 0x800000000000008BL, 0x8000000000008089L,
            0x8000000000008003L, 0x8000000000008002L, 0x8000000000000080L,
            0x000000000000800AL, 0x800000008000000AL, 0x8000000080008081L,
            0x8000000000008080L, 0x0000000080000001L, 0x8000000080008008L
    };

    private static final int[][] RHO_OFFSETS = {
            {0, 36, 3, 41, 18},
            {1, 44, 10, 45, 2},
            {62, 6, 43, 15, 61},
            {28, 55, 25, 21, 56},
            {27, 20, 39, 8, 14}
    };

    private static final int[][] X_COORDINATES = {
            {0, 1, 2, 3, 4},
            {1, 2, 3, 4, 0},
            {2, 3, 4, 0, 1},
            {3, 4, 0, 1, 2},
            {4, 0, 1, 2, 3}
    };

    private static final int[][] Y_COORDINATES = {
            {0, 1, 2, 3, 4},
            {1, 2, 3, 4, 0},
            {2, 3, 4, 0, 1},
            {3, 4, 0, 1, 2},
            {4, 0, 1, 2, 3}
    };

    public static String calculateHash(String input) {
        byte[] inputBytes = input.getBytes(StandardCharsets.UTF_8);
        byte[] encrypted = keccakF(inputBytes);
        return bytesToHex(encrypted);
    }

    static byte [] keccakF(byte[] state) {
        int numRounds = 24; // Anzahl der Runden für SHA-3-256

        long[] stateAsLongs = bytesToLongs(state);
        long[][] lanes = reshapeToLanes(stateAsLongs);

        for (int round = 0; round < numRounds; round++) {
            theta(lanes);
            rho(lanes);
            pi(lanes);
            chi(lanes);
            iota(lanes, round);
        }

        return longsToBytes(flattenLanes(lanes));
    }

    private static long [] bytesToLongs(byte [] data) {
        long[] longs = new long[data.length / 8];
        ByteBuffer buffer = ByteBuffer.wrap(data);

        for (int i = 0; i < longs.length; i++) {
            longs[i] = buffer.getLong();
        }

        return longs;
    }

    private static String bytesToHex(byte [] bytes) {
        StringBuilder sb = new StringBuilder();
        for (byte b : bytes) {
            sb.append(String.format("%02x", b));
        }
        return sb.toString();
    }

    private static byte [] longsToBytes(long [] longs) {
        ByteBuffer buffer = ByteBuffer.allocate(longs.length * 8);

        for (long l : longs) {
            buffer.putLong(l);
        }

        return buffer.array();
    }

    private static long[][] reshapeToLanes(long[] state) {
        int numLanes = STATE_SIZE / LANE_SIZE;
        int laneSizeLongs = LANE_SIZE / 64; // Größe einer Lane in Longs
        long[][] lanes = new long[numLanes][laneSizeLongs];
        for (int i = 0; i < numLanes; i++) {
            System.arraycopy(state, i * laneSizeLongs, lanes[i], 0, laneSizeLongs);
        }

        return lanes;
    }

    private static long[] flattenLanes(long[][] lanes) {
        int numLanes = STATE_SIZE / LANE_SIZE;
        long[] state = new long[STATE_SIZE / 8];
        for (int i = 0; i < numLanes; i++) {
            System.arraycopy(lanes[i], 0, state, i * (LANE_SIZE / 8), LANE_SIZE / 8);
        }
        return state;
    }

    private static void theta(long[][] lanes) {
        int numLanes = STATE_SIZE / LANE_SIZE;
        long[] c = new long[numLanes];

        for (int x = 0; x < numLanes; x++) {
            for (int y = 0; y < numLanes; y++) {
                c[x] ^= lanes[y][x];
            }
        }

        for (int x = 0; x < numLanes; x++) {
            long dX = c[(x + 1) % numLanes] ^ rotateLeft(c[(x + 1) % numLanes], 1);
            for (int y = 0; y < numLanes; y++) {
                lanes[y][x] ^= dX;
            }
        }
    }

    private static void rho(long[][] lanes) {
        for (int x = 1; x < 5; x++) {
            for (int y = 0; y < 5; y++) {
                lanes[y][x] = rotateLeft(lanes[y][x], RHO_OFFSETS[y][x]);
            }
        }
    }

    private static void pi(long[][] lanes) {
        int numLanes = STATE_SIZE / LANE_SIZE;
        long[][] newLanes = new long[numLanes][];
        for (int x = 0; x < numLanes; x++) {
            newLanes[x] = new long[numLanes];
            for (int y = 0; y < numLanes; y++) {
                newLanes[x][y] = lanes[Y_COORDINATES[x][y]][X_COORDINATES[x][y]];
            }
        }
        System.arraycopy(newLanes, 0, lanes, 0, numLanes);
    }

    private static void chi(long[][] lanes) {
        int numLanes = STATE_SIZE / LANE_SIZE;

        for (int y = 0; y < numLanes; y++) {
            long[] c = new long[5];
            for (int x = 0; x < 5; x++) {
                c[x] = lanes[y][x] ^ ((~lanes[y][(x + 1) % 5]) & lanes[y][(x + 2) % 5]);
                lanes[y][x] = c[x];
            }
        }
    }

    private static void iota(long[][] lanes, int round) {
        lanes[0][0] ^= ROUND_CONSTANTS[round];
    }

    private static long rotateLeft(long value, int offset) {
        return (value << offset) | (value >>> (64 - offset));
    }


}

