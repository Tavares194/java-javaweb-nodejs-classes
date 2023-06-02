package lista8;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/*
5 – Faça um programa utilizando o comando “for” que leia 10 números do
teclado e armazene estes 10 números em um arquivo chamado “num.txt”.
 */

public class Exercicio5 {
    public static void main(String[] args) {
        FileWriter out = null;
        Scanner scan = new Scanner(System.in);
        Double[] numeros = new Double[10];

        try {
            System.out.println("10 números para digitar\n");
            for (int i = 0; i < numeros.length; i++) {
                System.out.println("\nDigite um número qualquer: ");
                numeros[i] = scan.nextDouble();
            }

            out = new FileWriter("num.txt");

            for (int i = 0; i < numeros.length; i++) {
                out.write(numeros[i].toString() + " ");
            }
        } 
        catch (IOException e) {
            e.printStackTrace();
        } 
        finally {
            try {
                out.close();
            } 
            catch (IOException e) {
                e.printStackTrace();
            }
        }
        scan.close();
    }
}