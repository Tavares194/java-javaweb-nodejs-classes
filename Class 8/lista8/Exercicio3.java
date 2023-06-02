package lista8;

import java.io.FileReader;
import java.io.IOException;

/*
3 – Escreva um programa em linguagem de programação Java que faça a
leitura de um arquivo em formato texto. O programa deve informar a
quantidade de vogais, a quantidade de consoantes e a quantidade de
caracteres encontradas no arquivo em formato texto.
 */

public class Exercicio3 {
    public static void main(String[] args) {
    FileReader in = null;
    Integer vogal = 0;
    Integer consoante = 0;
    Integer outros = 0;

    try{
        in = new FileReader("exercicio3.txt");

        int c;

        while((c = in.read()) != -1){
            Character caracter = (char)c;
            caracter = Character.toLowerCase(caracter);
            
            if(caracter == 'a' || caracter == 'e' || caracter == 'i' || caracter == 'o' || caracter == 'u'){
            vogal++;
            }
            else if(caracter >= 'a' && caracter<='z'){
            consoante++;
            }
            else{
            outros++;
            }
        }
    }
    catch(IOException e){
        e.printStackTrace();
    }
    finally{
        try{
            in.close();
        }
        catch(IOException e){
            e.printStackTrace();
        }
    }
    System.out.println("Vogal = " + vogal + "\nConsoante: " + consoante + "\nOutros: " + outros);
    }
}
