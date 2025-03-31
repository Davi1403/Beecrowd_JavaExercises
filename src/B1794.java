import java.util.Scanner;

public class B1794 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String resp = "possivel";

        for (int i = 0 ; i < 2 ; i++){
            int min = sc.nextInt();
            int max = sc.nextInt();
            if ( n<min || n>max) resp = "impossivel";
        }
        System.out.println(resp);
    }
}