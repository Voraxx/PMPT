package playground;

public class StringException extends Exception {
    private int schwellwert = 5;
    private int spannung;

    public StringException(int spannung){
        this.spannung = spannung;
    }

    public static void main(String[] args) {

    }
}
