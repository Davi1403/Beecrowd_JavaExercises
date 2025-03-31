import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class B2483 {
    public static void main (String[] args){

        Scanner sc =  new Scanner (System.in);

        int n = sc.nextInt();
        char[] resp = new char[n];
        for (int i = 0; i < n ; i++){
            resp[i] = 'a';
        }

        System.out.print("Feliz nat");
        for (char c : resp){
            System.out.print(c);
        }
        System.out.println("l!");
    }
}
