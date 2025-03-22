import java.util.Scanner;

public class B1020 {
    public static void  main (String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int day = 0;
        int month = 0;
        int year = 0;

        while (n != 0){
            if (n/365 != 0){
                year ++;
                n -= 365;
            }else if (n/30 != 0){
                month ++;
                n -= 30;
            }else {
                day ++;
                n --;
            }
        }
        System.out.printf("%d ano(s)%n%d mes(es)%n%d dia(s)%n",year,month,day);
    }
}
