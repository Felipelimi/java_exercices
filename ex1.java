import java.lang.*;
import java.util.*;
public class ex1 {
    public static void main(String[] args) {
        entrada();
    }

    public static void entrada(){
        Scanner scan = new Scanner(System.in);
        String palavra, palavraFinal = " ";
        int maiorQuantVogal = 0;

        while(true){
            System.out.println("Digite uma palavra (ou 'sair')");
            palavra = scan.nextLine();
            
            if(palavra.equals("sair")){
                break;
            } else {
                int quantVogal = quantVogal(palavra);
            
                if(quantVogal> maiorQuantVogal){
                    maiorQuantVogal = quantVogal;
                    palavraFinal = palavra;
                }
            }

        }

        System.out.println(palavraFinal);
    }

    
    public static int quantVogal(String palavra){
        char letra;
        int quantVogal = 0;
        String vogais = "AEIOUaeiou";

        for (int i = 0; i < palavra.length(); i++) {
            letra = palavra.charAt(i);

            if(vogais.indexOf(letra) != -1){
                quantVogal++;
            }
        }

        return quantVogal;
    }
}
