import java.util.Scanner;

public class B1192 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] resp = new int[n];
        char[] alphabet = {
                'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M',
                'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'
        };
        char[] numbers = {'1','2','3','4','5','6','7','8','9'};

        for (int i = 0; i < n; i++) {

            String enter = sc.next();
            char[] separete = enter.toCharArray();
            int a = 0;
            int c = 0;
            char b = separete[1];
            boolean aux = false;



            for (int j = 0 ; j < 9 ; j++){
                if (numbers[j] == separete[0]) {
                    a = j + 1;
                    }
                if (numbers[j] == separete[2]) {
                    c = j + 1;
                }
            }

            if (a==c){
                resp[i] = a*c;
                aux = true;
            }else {
                for (char alpha : alphabet){
                    if (b == alpha){
                        resp[i] = c-a;
                        aux = true;
                    }
                }
            }
            if (!aux){
                resp[i] = c+a;
            }
        }

        for (int i : resp){
            System.out.println(i);
        }
    }
}
