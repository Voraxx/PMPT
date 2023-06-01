package playground;

public class ExceptionTests {
    public int getWert(int[] intArray, int index) throws ArrayFehlerException {
        if(index < 0 || index >= intArray.length){
            throw new ArrayFehlerException(index);
        }
        return intArray[index];
    }

    public static void main(String[] args) {
        ExceptionTests exceptionTests = new ExceptionTests();
        int[] daten = {1,2,3,4};
        try {
            System.out.println(exceptionTests.getWert(daten, 2));
            System.out.println(exceptionTests.getWert(daten, 5));
        } catch (ArrayFehlerException e){
            System.out.println("Fehler: " + e.getMessage());
        }
    }
}
