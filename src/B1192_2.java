import java.util.Scanner;

public class B1192_2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int cases = sc.nextInt();
        int[] resp = new int[cases];

        for (int i = 0 ; i < cases ; i++){

            String enter = sc.next();

            int a = Character.getNumericValue(enter.charAt(0));
            int c = Character.getNumericValue(enter.charAt(2));
            char b = enter.charAt(1);

            if (a==c){
                resp[i] = a*c;
            }else if (b >= 'A' && b <= 'Z'){
                resp[i] = c-a;
            }else resp[i] = c+a;
        }
        for (int r : resp){
            System.out.println(r);
        }
    }
}
