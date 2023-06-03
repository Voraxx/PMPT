package ranlib;

public class Faktorial {
    public static double fakultaet(int n){
        try {
            if(n==0){
                return 1;
            }
            for (int i = n; i > 1; i--){
                n = n*(i-1);
            }
        } catch (IllegalArgumentException e){
            System.out.print("Positive Zahl eingeben! Fakultät nicht für negative Zahlen definiert!");
            System.out.print(" Eingabe: " );
        }
        return n;
    }

    private static int fakultaetRekursiv(int n){
        try {
            if (n==0){
                return 1;
            }
            return n*fakultaetRekursiv(n-1);
        } catch (IllegalArgumentException e){
            System.out.print("Positive Zahl eingeben! Fakultät nicht für negative Zahlen definiert! ");
            System.out.print("Eingabe: " + n);
        }
        return n;
    }

    private static int fakultaetRekursiv02(int n){
        if(n<0){
            throw new IllegalArgumentException("Positive Zahl eingeben! Fakultät nicht für negative Zahlen definiert! Eingabe: " + n);
        }
        if(n==0){
            return 1;
        } else {
            return n* fakultaetRekursiv02(n-1);
        }
    }

    private static int fakultaetEndrekursiv(int n, int ergebnis){
        if (n==0){
            return 1;
        }
        return fakultaetEndrekursiv(n-1, ergebnis*n);
    }

    private static int fakultaetEndrekursiv02(int n, int ergebnis){
        if(n<0){
            throw new IllegalArgumentException("Positive Zahl eingeben! Fakultät nicht für negative Zahlen definiert!");
        }
        if (n==0){
            return ergebnis;
        }
        return fakultaetEndrekursiv02(n-1, ergebnis*n);
    }


    public static void main(String[] args) {
        //System.out.println(fakultaetRekursiv(0));    // return 1
        //System.out.println(fakultaetRekursiv(5));    // return 120
        //System.out.println(fakultaetRekursiv(-5));    // StackOverflow
        //System.out.println(fakultaetEndrekursiv(0)); // return 1
        //System.out.println(fakultaetEndrekursiv(5)); // return 120
        //System.out.println(fakultaetEndrekursiv(-5)); // IllegalArgumentException
        //System.out.println(fakultaet(0));            // return 1
        //System.out.println(fakultaet(5));            // return 120
        //System.out.println(fakultaetRekursiv(0));
        //System.out.println(fakultaetRekursiv(-1));
        //System.out.println(fakultaetRekursiv(5));
    }
}
