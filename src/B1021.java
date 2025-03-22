import java.util.Scanner;

public class B1021 {
    public static void main (String[] args){
        Scanner sc = new Scanner (System.in);

        float value = sc.nextFloat();
        int cents = (int) Math.round(value*100);


        int[] notes = {10000,5000,2000,1000,500,200};
        int[] coins = {100,50,25,10,5,1};

        System.out.println("NOTAS:");

        for (int note : notes){
            int quantity = cents/note;
            System.out.printf("%d nota(s) de R$ %.2f%n",quantity, note/ 100.0);
            cents %= note;
        }
        System.out.println("MOEDAS:");
        for (int coin : coins){
            int quantity = cents/coin;
            System.out.printf("%d moeda(s) de R$ %.2f%n",quantity,coin / 100.0);
            cents %= coin;
        }
    }
}
