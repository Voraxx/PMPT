package pmpt_kap12_modifizierer_static_rekursion;

public class Umdrehen {
    public String umdrehenIterativ(String text) {
        if (text == null) {
            throw new IllegalArgumentException("ungültige Eingabe.");
        }

        String ergebnis = "";
        for (int i = 0; i < text.length(); i++) {
            ergebnis = text.charAt(i) + ergebnis;
        }
        return ergebnis;
    }

    public String umdrehenRekursiv(String text) {
        if (text == null) {
            throw new IllegalArgumentException("ungültige Eingabe.");
        }
        if (text.length() == 0) {
            return "";
        }
        return umdrehenRekursiv(text.substring(1)) + text.charAt(0);
    }

    public static void main(String[] args) {
        Umdrehen umdrehen = new Umdrehen();
        System.out.println(umdrehen.umdrehenIterativ("Hallo Welt"));
        System.out.println(umdrehen.umdrehenRekursiv("Hallo Welt"));
    }
}
