package lista6;

import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.HashMap;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String frase = "";
        while()
        HashMap<String, Integer> palavras = new HashMap<String, Integer>();
        System.out.println("Digite uma frase: ");
        frase = scan.nextLine();
        
        StringTokenizer st = new StringTokenizer(frase);
        while( st.hasMoreTokens() ){
            if(palavras.containsKey(st)){
                palavras.put(st.nextToken(), 1 );
            }
            else{
                palavras.put(st.nextToken(), palavras.get(st) + 1);
            }
    
        }
        System.out.println("O número de palavras não repitidas é de: " + palavras.size());
        
    }
}
