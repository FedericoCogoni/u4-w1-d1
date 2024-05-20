public class Es3 {
    public static void main(String[] args) {
        System.out.println(" - Perimetro rettangolo : " + perimRett(10, 10) );
        System.out.println(" - 10 è pari? : "+ èParioDispari(10)); // Output: 0
        System.out.println(" - Area triangolo : " + areaTri(30, 30, 30));
    }
    public static double perimRett(double b, double h) {
        return (b + h) * 2;
    }
    public static int èParioDispari(int number) {
        return number % 2 == 0 ? 0 : 1;
    }
    public static double areaTri(double l1, double l2, double l3){
        double semiPeri = (l1 + l2 + l3) / 2;
        return Math.sqrt(semiPeri * (semiPeri - l1) * (semiPeri - l2) * (semiPeri - l3));
    }
}
