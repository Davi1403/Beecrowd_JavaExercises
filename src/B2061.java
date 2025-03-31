import java.util.Scanner;

public class B2061 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int tab = sc.nextInt();
        int actions = sc.nextInt();

        for (int i = 0; i < actions; i++) {
            String action = sc.next();
            if (action.equals("fechou")) {
                tab ++;
            }else tab--;
        }
        System.out.println(tab);
    }
}
