import java.util.Scanner;

public class B1019 {
    public static void main (String[] args){
        Scanner sc = new Scanner (System.in);

        int n = sc.nextInt();
        int seconds = 0;
        int minutes = 0;
        int hours = 0;

        while (n != 0){
            if (n/3600 != 0){
                hours ++;
                n -= 3600;
            }else if (n/60 != 0){
                minutes++;
                n -= 60;
            }else{
                seconds++;
                n--;
            }
        }
        System.out.printf("%d:%d:%d%n",hours,minutes,seconds);
    }
}
