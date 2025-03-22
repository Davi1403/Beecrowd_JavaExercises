import java.util.Scanner;

public class B1018 {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int hundred = 0;
        int fifty = 0;
        int twenty = 0;
        int ten = 0;
        int five = 0;
        int two = 0;
        int one = 0;
        System.out.printf("%d%n",n);
        while (n != 0){
            if (n/100 != 0){
                hundred ++;
                n -= 100;
            }else if (n/50 !=0){
                fifty ++;
                n -=50;
            }else if (n/20 !=0){
                twenty ++;
                n -=20;
            }else if (n/10 !=0){
                ten ++;
                n -=10;
            }else if (n/5 !=0){
                five ++;
                n -=5;
            }else if (n/2 !=0){
                two ++;
                n -=2;
            }else {
                one ++;
                n -=1;
            }
        }

        System.out.printf("%d nota(s) de R$ 100,00%n%d nota(s) de R$ 50,00%n%d nota(s) de R$ 20,00%n%d nota(s) de R$ 10,00%n%d nota(s) de R$ 5,00%n%d nota(s) de R$ 2,00%n%d nota(s) de R$ 1,00%n", hundred,fifty,twenty,ten,five,two,one);
    }
}
