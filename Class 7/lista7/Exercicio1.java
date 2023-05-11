import java.util.Scanner;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/*
1. Escreva o código fonte de um programa Java que solicite ao usuário o nome do
arquivo de leitura, utilizando o tratamento de exceções para arquivos que não
existem, caso o arquivo não exista o programa deve solicitar novamente ao
usuário o nome do arquivo de leitura. O programa deve solicitar o nome do
arquivo de leitura até receber um nome de arquivo que existe. Quando o
programa receber um nome de arquivo que existe, deve imprimir na tela do
computador os números inteiros que representam os bytes armazenados no
arquivo.

*/

public class Exercicio1 {

    public static void main(String[] args) {

        FileInputStream in = null;
        Scanner scan = new Scanner(System.in);
        String res = "";
        boolean confirm = false;

        do {
            confirm = false;
            System.out.print("Digite o nome do arquivo: ");
            res = scan.nextLine();

            try {
                in = new FileInputStream(res + ".txt");
    
                int c;
    
                while( (c = in.read()) != -1 ){
                    System.out.println(c);
                }
                
            } catch (IOException e) {
                System.out.println("Não foi encontrado o arquivo com nome \"" + res + ".txt\"\n\n");
                confirm = true;
            }
            finally{
                try{
                    in.close();
                }  catch (IOException e) {
                    e.printStackTrace();
                }
            }
        } while (confirm);
        scan.close();
    }
}