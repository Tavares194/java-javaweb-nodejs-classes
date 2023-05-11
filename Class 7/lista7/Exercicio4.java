import java.io.FileInputStream;
import java.io.IOException;

public class Exercicio4 {
    public static void main(String[] args) {
        try {
            FileInputStream in = new FileInputStream("pares.txt");
            FileInputStream in2 = new FileInputStream("impares.txt");
            
            int c;

            while ( (c = in.read()) != -1){
                System.out.println(c);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
