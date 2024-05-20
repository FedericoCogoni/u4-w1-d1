import java.util.Arrays;
public class Es1 {
        public static void main(String[] args) {

            System.out.println("Il risultato della moltiplicazione è: " + mult(790, 700));
            System.out.println(concat("Ciao ", 9));

            String[] stringarray = AddInArray(new String[]{"Ciccio","Maura","Viola","Stefano","Riccardo"}, "NomedaAggiungere");
            System.out.println("Array modificato" + Arrays.toString(stringarray));

        }
        public static int mult(int num1, int num2) {
            return num1 * num2;
        }
        public static String concat(String word1, int num3) {
            return word1 + num3;
        }
    public static String[] AddInArray(String[] stringArray, String stringToAdd){
        String[] newArray = new String[6];
        newArray[0] = stringArray[0];
        newArray[1] = stringArray[1];
        newArray[2] = stringArray[2];
        newArray[3] = stringToAdd;
        newArray[4] = stringArray[3];
        newArray[5] = stringArray[4];
        return newArray;
    }
}
