package lista8;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.StringTokenizer;

/*
4 – Faça um programa que leia 4 notas de um arquivo chamado “notas.txt”,
calcula a média destas notas, imprime a média destas notas e salva a
média no final deste mesmo arquivo.
 */

public class Exercicio4 {
    public static void main(String[] args) {
        FileReader in = null;
        FileWriter out = null;
        Double[] notas = new Double[5];
        Double media = 0.0;
        Integer i = 0;
        String leitura = "";

        try{
            in = new FileReader("notas.txt");

            int c;
            
            while((c = in.read()) != -1){
                leitura += (char)c;
            }


            StringTokenizer st = new StringTokenizer(leitura);

            while(st.hasMoreTokens()){
                notas[i] = Double.parseDouble(st.nextToken());
                i++;
            }

            for(i=0; i<4; ++i){
                media += notas[i];
            }

            media = media/4;
            String medias = media.toString();

            out = new FileWriter("notas.txt");
            out.write(leitura + "\n\nMédia: " + medias);
        }
        catch(IOException e){
            e.printStackTrace();
        }
        finally{
            try{
                in.close();
                out.close();
            }
            catch(IOException e){
                e.printStackTrace();
            }
        }
    }
}