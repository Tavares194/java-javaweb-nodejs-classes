package lista6;

import java.util.Scanner;
import java.util.HashMap;

public class Exercicio1 {
    public static void main(String[] args) {
        
        HashMap<String, Integer> cidades = new HashMap<String, Integer>();
        Scanner scan = new Scanner(System.in);
        String recebe = "";

        do{
            
            System.out.println("Digite o nome de uma cidade (Caso queira encerrar, aperte enter): ");
            recebe = scan.nextLine();
            if(!recebe.isBlank())            
            cidades.put(recebe, recebe.length());

        }
        while( ! recebe.isBlank() );
        
        for(String exibe : cidades.keySet()){
            System.out.println( exibe + " - " + cidades.get(exibe));
        }
        
    }
}
