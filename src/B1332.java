import java.util.Scanner;

public class B1332 {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);

        int cases = sc.nextInt();
        int[] resp = new int[cases];

        for (int i = 0 ; i < cases ; i++) {

            String enter = sc.next();

            if (enter.charAt(0) == 'o' && enter.charAt(1) == 'n' || enter.charAt(1) == 'n' && enter.charAt(2)== 'e' || enter.charAt(0) == 'o' && enter.charAt(2)== 'e') {
                resp[i] = 1;
            } else if (enter.charAt(0) == 't' && enter.charAt(1) == 'w' || enter.charAt(1) == 'w' && enter.charAt(2)== 'o' || enter.charAt(0) == 't' && enter.charAt(2)== 'o') {
                resp[i] = 2;
            } else resp[i] = 3;
        }
        for (int r : resp){
            System.out.println(r);
        }
    }
}
