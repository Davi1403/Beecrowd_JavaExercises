import java.util.Scanner;

public class B1013 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        int bigger = 0;

        for (int i = 0; i < 2; i++) {
            bigger = (a + b + Math.abs((a - b))) / 2;
            a = bigger;
            b = c;
        }
        System.out.printf("%d eh o maior%n",bigger);
    }
}
