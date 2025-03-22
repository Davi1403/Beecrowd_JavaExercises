import java.util.Scanner;

public class B1017 {
    public static void main (String[] args){
        Scanner sc = new Scanner (System.in);

        int t = sc.nextInt();
        int v = sc.nextInt();

        float resp = (float) (t * v) / 12;

        System.out.printf("%.3f%n", resp);
    }
}
