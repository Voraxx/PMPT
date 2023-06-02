package pmpt_kap19_werte_referenz_object;

public class Anwendung {
    public static void main(String[] args) {
        DigitalerImpfpass impfpassMikeHansen =
                new DigitalerImpfpass("Mike", "Hansen", 1978);
        DigitalerImpfpass impfpassSusiSumpf =
                new DigitalerImpfpass("Susi", "Sumpf", 2001);
        DigitalerImpfpass impfpassZweiterMikeHansen =
                new DigitalerImpfpass("Mike", "Hansen", 1978);
        System.out.println("Mike1 = Susi?: " + impfpassMikeHansen.equals(impfpassSusiSumpf));
        System.out.println("Mike1 = Mike2?: " + impfpassMikeHansen.equals(impfpassZweiterMikeHansen));
        impfpassMikeHansen.addImpfung("Covid-19");
        System.out.println("Mike1 = Mike2?: " + impfpassMikeHansen.equals(impfpassZweiterMikeHansen));
    }
}
