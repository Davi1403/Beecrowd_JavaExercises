import java.util.Scanner;

public class B1010 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double total = 0;

        for (int i = 0; i<2; i++){
            int code = sc.nextInt();
            int n = sc.nextInt();
            double price  = sc.nextDouble();

            total += price * n;
        }
        System.out.printf("VALOR A PAGAR: R$ %.2f%n" ,  total);

    }
}
