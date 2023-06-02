package pmpt_kap18_vererbung;

/**
 * In dieser Anwendung kann mit den unterschiedlichen Computern experimentiert werden.
 */
public class Anwendung {
  public static void main(String[] args) {
    Computer computer = new Computer("08/15-Computer");
    computer.berechnen("Welt-Frage");
    computer = new DesktopComputer();
    computer.berechnen("Sinn des Lebens");
    computer = new Smartphone();
    computer.berechnen("7x8");
    computer = new Smartwatch();
    computer.berechnen("Bin ich schön?");
    System.out.println("Puls: " + ((Smartwatch) computer).getPuls());
  }
}
