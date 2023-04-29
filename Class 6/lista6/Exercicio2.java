package lista6;

import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.HashSet;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String frase = "";
        
        HashSet<String> palavras = new HashSet<String>();

        System.out.println("Digite uma frase: ");
        frase = scan.nextLine();
        
        StringTokenizer st = new StringTokenizer(frase);
        while( st.hasMoreTokens() ){
            palavras.add(st.nextToken());
        }
        System.out.println("O número de palavras não repitidas é de: " + palavras.size());
        
    }
}
