import java.util.Scanner;

public class B1018_2 {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);

        int value = sc.nextInt();
        int[] notas = {100,50,20,10,5,2,1};

        System.out.println(value);
        for (int nota:notas){
            int quantity = value / nota;
            System.out.println(quantity + " nota(s) de R$ " + nota + ",00");
            value %= nota;
            }
        }
    }

