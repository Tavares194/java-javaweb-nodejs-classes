import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/*
2. Escreva o código fonte de um programa Java leia o conteúdo do arquivo
“entrada.txt” em formato de bytes. O programa deve analisar cada byte lido do
arquivo, e gravar os bytes com valores maiores que 128 no arquivo “maior.txt”
e os bytes com valores menores ou iguais a 128 no arquivo “menor.txt”.
 */

public class Exercicio2 {
    public static void main(String[] args) {

        FileInputStream in = null;
        FileOutputStream maior = null;
        FileOutputStream menor = null;

        try {
            in = new FileInputStream("entrada.txt");
            maior = new FileOutputStream("maior.txt");
            menor = new FileOutputStream("menor.txt");

            int c;

            while( (c = in.read()) != -1 ){
                System.out.println(c);
                if(c > 128)
                    maior.write(c);
                else
                    menor.write(c);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
        finally{
            try{
                in.close();
                maior.close();
                menor.close();
            }  catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
