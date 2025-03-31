import java.util.Scanner;

public class Uppercase {
    public static void main (String[] args){

        Scanner sc = new Scanner(System.in);

        char a = sc.next().charAt(0);

        if (a >= 'A' && a <= 'Z'){
            System.out.println("Uppercase");
        }else System.out.println("Tidy");
    }
}
