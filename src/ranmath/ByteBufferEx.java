package ranmath;
import java.nio.ByteBuffer;

public class ByteBufferEx {
    public static void main(String[] args) {
        // Erstellen eines ByteBuffer-Objekts mit einer Kapazität von 8 Bytes
        ByteBuffer buffer = ByteBuffer.allocate(8);

        // Schreiben von Daten in den ByteBuffer
        buffer.putInt(90); // Schreibt einen Integer-Wert (4 Bytes)
        buffer.putDouble(3.14); // Schreibt einen Double-Wert (8 Bytes)

        // Zurücksetzen des Positionszeigers auf den Anfang des Buffers
        buffer.rewind();

        // Lesen der Daten aus dem ByteBuffer
        int intValue = buffer.getInt(); // Liest einen Integer-Wert (4 Bytes)
        double doubleValue = buffer.getDouble(); // Liest einen Double-Wert (8 Bytes)

        // Ausgabe der gelesenen Werte
        System.out.println("Int value: " + intValue);
        System.out.println("Double value: " + doubleValue);
    }


    static ByteBuffer allocate(int capacity) {
        return ByteBuffer.allocate(capacity);
    }

    private static void putInt(ByteBuffer buffer, int value) {
        buffer.putInt(value);
    }

    private static void putDouble(ByteBuffer buffer, double value) {
        buffer.putDouble(value);
    }

    private static void rewind(ByteBuffer buffer) {
        buffer.rewind();
    }

    private static int getInt(ByteBuffer buffer) {
        return buffer.getInt();
    }

    private static double getDouble(ByteBuffer buffer) {
        return buffer.getDouble();
    }

    public static ByteBufferEx wrap(byte[] data) {
        return null;
    }

    public byte[] array() {
        return null;
    }

    public long getLong() {
        return 0;
    }

    public void putLong(long l) {
    }
}

