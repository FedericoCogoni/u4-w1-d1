import java.util.Scanner;

public class Es3 {
    public static void main(String[] args) {
        System.out.print("Inserisci la base: ");
        Scanner scanner = new Scanner(System.in);
        double b = Double.parseDouble(scanner.nextLine());
        System.out.print("Inserisci l'altezza: ");
        double h = Double.parseDouble(scanner.nextLine());
        System.out.println(" - Perimetro rettangolo : " + perimRett(b, h) );
        System.out.print("Inserisci il numero: ");
        int number = Integer.parseInt(scanner.nextLine());
        System.out.println(" - 0 = pari, 1 = dispari : "+ ParioDispari(number)); // Output: 0
        System.out.print("Inserisci il lato 1: ");
        double l1 = Double.parseDouble(scanner.nextLine());
        System.out.print("Inserisci il lato 2: ");
        double l2 = Double.parseDouble(scanner.nextLine());
        System.out.print("Inserisci il lato 3: ");
        double l3 = Double.parseDouble(scanner.nextLine());
        System.out.println(" - Area triangolo : " + areaTri(l1, l2, l3));
        scanner.close();
    }
    public static double perimRett(double b, double h) {
        return (b + h) * 2;
    }
    public static int ParioDispari(int number) {
        return number % 2 == 0 ? 0 : 1;
    }
    public static double areaTri(double l1, double l2, double l3){
        double semiPeri = (l1 + l2 + l3) / 2;
        return Math.sqrt(semiPeri * (semiPeri - l1) * (semiPeri - l2) * (semiPeri - l3));
    }
}
