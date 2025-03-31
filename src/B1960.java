import java.sql.SQLOutput;
import java.util.Scanner;

public class B1960 {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);

        char[] romans = {'I','V','X','L','C','D','M'};

        int enter = sc.nextInt();
        int one = enter%10;enter-=one;
        int ten = enter%100;enter-=ten;

        while (enter != 0) {
            if (enter == 1000) {
                System.out.print(romans[6]);
            } else if (enter >=900){
                System.out.print(romans[4] + "" + romans[6]);
                enter -= 900;
            } else if (enter >= 500) {
                System.out.print(romans[5]);
                enter -= 500;
            } else if (enter >= 400) {
                System.out.print(romans[4]+ "" + romans[5]);
                enter -= 400;
            }else if (enter >= 100){
                System.out.print(romans[4]);
                enter -= 100;
            }
        }

        while (ten != 0) {
            if (ten >= 90){
                System.out.print(romans[2] + "" + romans[4]);
                ten -= 90;
            } else if(ten >= 50) {
                System.out.print(romans[3]);
                ten -= 50;
            } else if (ten >= 40){
                System.out.print(romans[2] + "" + romans[3]);
                ten -=40;
            } else if (ten >= 10) {
                System.out.print(romans[2]);
                ten -= 10;
            }
        }

        while (one != 0){
            if (one >= 9){
                System.out.print(romans[0] + "" + romans[2]);
                one -= 9;
            } else if (one >=5){
                System.out.print(romans[1]);
                one -= 5;
            }else if (one>=4){
                System.out.print(romans[0] + "" + romans[1]);
                one -=4;
            } else{
                System.out.print(romans[0]);
                one --;
            }
        }
        System.out.println("");
    }
}
