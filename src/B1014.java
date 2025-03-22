import java.util.Scanner;

public class B1014{
	public static void main (String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		float y = sc.nextFloat();
		
		System.out.printf("%.3f km/l", x/y);
	}

}