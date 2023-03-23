package lista4;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class Exercicio1 {
    //Essa classe consiste exclusivamente em métodos estáticos que operam ou retornam coleções.
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        ArrayList<Integer> lista = new ArrayList<Integer>();
        
        System.out.println("Digite um número: ");
        lista.add(scan.nextInt());

        System.out.println("Digite outro número: ");
        lista.add(scan.nextInt());

        System.out.println("Digite mais um número: ");
        lista.add(scan.nextInt());

        Collections.sort(lista);
        System.out.println("\nLista ordenada: ");

        for(Integer x : lista)
        System.out.println(x);
    }
}
