import java.util.Scanner;

public class B2414 {
    public static void main(String[] args) {
        int n2 = 0;
        int biggest = 0;
        Scanner sc = new Scanner(System.in);

        while (true) {
            int n1 = sc.nextInt();

            if (n1 == 0) break;
            if (n1 > n2) {
                biggest = n1;
                n2 = n1;
            }
        }
        System.out.println(biggest);
    }
}
