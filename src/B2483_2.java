import java.util.Arrays;
import java.util.Scanner;

public class B2483_2 {
    public static void main (String[] args){

        Scanner sc =  new Scanner (System.in);

        int n = sc.nextInt();
        char[] resp = new char[n];
        Arrays.fill(resp, 'a');

        System.out.print("Feliz nat");
        for (char c : resp){
            System.out.print(c);
        }
        System.out.println("l!");
    }
}