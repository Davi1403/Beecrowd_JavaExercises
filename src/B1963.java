import java.sql.SQLOutput;
import java.util.Scanner;

public class B1963 {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);

        float a = sc.nextFloat();
        float b = sc.nextFloat();

        float resp = ((b-a)*100) / a;
        System.out.printf("%.2f", resp);
        System.out.println("%");
    }
}
