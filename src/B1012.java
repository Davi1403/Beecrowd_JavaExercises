import java.util.Scanner;

public class B1012 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        float a =  sc.nextFloat();
        float b = sc.nextFloat();
        float c = sc.nextFloat();

        float r1 = a * c /2 ;
        double r2 = (double) 3.14159 * (c * c);
        float r3 = (a+b)/2 * c ;
        float r4 = b * b;
        float r5 = a * b;

        System.out.printf("TRIANGULO: %.3f%nCIRCULO: %.3f%nTRAPEZIO: %.3f%nQUADRADO: %.3f%nRETANGULO: %.3f%n", r1, r2, r3, r4, r5);
    }
}
