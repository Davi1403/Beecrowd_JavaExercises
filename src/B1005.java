import java.util.Scanner;
import java.util.Locale;

public class B1005{

	public static void  main (String[] args){
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		System.out.printf("MEDIA = %.5f%n " ,(a*3.5 + b*7.5) / 11);
	}

}