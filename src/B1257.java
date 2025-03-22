import javax.swing.*;
import java.util.Scanner;

public class B1257 {
    public static void main (String[] args) {

        Scanner sc = new Scanner(System.in);

        //System.out.println("TESTS --> ");
        int tests = sc.nextInt();
        int[] soma = new int[tests];
        for (int i = 0; i < tests; i++) {
            //System.out.println("TEST --> ");
            int test = sc.nextInt();
            int k = 0;
            int j = 0;

            for (int a = 0; a < test; a++) {
                String text = " ";
                String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

                //System.out.println("STRING --> ");
                text = sc.next();
                char[] charArray= text.toCharArray();

                for (char c : charArray) {
                    //System.out.println("VALOR DE I =" + i);
                    soma[i] += (alphabet.indexOf(c) + k + j);
                    //System.out.printf("%n%c : %d + %d + %d",c,alphabet.indexOf(c),k,j);
                    //System.out.println(" = SOMA" + soma[i]);
                    j++;
                }
            k++;
            j = 0;

            }
        }
    for (int i = 0 ; i < tests ; i++) {
        System.out.println(soma[i]);
        }
    }
}
