package pmpt_playground;

public class ArrayFehlerException extends Exception {
    public ArrayFehlerException(int index){
        super("Ungültiger Index: " + index);
    }
}
