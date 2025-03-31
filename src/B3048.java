import java.util.Scanner;

public class B3048 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        int rep = sc.nextInt();
        int[] sequence = new int[rep+1];
        int resp = 0;
        for (int i = 0 ; i < rep ; i++) {
            sequence[i] = sc.nextInt();
        }

        if (sequence[rep-1] == 1) {
            sequence[rep] = 2;
        }else{
            sequence[rep] = 1;
        }

        for (int i = 0 ; i < rep ; i++) {
                if (sequence[i] != sequence[i + 1]) {
                    resp++;
                }
            }
        System.out.println(resp);
        }
}
