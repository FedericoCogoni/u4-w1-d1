import java.util.Scanner;
public class Es2 {
    public static void main(String[] args){
        words();
    }
    public static void words(){
        System.out.print("Inserisci la prima parola: ");
        Scanner scanner = new Scanner(System.in);
        String word1 = scanner.nextLine();
        System.out.print("Inserisci la seconda parola: ");
        String word2 = scanner.nextLine();
        System.out.print("Inserisci la terza parola: ");
        String word3 = scanner.nextLine();
        String concatWords = Concat(word1, word2, word3);
        System.out.println(concatWords);
        String concatWordsReverse = Concat(word3, word2, word1);
        System.out.println(concatWordsReverse);
    }
    public static String Concat(String word1, String word2, String word3){
        return word1+" "+word2+" "+word3;
    }
}
