import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Random;

/*
3. Escreva o código fonte de um programa Java que crie 10 números aleatórios
entre 1 e 100, ordene os valores de forma crescente, e grave os valores pares no
arquivo “pares.txt” e os número impares no arquivo “impares.txt”.
 */

public class Exercicio3 {
    public static void main(String[] args) {
        FileOutputStream par = null;
        FileOutputStream impar = null;
        Random rnd = new Random();
        int lista[] = new int[10];
        for(int i = 0; i < 10; ++i)
            lista[i] = rnd.nextInt(100) + 1;

        try {
            par = new FileOutputStream("pares.txt");
            impar = new FileOutputStream("impares.txt");
            
            int c;

            for(int i = 0; i < 10; ++i){
                c = lista[i];
                System.out.print(c + " ");
                if(c % 2 == 0)
                    par.write(c);
                else
                    impar.write(c);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
        finally{
            try{
                par.close();
                impar.close();
            }  catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
