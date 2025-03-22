import java.util.Scanner;

public class B1168 {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);

        int test = sc.nextInt();
        String[] number = new String[test];
        String aux = "0123456789";
        int[] qtd = {6,2,5,5,4,5,6,3,7,6};
        int[] leds = new int[test];


        for (int i = 0; i < test; i++ ){
            number[i] = sc.next();
            char[] charArray = number[i].toCharArray();
            for (char c : charArray) {
                int k = aux.indexOf(c);
                leds[i] += qtd[k];
            }
        }

        for (int led : leds){
            System.out.println(led + " leds");
        }

    }
}
