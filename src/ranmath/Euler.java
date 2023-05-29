package ranmath;

public class Euler {

    public static double euler(int n){
        if(n==1){
            return 1;
        } else {
            return (double) 1 /fakultaet(n);
            //return  Math.pow( (1+(double)(1/n)), n);
        }
    }

    private static int fakultaet(int n){
        if(n==0){
            return 1;
        }
        for (int i = n; i > 1; i--){
            n = n*(i-1);
        }
        return n;
    }
}
