package kap15_string_junit;

public class Strings {

    private int indexOf(String text, char zeichen) {
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == zeichen) {
                return i;
            }
        }
        return -1;
    }

    private String trimVorne(String text) {
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) != ' ') {
                return text.substring(i);
            }
        }
        return "";
    }

    private String veraendern(String text) {
        return text.trim()
                .replace("e", "E")
                + text.length();
    }

    private boolean sindGleich(String text1, String text2) {
        if (text1 == null || text2 == null) {
            throw new IllegalArgumentException("Eingabe darf nicht null sein");
        }
        return text1.contains(text2) && text2.contains(text1);
    }

    public static void main(String[] args) {
        String name = "Inge";
        int id = 23;
        double wert = 3.1415;
        System.out.format("%s (%d): %.2f", name, id, wert);
    }
}
