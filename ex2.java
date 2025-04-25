import java.lang.*;
import java.util.*;
public class ex2 {
    public static void main(String[] args) {
        entrada();
    }
    public static void entrada(){
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite uma palavra");
        String palavra = scan.nextLine().trim();
        String palavraInvertida = "";

        for (int i = 0; i < palavra.length(); i++) {
            char letraFinal = palavra.charAt(palavra.length() - (i + 1));

            palavraInvertida = palavraInvertida + letraFinal;
        }
        System.out.println(palavraInvertida);
    }
}
