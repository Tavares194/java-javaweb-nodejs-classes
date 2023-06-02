package lista8;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/*
1 – Escreva o código fonte de um programa Java que leia uma mensagem
enviada pelo usuário através do teclado e faça a gravação dos caracteres da
mensagem em um arquivo em formato de texto.
 */

public class Exercicio1{
    public static void main(String[] args) {
        FileWriter out = null;
        Scanner scan = new Scanner(System.in);
        String mensagem = null;

        System.out.println("Digite sua mensagem: ");
        mensagem = scan.nextLine();

        try{
            out = new FileWriter("mensagem.txt");

            for(int i = 0; i<mensagem.length(); i++){
                out.write(mensagem.charAt(i));
            }
        }
        catch(IOException e){
            e.printStackTrace();
        }
        finally{
            try{
                out.close();
            }
            catch (IOException e){
            e.printStackTrace();
            }
        }
        scan.close();
    }
}
